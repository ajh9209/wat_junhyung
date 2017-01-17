package com.ppp.wat.col;

import java.util.ArrayList;
import java.util.HashMap;

public interface ColMapper {
	
	//인터페이스. 추상메서드로만 존재하며 MyBatis3를 호출하기 편리하도록 지원
	// 매퍼에 들어가는 메소드명은 MyBatis의 XML 파일안의 id와 동일해야 한다.
	//  = 등록하고 써라
	
	// notice.xml의 
	// <select id="list" resultType="ColDTO"> 
	// 아이디와 메서드명이 동일해야 한다.
	public ArrayList<ColDTO> list(ColDTO dto);
	
	public int count(ColDTO dto);
	
	//<insert id="create">
	public int create(ColDTO dto);
	
	//<select id="read" resultType="ColDTO">
	public ColDTO read(int b_no);


	//<delete id="delete" >
	public int delete(int b_no);
	
	public void increment(int b_no);//조회 수
	
	public int recommend(int b_no); // 추천수
	
	//<update id="update">
	public int update(ColDTO dto);
	
	public int replyCreate(ColDTO dto);
	// 댓글쓰기
	
	public ArrayList<ColDTO> replyList(int b_no);
	// <replyList = "List" 댓글 목록>

	public int replyDelete(int r_no);
	// <replyDelete = "reply" 댓글삭제>
	
}
