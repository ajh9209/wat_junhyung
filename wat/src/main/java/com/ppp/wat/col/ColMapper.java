package com.ppp.wat.col;

import java.util.ArrayList;

public interface ColMapper {
	
	//�������̽�. �߻�޼���θ� �����ϸ� MyBatis3�� ȣ���ϱ� ���ϵ��� ����
	// ���ۿ� ���� �޼ҵ���� MyBatis�� XML ���Ͼ��� id�� �����ؾ� �Ѵ�.
	//  = ����ϰ� ���
	
	// notice.xml�� 
	// <select id="list" resultType="ColDTO"> 
	// ���̵�� �޼������ �����ؾ� �Ѵ�.
	public ArrayList<ColDTO> list();
	
	//<insert id="create">
	public int create(ColDTO dto);
	
	//<select id="read" resultType="ColDTO">
	public ColDTO read(int b_no);


	//<delete id="delete" >
	public int delete(int b_no);
	
	//<update id="update">
	public int update(ColDTO dto);

	public int replyCreate(ColDTO dto);

	public ArrayList<ColDTO> replyList(int b_no);
	// <replyList = "List">

	public int replyDelete(int r_no);
	// <replyDelete = "reply">
}
