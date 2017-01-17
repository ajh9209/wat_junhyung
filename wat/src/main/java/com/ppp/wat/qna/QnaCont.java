package com.ppp.wat.qna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
/*	@RequestMapping("/qna/list.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("qna/list");
		ArrayList<QnaDTO> list = dao.list();
		mav.addObject("list", list);
		return mav;
	}// list() end */

	@RequestMapping(value = "/qna/create.do", method = RequestMethod.GET)
	public ModelAndView createForm(QnaDTO dto, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		//로그인 세션 
		HashMap loginInfo = (HashMap)(session.getAttribute("loginInfo"));
		mav.addObject("loginId", loginInfo.get("m_id"));
		
		mav.setViewName("/qna/createForm"); // /qna/createForm.jsp
		mav.addObject("b_no", dto.getB_no()); // 부모그룹번호
		return mav;
	}// createForm() end

	@RequestMapping(value = "/qna/create.do", method = RequestMethod.POST)
	public ModelAndView createProc(QnaDTO dto, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		//로그인 세션
		HashMap loginInfo = (HashMap) (session.getAttribute("loginInfo"));
		dto.setB_id(loginInfo.get("m_id").toString());
		
		int count = dao.create(dto);
		mav.setViewName("redirect:/qna/list.do"); // /qna/list.do
		return mav;
	}// createProc() end

	@RequestMapping(value = "/qna/read.do", method = RequestMethod.GET)
	public ModelAndView read(int b_no) {	
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
	public ModelAndView deleteProc(QnaDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/qna/list.do");
		int res = dao.delete(dto.getB_no());
		return mav;
	}// deleteProc() end

	@RequestMapping(value = "/qna/update.do", method = RequestMethod.GET)
	public ModelAndView updateForm(QnaDTO dto, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/qna/updateForm"); // /qna/updateForm.jsp
		HashMap loginInfo = (HashMap)(session.getAttribute("loginInfo"));
	    mav.addObject("loginId", loginInfo.get("m_id"));
		
		dto = dao.read(dto.getB_no()); // 파일 삭제를 위한 dto 재구성
		mav.addObject("dto", dto);
		return mav;
	}// updateForm() end
	
	//추천수
			@RequestMapping(value="/qna/recommend.do", method=RequestMethod.GET)
			  public ModelAndView recommend(int b_no) {
			    ModelAndView mav = new ModelAndView();
			   // mav.setViewName("qna/recommend");	    		
			    int count = dao.recommend(b_no);
			   	
			    mav.setViewName("redirect:/qna/read.do?b_no=" + b_no);
			    return mav;        
			  }//recommendCount() end

	@RequestMapping(value = "/qna/update.do", method = RequestMethod.POST)
	public ModelAndView updateProc(QnaDTO dto) {
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
	
	//댓글삭제
	@RequestMapping(value="/qna/replyDelete.do", method=RequestMethod.GET)
	  public ModelAndView replyDelete(QnaDTO dto) {
	    ModelAndView mav = new ModelAndView();
	    int count = dao.replyDelete(dto.getR_no());
	   	
	    mav.setViewName("redirect:/qna/read.do?b_no=" + dto.getR_bno());
	    return mav;        
	  }//replyDelete() end

	
	
	
	/*@RequestMapping(value = "/qna/replyDelete.do", method = RequestMethod.GET)
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
*/	
	@RequestMapping(value = "/qna/rlpCreate.do", method = RequestMethod.GET)
	public ModelAndView rlpCreateForm(QnaDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/qna/rlpCreateForm"); // /qna/createForm.jsp
		mav.addObject("b_no", dto.getB_no()); // 부모그룹번호
		mav.addObject("b_origin", dto.getB_origin()); // 부모그룹번호
		mav.addObject("b_reply", dto.getB_reply()); // 부모그룹번호
		return mav;
	}// rlpCreateForm() end

	@RequestMapping(value = "/qna/rlpCreate.do", method = RequestMethod.POST)
	public ModelAndView rlpCreateProc(QnaDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		int count = dao.rlpCreate(dto);
		mav.setViewName("redirect:/qna/list.do"); // /qna/list.do
		return mav;
	}// rlpCreateProc() end
	
	@RequestMapping("/qna/list.do")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("qna/list");
		
	// 검색
	String sch_type = request.getParameter("sch_type");
	String sch_value = request.getParameter("sch_value");
	
	QnaDTO dto = new QnaDTO();
	dto.setSch_type(sch_type);
	dto.setSch_value(sch_value);
	mav.addObject("sch_type",sch_type);
	mav.addObject("sch_value",sch_value);

	System.out.println("Cont sch_type : " + sch_type);
	System.out.println("Cont sch_value : " + sch_value);

	
	
	int totalRecord = dao.count(dto); //레코드 총 갯수
	
	/////////////////////////////////////////////////////////////////////////////////
	// int nowPage;				//현재 클릭 페이지
	// if(dto.getNowPage() != 0) ]
	int nowPage=0;
	if(request.getParameter("nowPage")==null) {
		nowPage = 1;
	}else {
	
	nowPage = Integer.parseInt(request.getParameter("nowPage"));
	}
	
	// recordPerPage pagePerBlock는 같아야함 
	int recordPerPage = 5; 			//페이지당 레코드 수
	int pagePerBlock = 5;			//블럭당 페이지 수 
	int totalPage = (int)(Math.ceil((double)totalRecord/recordPerPage)); // 전체 페이지
	int totalGrp = (int)(Math.ceil((double)totalPage/pagePerBlock));// 전체 그룹
	int nowGrp = (int)(Math.ceil((double)nowPage/pagePerBlock));    // 현재 그룹 
	int startPage = ((nowGrp - 1) * recordPerPage) + 1; // 특정 그룹의 페이지 목록 시작 
	int endPage = totalRecord/recordPerPage+1;
	if(totalRecord%recordPerPage == 0){
		endPage = totalRecord/recordPerPage;
	}	            // 특정 그룹의 페이지 목록 종료  
	  
	// 10: 페이지당 출력할 레코드 갯수 (본인이 가지고있는 줄 갯수를 가지고 시뮬레이션 해봐야함)
	dto.setStartRow(((nowPage-1) * recordPerPage) + 1); // (0 * 10) + 1 = 1, 11, 21
	dto.setEndRow(nowPage * recordPerPage);             // 1 * 10 = 10, 20, 30
	System.out.println("startRow: " + dto.getStartRow());
	System.out.println("EndRow: " + dto.getEndRow());
	
ArrayList<QnaDTO> list = dao.list_search(dto); //검색
	
	Iterator<QnaDTO> iter = list.iterator();
	while(iter.hasNext() == true){
		dto = iter.next();
		dto.setB_newdate(dto.getB_newdate().substring(0,10));
	}
	/////////////////////////////////////////////////////////////////////////////////
	int BnowPage = (nowGrp-1) * pagePerBlock; // 10개 이전 페이지로 이동
	int NnowPage = (nowGrp * pagePerBlock)+1; // 10개 다음 페이지로 이동
	
	////////////////////////////////////////////////////////////////////////////////		
	mav.addObject("nowPage",nowPage );
	mav.addObject("recordPerPage",recordPerPage );
	mav.addObject("pagePerBlock",pagePerBlock );
	mav.addObject("totalPage",totalPage );
	mav.addObject("totalGrp",totalGrp );
	mav.addObject("nowGrp",nowGrp );
	mav.addObject("startPage",startPage );
	mav.addObject("endPage", endPage);

	mav.addObject("BnowPage",BnowPage);
	mav.addObject("NnowPage",NnowPage);
	
//	mav.addObject("startRow",dto.getStartRow());
//	mav.addObject("endRow",dto.getEndRow());
	
	mav.addObject("totalRecord", totalRecord);	
	
	mav.addObject("list", list);

	System.out.println("list : " + list);
	
	return mav;
}// list() end
	
	
}

