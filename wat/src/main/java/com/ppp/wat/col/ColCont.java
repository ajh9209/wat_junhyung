package com.ppp.wat.col;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ColCont {

	@Autowired
	private ColDAO dao;

	public ColCont() {
		System.out.println("ColCont() 객체 생성됨");
	}

	// 결과확인 http://localhost:9090/col/list.do
	@RequestMapping("/col/list.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("col/list");
		ArrayList<ColDTO> list = dao.list();
		mav.addObject("list", list);
		return mav;
	}// list() end

	@RequestMapping(value = "/col/create.do", method = RequestMethod.GET)
	public ModelAndView createForm(ColDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/col/createForm"); // /col/createForm.jsp
		mav.addObject("b_no", dto.getB_no()); // 부모그룹번호
		return mav;
	}// createForm() end

	@RequestMapping(value = "/col/create.do", method = RequestMethod.POST)
	public ModelAndView createProc(ColDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		int count = dao.create(dto);
		mav.setViewName("redirect:/col/list.do"); // /col/list.do
		return mav;
	}// createProc() end

	@RequestMapping(value = "/col/read.do", method = RequestMethod.GET)
	public ModelAndView read(int b_no, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/col/read"); // /col/read.jsp
		ColDTO dto = dao.read(b_no);
		mav.addObject("dto", dto);
		return mav;
	}// read() end

	@RequestMapping(value = "/col/delete.do", method = RequestMethod.GET)
	public ModelAndView deleteForm(ColDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/col/deleteForm");
		dto = dao.read(dto.getB_no()); // 파일 삭제를 위한 dto 재구성
		mav.addObject("dto", dto);
		return mav;
	}// deleteForm() end

	@RequestMapping(value = "/col/delete.do", method = RequestMethod.POST)
	public ModelAndView deleteProc(ColDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/col/list"); 
		int res = dao.delete(dto.getB_no());
		return mav;
	}// deleteProc() end

	@RequestMapping(value = "/col/update.do", method = RequestMethod.GET)
	public ModelAndView updateForm(ColDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/col/updateForm"); // /col/updateForm.jsp
		dto = dao.read(dto.getB_no()); // 파일 삭제를 위한 dto 재구성
		mav.addObject("dto", dto);
		return mav;
	}// updateForm() end

	@RequestMapping(value = "/col/update.do", method = RequestMethod.POST)
	public ModelAndView updateProc(ColDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/col/read.do?b_no=" + dto.getB_no()); // /col/list.do
		int res = dao.update(dto);
		return mav;
	}// updateProc() end

}
