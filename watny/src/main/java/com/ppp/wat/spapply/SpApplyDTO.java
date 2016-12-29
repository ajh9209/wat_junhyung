package com.ppp.wat.spapply;

public class SpApplyDTO {

	private String spa_code;	 //VARCHAR(10) 	NOT NULL, 			
	private int    spa_no;		 //INT 			NOT NULL,			
	private String spa_part;	 //VARCHAR(20)	NOT NULL,			
	private String spa_id;	 	 //VARCHAR(15)	NOT NULL,			
	private String spa_memo;	 //VARCHAR(200)	NULL,				
	private String spa_select;	 //VARCHAR(10)	NOT NULL 	default 'N'	

	public SpApplyDTO() {
	}

	public String getSpa_code() {
		return spa_code;
	}

	public void setSpa_code(String spa_code) {
		this.spa_code = spa_code;
	}

	public int getSpa_no() {
		return spa_no;
	}

	public void setSpa_no(int spa_no) {
		this.spa_no = spa_no;
	}

	public String getSpa_part() {
		return spa_part;
	}

	public void setSpa_part(String spa_part) {
		this.spa_part = spa_part;
	}

	public String getSpa_id() {
		return spa_id;
	}

	public void setSpa_id(String spa_id) {
		this.spa_id = spa_id;
	}

	public String getSpa_memo() {
		return spa_memo;
	}

	public void setSpa_memo(String spa_memo) {
		this.spa_memo = spa_memo;
	}

	public String getSpa_select() {
		return spa_select;
	}

	public void setSpa_select(String spa_select) {
		this.spa_select = spa_select;
	}
	
	
}
