package com.ppp.wat.request;

public class RequestDTO {

	private int rq_no;			// INT			 not null primary key,
	private String rq_id;		// VARCHAR(15)	 not null,
	private String rq_title; 	// VARCHAR(100)	 not null,
	private String rq_content;	// VARCHAR(5000) not null,
	private String rq_templete;	// VARCHAR(50)	 null,
	private String rq_newdate;	// DATETIME		 not null,
	private String rq_enddate;	// DATETIME		 null,
	private int rq_state;		// INT			 not null
	
	public RequestDTO() {}
	
	public int getRq_no() {
		return rq_no;
	}
	public void setRq_no(int rq_no) {
		this.rq_no = rq_no;
	}
	public String getRq_id() {
		return rq_id;
	}
	public void setRq_id(String rq_id) {
		this.rq_id = rq_id;
	}
	public String getRq_title() {
		return rq_title;
	}
	public void setRq_title(String rq_title) {
		this.rq_title = rq_title;
	}
	public String getRq_content() {
		return rq_content;
	}
	public void setRq_content(String rq_content) {
		this.rq_content = rq_content;
	}
	public String getRq_templete() {
		return rq_templete;
	}
	public void setRq_templete(String rq_templete) {
		this.rq_templete = rq_templete;
	}
	public String getRq_newdate() {
		return rq_newdate;
	}
	public void setRq_newdate(String rq_newdate) {
		this.rq_newdate = rq_newdate;
	}
	public String getRq_enddate() {
		return rq_enddate;
	}
	public void setRq_enddate(String rq_enddate) {
		this.rq_enddate = rq_enddate;
	}
	public int getRq_state() {
		return rq_state;
	}
	public void setRq_state(int rq_state) {
		this.rq_state = rq_state;
	}
	
	
	
	
}
