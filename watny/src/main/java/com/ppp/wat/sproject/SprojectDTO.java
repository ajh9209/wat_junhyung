package com.ppp.wat.sproject;

public class SprojectDTO {

	private String 	sp_code;		 //NOT NULL, 				 
	private int 	sp_no;		 	 //NOT NULL 	PK 
	private String 	sp_id;		 	 //VARCHAR(15)	NOT NULL,				 
	private String 	sp_title;	 	//VARCHAR(100)	NOT NULL,				 
	private String 	sp_content;	 	//VARCHAR(5000)	NOT NULL,				 
	private int 	sp_pay;		 	//INT			NOT NULL,				 
	private String 	sp_startdate; 	//DATETIME		NOT NULL,				 
	private String 	sp_findate;	 	//DATETIME		NOT NULL, 				 
	private int 	sp_dbcnt; 	 	//INT			NOT NULL 	default 0,		 
	private int 	sp_uicnt;	 	//INT			NOT NULL 	default 0,		 
	private int 	sp_backcnt;	 	//INT			NOT NULL 	default 0,		 
	private int 	sp_servercnt; 	//INT			NOT NULL 	default 0,		 
	private int 	sp_etccnt;	 	//INT			NOT NULL 	default 0,		 
	private int 	sp_dbpay;	 	//INT			NOT NULL 	default 0,		 
	private int 	sp_uipay;	 	//INT			NOT NULL 	default 0,		 
	private int 	sp_backpay;	 	//INT			NOT NULL 	default 0,		 
	private int 	sp_serverpay; 	//INT			NOT NULL 	default 0,		 
	private int 	sp_etcpay;	 	//INT			NOT NULL 	default 0,		 
	private int 	sp_state;	 	//INT			NOT NULL, 				 
	private String 	sp_newdate;	 	//DATETIME		NOT NULL, 				 
	private String 	sp_enddate;	 	//DATETIME		NULL		
	
	public SprojectDTO() {}

	public String getSp_code() {
		return sp_code;
	}

	public void setSp_code(String sp_code) {
		this.sp_code = sp_code;
	}

	public int getSp_no() {
		return sp_no;
	}

	public void setSp_no(int sp_no) {
		this.sp_no = sp_no;
	}

	public String getSp_id() {
		return sp_id;
	}

	public void setSp_id(String sp_id) {
		this.sp_id = sp_id;
	}

	public String getSp_title() {
		return sp_title;
	}

	public void setSp_title(String sp_title) {
		this.sp_title = sp_title;
	}

	public String getSp_content() {
		return sp_content;
	}

	public void setSp_content(String sp_content) {
		this.sp_content = sp_content;
	}

	public int getSp_pay() {
		return sp_pay;
	}

	public void setSp_pay(int sp_pay) {
		this.sp_pay = sp_pay;
	}

	public String getSp_startdate() {
		return sp_startdate;
	}

	public void setSp_startdate(String sp_startdate) {
		this.sp_startdate = sp_startdate;
	}

	public String getSp_findate() {
		return sp_findate;
	}

	public void setSp_findate(String sp_findate) {
		this.sp_findate = sp_findate;
	}

	public int getSp_dbcnt() {
		return sp_dbcnt;
	}

	public void setSp_dbcnt(int sp_dbcnt) {
		this.sp_dbcnt = sp_dbcnt;
	}

	public int getSp_uicnt() {
		return sp_uicnt;
	}

	public void setSp_uicnt(int sp_uicnt) {
		this.sp_uicnt = sp_uicnt;
	}

	public int getSp_backcnt() {
		return sp_backcnt;
	}

	public void setSp_backcnt(int sp_backcnt) {
		this.sp_backcnt = sp_backcnt;
	}

	public int getSp_servercnt() {
		return sp_servercnt;
	}

	public void setSp_servercnt(int sp_servercnt) {
		this.sp_servercnt = sp_servercnt;
	}

	public int getSp_etccnt() {
		return sp_etccnt;
	}

	public void setSp_etccnt(int sp_etccnt) {
		this.sp_etccnt = sp_etccnt;
	}

	public int getSp_dbpay() {
		return sp_dbpay;
	}

	public void setSp_dbpay(int sp_dbpay) {
		this.sp_dbpay = sp_dbpay;
	}

	public int getSp_uipay() {
		return sp_uipay;
	}

	public void setSp_uipay(int sp_uipay) {
		this.sp_uipay = sp_uipay;
	}

	public int getSp_backpay() {
		return sp_backpay;
	}

	public void setSp_backpay(int sp_backpay) {
		this.sp_backpay = sp_backpay;
	}

	public int getSp_serverpay() {
		return sp_serverpay;
	}

	public void setSp_serverpay(int sp_serverpay) {
		this.sp_serverpay = sp_serverpay;
	}

	public int getSp_etcpay() {
		return sp_etcpay;
	}

	public void setSp_etcpay(int sp_etcpay) {
		this.sp_etcpay = sp_etcpay;
	}

	public int getSp_state() {
		return sp_state;
	}

	public void setSp_state(int sp_state) {
		this.sp_state = sp_state;
	}

	public String getSp_newdate() {
		return sp_newdate;
	}

	public void setSp_newdate(String sp_newdate) {
		this.sp_newdate = sp_newdate;
	}

	public String getSp_enddate() {
		return sp_enddate;
	}

	public void setSp_enddate(String sp_enddate) {
		this.sp_enddate = sp_enddate;
	}
	
	
	
	
}
