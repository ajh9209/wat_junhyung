package com.ppp.wat.memberLogin;

import org.springframework.stereotype.Component;
@Component
public class MemberLoginDTO {

	private int m_no;
	private String m_name;
	private String m_id;
	private String m_pw;
	private String m_nick;
	private String m_email;
	private String m_phone;
	private String m_job;
	private String m_lang;
	private String m_level;
	private String m_newdate;
	private String m_editdate;
	
	public MemberLoginDTO() {
		System.out.println("---MemberLoginDTO °´Ã¼ »ý¼º");
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_nick() {
		return m_nick;
	}
	public void setM_nick(String m_nick) {
		this.m_nick = m_nick;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_job() {
		return m_job;
	}
	public void setM_job(String m_job) {
		this.m_job = m_job;
	}
	public String getM_lang() {
		return m_lang;
	}
	public void setM_lang(String m_lang) {
		this.m_lang = m_lang;
	}
	public String getM_level() {
		return m_level;
	}
	public void setM_level(String m_level) {
		this.m_level = m_level;
	}
	public String getM_newdate() {
		return m_newdate;
	}
	public void setM_newdate(String m_newdate) {
		this.m_newdate = m_newdate;
	}
	public String getM_editdate() {
		return m_editdate;
	}
	public void setM_editdate(String m_editdate) {
		this.m_editdate = m_editdate;
	}
	@Override
	public String toString() {
		return "MemberDTO [m_no=" + m_no + ", m_name=" + m_name + ", m_id=" + m_id + ", m_pw=" + m_pw + ", m_nick="
				+ m_nick + ", m_email=" + m_email + ", m_phone=" + m_phone + ", m_job=" + m_job + ", m_lang=" + m_lang
				+ ", m_level=" + m_level + ", m_newdate=" + m_newdate + ", m_editdate=" + m_editdate + "]";
	}
	
	
}
