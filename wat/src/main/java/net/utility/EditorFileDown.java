package net.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

public class EditorFileDown extends AbstractView {

   public EditorFileDown() {
      setContentType("application/download; charset=utf8");
   }

   @SuppressWarnings("unchecked")
   @Override
   protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest req, HttpServletResponse resp)
         throws Exception {
      Map<String, Object> fileInfo = (Map<String, Object>) model.get("downloadFile");
      // String filePath = (String) fileInfo.get("filePath");
      String filePath = "/wat/upload/board/files/";
      String fileRealName = (String) fileInfo.get("fileRealName");
      String fileName = (String) fileInfo.get("filename");

      File file = new File(filePath, fileName);
      resp.setContentType(getContentType());
      resp.setContentLength((int) file.length());

      String resFileName = URLEncoder.encode(fileRealName, "utf-8");

      resp.setHeader("Content-Disposition", "attachment; filename=\"" + resFileName + "\";");
      resp.setHeader("Content-Transfer-Encoding", "binary");

      OutputStream out = resp.getOutputStream();

      FileInputStream fis = null;
      try {
         fis = new FileInputStream(file);
         FileCopyUtils.copy(fis, out);
      } finally {
         if (fis != null)
            try {
               fis.close();
            } catch (IOException ex) {
               System.out.println(ex);
            }
      }
      out.flush();

   }
}