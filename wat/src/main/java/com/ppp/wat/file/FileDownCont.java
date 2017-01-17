package com.ppp.wat.file;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileDownCont {

	 public FileDownCont() {
	      System.out.println("-- FileDownCont() °´Ã¼ »ý¼ºµÊ");
	   }
	   
	   @RequestMapping(value="/editorFileDown.do")
	   public ModelAndView editorFileDown(HttpServletRequest req
	         , ModelMap model) throws Exception {
	      System.out.println("filePath: " + req.getParameter("filePath"));
	      System.out.println("fileRealName: " + req.getParameter("fileRealName"));
	      System.out.println("filename: " + req.getParameter("filename"));
	      
	      Map<String, Object> fileInfo = new HashMap<String, Object>();
	      
	      fileInfo.put("filePath", req.getParameter("filePath"));
	      fileInfo.put("fileRealName", req.getParameter("fileRealName"));
	      fileInfo.put("filename", req.getParameter("filename"));
	      
	      return new ModelAndView("editorFileDown", "downloadFile", fileInfo);
	   }
	
}
