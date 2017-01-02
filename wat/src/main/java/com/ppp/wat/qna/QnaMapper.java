package com.ppp.wat.qna;

import java.util.ArrayList;

import com.ppp.wat.qna.QnaDTO;

public interface QnaMapper {
	
	//�������̽�. �߻�޼���θ� �����ϸ� MyBatis3�� ȣ���ϱ� ���ϵ��� ����
	// ���ۿ� ���� �޼ҵ���� MyBatis�� XML ���Ͼ��� id�� �����ؾ� �Ѵ�.
	//  = ����ϰ� ���
	
	// notice.xml�� 
	// <select id="list" resultType="NoticeDTO"> 
	// ���̵�� �޼������ �����ؾ� �Ѵ�.
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
