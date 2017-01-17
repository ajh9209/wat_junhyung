package com.ppp.wat.qna;

import java.util.ArrayList;
import java.util.HashMap;

import com.ppp.wat.col.ColDTO;
import com.ppp.wat.qna.QnaDTO;

public interface QnaMapper {
	
	//인터페이스. 추상메서드로만 존재하며 MyBatis3를 호출하기 편리하도록 지원
	// 매퍼에 들어가는 메소드명은 MyBatis의 XML 파일안의 id와 동일해야 한다.
	//  = 등록하고 써라
	
	// notice.xml의 
	// <select id="list" resultType="NoticeDTO"> 
	// 아이디와 메서드명이 동일해야 한다.
	public ArrayList<QnaDTO> list(QnaDTO dto);
	
	public int count(QnaDTO dto);
	
	//<insert id="create">
	public int create(QnaDTO dto);
	
	//<select id="read" resultType="NoticeDTO">
	public QnaDTO read(int b_no);


	//<delete id="delete" >
	public int delete(int b_no);
	
	public void increment(int b_no);//조회 수
	
	public int recommend(int b_no); // 추천수
	
	
	//<update id="update">
	public int update(QnaDTO dto);
	
	public int replyCreate(QnaDTO dto);
	// 댓글 쓰기
	
	public ArrayList<QnaDTO> replyList(int b_no);
	// <replyList = "List" 댓글리스트>

	public int replyDelete(int r_no);
	// <replyDelete = "reply" 댓글삭제>

	public int rlpCreate(QnaDTO dto);
	// <rlpCreate = "List" 덧글>
	
}
