package com.ppp.wat.sproject;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SprojectCont {

	@Autowired
	private SprojectDAO dao;

	public SprojectCont() {
		System.out.println("SprojectCont() °´Ã¼ »ý¼ºµÊ");
	}

	// °á°úÈ®ÀÎ http://localhost:9090/wat/sproject/list.do
	@RequestMapping("/sproject/list.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("sproject/list");
		ArrayList<SprojectDTO> list = dao.list();
		mav.addObject("list", list);
		return mav;
	}// list() end

	@RequestMapping(value = "/sproject/create.do", method = RequestMethod.GET)
	public ModelAndView createForm(SprojectDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sproject/createForm");
		mav.addObject("sp_no", dto.getSp_no());
		return mav;
	}// createForm() end

	@RequestMapping(value = "/sproject/create.do", method = RequestMethod.POST)
	public ModelAndView createProc(SprojectDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		int count = dao.create(dto);
		mav.setViewName("redirect:/sproject/list.do");
		mav.addObject("count", count);
		return mav;
	}// createProc() end

	@RequestMapping(value = "/sproject/read.do", method = RequestMethod.GET)
	public ModelAndView read(int sp_no, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sproject/read");
		SprojectDTO dto = dao.read(sp_no);
		mav.addObject("dto", dto);
		return mav;
	}// read() end

	@RequestMapping(value = "/sproject/delete.do", method = RequestMethod.GET)
	public ModelAndView deleteForm(SprojectDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sproject/deleteForm");
		dto = dao.read(dto.getSp_no());
		mav.addObject("dto", dto);
		return mav;
	}// deleteForm() end


	@RequestMapping(value = "/sproject/delete.do", method = RequestMethod.POST)
	public ModelAndView deleteProc(SprojectDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sproject/list");
		int res = dao.delete(dto.getSp_no());
		return mav;
	}// deleteProc() end

	@RequestMapping(value = "/sproject/update.do", method = RequestMethod.GET)
	public ModelAndView updateForm(SprojectDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sproject/updateForm");
		dto = dao.read(dto.getSp_no());
		mav.addObject("dto", dto);
		return mav;
	}// updateForm() end

	@RequestMapping(value = "/sproject/update.do", method = RequestMethod.POST)
	public ModelAndView updateProc(SprojectDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/sproject/read.do?sp_no=" + dto.getSp_no());
		int res = dao.update(dto);
		return mav;
	}// updateProc() end

}
