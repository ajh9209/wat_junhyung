package com.ppp.wat.qna;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ppp.wat.col.ColDTO;
import com.ppp.wat.qna.QnaDTO;

@Controller
public class QnaCont {

	@Autowired
	private QnaDAO dao;

	public QnaCont() {
		System.out.println("QnaCont() 객체 생성됨");
	}

	// 결과확인 http://localhost:9090/qna/list.do
	@RequestMapping("/qna/list.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("qna/list");
		ArrayList<QnaDTO> list = dao.list();
		mav.addObject("list", list);
		return mav;
	}// list() end

	@RequestMapping(value = "/qna/create.do", method = RequestMethod.GET)
	public ModelAndView createForm(QnaDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/qna/createForm"); // /qna/createForm.jsp
		mav.addObject("b_no", dto.getB_no()); // 부모그룹번호
		return mav;
	}// createForm() end

	@RequestMapping(value = "/qna/create.do", method = RequestMethod.POST)
	public ModelAndView createProc(QnaDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		int count = dao.create(dto);
		mav.setViewName("redirect:/qna/list.do"); // /qna/list.do
		return mav;
	}// createProc() end

	@RequestMapping(value = "/qna/read.do", method = RequestMethod.GET)
	public ModelAndView read(int b_no, HttpServletRequest req) {	
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/qna/read"); // /qna/read.jsp
			QnaDTO dto = dao.read(b_no);
			ArrayList<QnaDTO>list =dao.replyList(b_no);
			mav.addObject("dto", dto);
			mav.addObject("list", list);
			return mav;
	}// read() end

	@RequestMapping(value = "/qna/delete.do", method = RequestMethod.GET)
	public ModelAndView deleteForm(QnaDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/qna/deleteForm");
		dto = dao.read(dto.getB_no()); // 파일 삭제를 위한 dto 재구성
		mav.addObject("dto", dto);
		return mav;
	}// deleteForm() end

	@RequestMapping(value = "/qna/delete.do", method = RequestMethod.POST)
	public ModelAndView deleteProc(QnaDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/qna/list"); 
		int res = dao.delete(dto.getB_no());
		return mav;
	}// deleteProc() end

	@RequestMapping(value = "/qna/update.do", method = RequestMethod.GET)
	public ModelAndView updateForm(QnaDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/qna/updateForm"); // /qna/updateForm.jsp
		dto = dao.read(dto.getB_no()); // 파일 삭제를 위한 dto 재구성
		mav.addObject("dto", dto);
		return mav;
	}// updateForm() end

	@RequestMapping(value = "/qna/update.do", method = RequestMethod.POST)
	public ModelAndView updateProc(QnaDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/qna/read.do?b_no=" + dto.getB_no()); // /qna/list.do
		int res = dao.update(dto);
		return mav;
	}// updateProc() end

	@RequestMapping(value = "/qna/replyCreate.do", method = RequestMethod.POST)
	public ModelAndView replyCreate(QnaDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/qna/read.do?b_no=" + dto.getB_no()); // /qna/read.do
		int res = dao.replyCreate(dto);
		return mav;
	}// replyCreate
	
	
	@RequestMapping(value = "/qna/replyDelete.do", method = RequestMethod.GET)
	public ModelAndView replyDeleteForm(QnaDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/qna/replyDelete");
		mav.addObject("dto", dto);
		System.out.println("r_bno: " + dto.getR_bno());
		return mav;
	}// replyDelete() end
	
	@RequestMapping(value = "/qna/replyDelete.do", method = RequestMethod.POST)
	public ModelAndView replyDeleteProc(QnaDTO dto) {
		ModelAndView mav = new ModelAndView();
		int res = dao.replyDelete(dto.getR_no());
		mav.setViewName("redirect:/qna/read.do?b_no=" + dto.getR_bno()); // /qna/read.do
		return mav;
	}// replyDeleteProc() end
}

