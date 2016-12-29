package com.ppp.wat.chiefapplicant;

public class ChiefApplicantDTO {

	private int ca_no; // INT NOT NULL primary key,
	private int ca_rqno; // INT NOT NULL,
	private String ca_id; // VARCHAR(15) NOT NULL,
	private int ca_price; // INT NOT NULL,
	private int ca_date; // INT NOT NULL,
	private String ca_memo; // VARCHAR(200) NULL,
	private String ca_newdate; // DATETIME NOT NULL,
	private String ca_select; // VARCHAR(10) NOT NULL default 'N'

	public ChiefApplicantDTO() {
	}

	public int getCa_no() {
		return ca_no;
	}

	public void setCa_no(int ca_no) {
		this.ca_no = ca_no;
	}

	public int getCa_rqno() {
		return ca_rqno;
	}

	public void setCa_rqno(int ca_rqno) {
		this.ca_rqno = ca_rqno;
	}

	public String getCa_id() {
		return ca_id;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}

	public int getCa_price() {
		return ca_price;
	}

	public void setCa_price(int ca_price) {
		this.ca_price = ca_price;
	}

	public int getCa_date() {
		return ca_date;
	}

	public void setCa_date(int ca_date) {
		this.ca_date = ca_date;
	}

	public String getCa_memo() {
		return ca_memo;
	}

	public void setCa_memo(String ca_memo) {
		this.ca_memo = ca_memo;
	}

	public String getCa_newdate() {
		return ca_newdate;
	}

	public void setCa_newdate(String ca_newdate) {
		this.ca_newdate = ca_newdate;
	}

	public String getCa_select() {
		return ca_select;
	}

	public void setCa_select(String ca_select) {
		this.ca_select = ca_select;
	}

}
