package com.ppp.wat.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionCheckHandler extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		try {
			// admin�̶�� ����key�� ���� ������ ���ϰ�� �α����������� �̵�
			if (request.getSession().getAttribute("loginInfo") == null) {
				System.out.println("���ͼ��� �۵���"); 
				response.setCharacterEncoding("utf-8");
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('�α����� �ʿ��մϴ�.');");
				out.println("location.href='/wat/memberLogin/login.do';");
				out.println("</script>");
				out.close();
			/*	response.sendRedirect("/wat/member/login.do"); // �α��� �������� �̵�!
*/				return false;
				// �����ؾ� ��
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		// admin ����key ����� main ������ �̵�
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}
}
