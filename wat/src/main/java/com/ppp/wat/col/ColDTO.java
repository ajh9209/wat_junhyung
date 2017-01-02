package com.ppp.wat.col;

public class ColDTO {

	
	
	private String b_code;				// not null								�Խ��� �з���ȣ qna-qna Į��-col
	private int b_no;						// not null		PRIMARY KEY		�Խñ� ��ȣ
	private int b_origin ;					// not null									�θ�� ��ȣ
	private int b_reply;						// not null DEFAULT 0					��� ���й�ȣ
	private String b_id;					// not null									���̵�
	private String b_title;					// not null 									����
	private String b_content;			// not null									����
	private int b_recommend;			// not null DEFAULT 0					��õ��
	private int b_readcnt;					// not null DEFAULT 0					��ȸ��
	private int b_downcnt;				// not null DEFAULT 0					�ٿ�ε�� 
	private String b_newdate;			// not null									�����
	private String b_editdate;			// null										������
	private int r_no;          		 		//  not null	 	 PRIMARY KEY		��۹�ȣ
	private int r_bno;		           		 // not null									����� �θ��ȣ
 	private String	 r_id;     			//  VARCHAR(15) 	  not null		��� ���̵�
 	private String	 r_content ; 		//  VARCHAR(5000)	 not null		���
 	private String r_date;     		// DATETIME     	 not null				��� ��ϳ�¥
	
	public ColDTO() {	}
	public String getB_code() {
		return b_code;
	}
	public void setB_code(String b_code) {
		this.b_code = b_code;
	}
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public int getB_origin() {
		return b_origin;
	}
	public void setB_origin(int b_origin) {
		this.b_origin = b_origin;
	}
	public int getB_reply() {
		return b_reply;
	}
	public void setB_reply(int b_reply) {
		this.b_reply = b_reply;
	}
	public String getB_id() {
		return b_id;
	}
	public void setB_id(String b_id) {
		this.b_id = b_id;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public int getB_recommend() {
		return b_recommend;
	}
	public void setB_recommend(int b_recommend) {
		this.b_recommend = b_recommend;
	}
	public int getB_readcnt() {
		return b_readcnt;
	}
	public void setB_readcnt(int b_readcnt) {
		this.b_readcnt = b_readcnt;
	}
	public int getB_downcnt() {
		return b_downcnt;
	}
	public void setB_downcnt(int b_downcnt) {
		this.b_downcnt = b_downcnt;
	}
	public String getB_newdate() {
		return b_newdate;
	}
	public void setB_newdate(String b_newdate) {
		this.b_newdate = b_newdate;
	}
	public String getB_editdate() {
		return b_editdate;
	}
	public void setB_editdate(String b_editdate) {
		this.b_editdate = b_editdate;
	}
	public int getR_no() {
		return r_no;
	}
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	public int getR_bno() {
		return r_bno;
	}
	public void setR_bno(int r_bno) {
		this.r_bno = r_bno;
	}
	public String getR_id() {
		return r_id;
	}
	public void setR_id(String r_id) {
		this.r_id = r_id;
	}
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public String getR_date() {
		return r_date;
	}
	public void setR_date(String r_date) {
		this.r_date = r_date;
	}	
	

}
