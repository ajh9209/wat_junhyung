package com.ppp.wat.col;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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
/*	@RequestMapping("/col/list.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("col/list");
		ArrayList<ColDTO> list = dao.list();
		mav.addObject("list", list);
		return mav;
	}// list() end */

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
		ArrayList<ColDTO>list =dao.replyList(b_no);
		mav.addObject("dto", dto);
		mav.addObject("list", list);
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
	
	@RequestMapping(value = "/col/replyCreate.do", method = RequestMethod.POST)
	public ModelAndView replyCreate(ColDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/col/read.do?b_no=" + dto.getB_no()); // /col/read.do
		int res = dao.replyCreate(dto);
		return mav;
	}// replyCreate
	
	
	@RequestMapping(value = "/col/replyDelete.do", method = RequestMethod.GET)
	public ModelAndView replyDeleteForm(ColDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/col/replyDelete");
		mav.addObject("dto", dto);
		System.out.println("r_bno: " + dto.getR_bno());
		return mav;
	}// replyDelete() end
	
	@RequestMapping(value = "/col/replyDelete.do", method = RequestMethod.POST)
	public ModelAndView replyDeleteProc(ColDTO dto) {
		ModelAndView mav = new ModelAndView();
		int res = dao.replyDelete(dto.getR_no());
		mav.setViewName("redirect:/col/read.do?b_no=" + dto.getR_bno()); // /col/read.do
		return mav;
	}// replyDeleteProc() end
	

	@RequestMapping("/col/list.do")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("col/list");

		// 검색
		String sch_type = request.getParameter("sch_type");
		String sch_value = request.getParameter("sch_value");

		System.out.println("Cont sch_type : " + sch_type);
		System.out.println("Cont sch_value : " + sch_value);

		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("sch_type", sch_type);
		hashMap.put("sch_value", sch_value);


		ArrayList<ColDTO> list = dao.list_search(hashMap); //검색
		
		Iterator<ColDTO> iter = list.iterator();
		while(iter.hasNext() == true){
			ColDTO dto = iter.next();
			dto.setB_newdate(dto.getB_newdate().substring(0,10));
		}
		
		mav.addObject("list", list);

		System.out.println("list : " + list);
		
		return mav;
	}// list() end


	
}
