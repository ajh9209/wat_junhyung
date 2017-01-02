package com.ppp.wat.qna;

import java.util.ArrayList;

import com.ppp.wat.qna.QnaDTO;

public interface QnaMapper {
	
	//인터페이스. 추상메서드로만 존재하며 MyBatis3를 호출하기 편리하도록 지원
	// 매퍼에 들어가는 메소드명은 MyBatis의 XML 파일안의 id와 동일해야 한다.
	//  = 등록하고 써라
	
	// notice.xml의 
	// <select id="list" resultType="NoticeDTO"> 
	// 아이디와 메서드명이 동일해야 한다.
	public ArrayList<QnaDTO> list();
	
	//<insert id="create">
	public int create(QnaDTO dto);
	
	//<select id="read" resultType="NoticeDTO">
	public QnaDTO read(int b_no);


	//<delete id="delete" >
	public int delete(int b_no);
	
	//<update id="update">
	public int update(QnaDTO dto);
	
	public int replyCreate(QnaDTO dto);

	public ArrayList<QnaDTO> replyList(int b_no);
	// <replyList = "List">

	public int replyDelete(int r_no);
	// <replyDelete = "reply">
	
}
