package com.ppp.wat.memberLogin;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberLoginCont {

	@Autowired
	private MemberLoginDAO dao;

	public MemberLoginCont() {
		System.out.println("---MemberLoginCont 객체 생성됨");
	}

	@RequestMapping("/home.do")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping("/")
	public ModelAndView home1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}

	@RequestMapping("/memberLogin/agreement.do")
	public ModelAndView agreement(MemberLoginDTO dto, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		System.out.println("로그인정보: " + req.getSession().getAttribute("loginInfo"));
		mav.setViewName("memberLogin/agreement");
		return mav;
	} // agreement() end

	@RequestMapping(value = "/memberLogin/create.do", method = RequestMethod.GET)
	public ModelAndView createForm(MemberLoginDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("memberLogin/createForm"); // /member/createForm.jsp
		return mav;
	} // createForm() end

	@RequestMapping(value="/memberLogin/create.do", method=RequestMethod.POST)
	public ModelAndView createProc(MemberLoginDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/home.do");
		int count = dao.create(dto);
		System.out.println("redirect 됨");
		
		return mav;
	} // createProc() end

	@RequestMapping(value = "/memberLogin/login.do", method = RequestMethod.GET)
	public ModelAndView login(MemberLoginDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("memberLogin/loginForm");
		return mav;
	}

	@RequestMapping(value = "/memberLogin/login.do", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			MemberLoginDTO dto) {
		;
		ModelAndView mav = new ModelAndView();
		ArrayList<MemberLoginDTO> list = dao.check(dto);

		if (list.isEmpty()) {
			mav.setViewName("memberLogin/loginForm");

		} else {

			String m_id = dto.getM_id();
			String m_level = list.iterator().next().getM_level();
			String m_nick = list.iterator().next().getM_nick();
			
			HashMap<String, Object> loginInfo = new HashMap<String, Object>();
			loginInfo.put("m_id", m_id);
			loginInfo.put("m_level", m_level);
			loginInfo.put("m_nick", m_nick);
			session.setAttribute("loginInfo", loginInfo);
			System.out.println("loginInfo HashMap : " + loginInfo);
			//System.out.println("loginInfo_m_id : " + loginInfo.get("m_id"));
			
			//System.out.println("session_m_id : " + ((HashMap)(session.getAttribute("loginInfo"))).get("m_id"));
			
			//HashMap login = (HashMap) session.getAttribute("loginInfo");
			//System.out.println("session_m_id : " + login.get("m_id"));
			
			//session.setAttribute("loginInfo", dto.getM_id());
			//session.setAttribute("loginLevel", list.iterator().next().getM_level());
			//System.out.println("로그인아이디(loginInfo) : " + dto.getM_id());
			//System.out.println("로그인레벨(loginLevel) : " + list.iterator().next().getM_level());
			mav.setViewName("redirect:/home.do");
		}
		return mav;
	}

	@RequestMapping(value = "/memberLogin/logout.do")
	public ModelAndView logout(HttpServletRequest req, MemberLoginDTO dto) {
		;
		ModelAndView mav = new ModelAndView();
		req.getSession().setAttribute("loginInfo", null);
		mav.setViewName("memberLogin/loginForm");
		return mav;
	}

	@RequestMapping(value = "/memberLogin/mypage.do", method = RequestMethod.GET)
	public ModelAndView mypage(MemberLoginDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("memberLogin/mypage");
		return mav;
	}
}
