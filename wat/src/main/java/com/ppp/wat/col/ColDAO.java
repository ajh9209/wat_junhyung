package com.ppp.wat.col;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ColDAO {

	/*
	 * myBatis�� ������� ���� ���,
	 * 
	 * @Autowired DBOpen dbopen
	 * 
	 * 
	 
	   MyBatis�� Spring�� ����ϴ� ���
	   	1. col.xml : SQL�� �ۼ�
	 	2. interface colMapper{}�� ���
	 	3. class ColDAO()���� ColMapperȣ��
	 
	 */

	@Autowired
	private SqlSession sqlSession;

	
	public ColDAO() {
		System.out.println("ColDAO() ��ü ������");
	}

	
	//Į�� ����Ʈ
	ArrayList<ColDTO> list() {
		// interface ColMapper{}
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		ArrayList<ColDTO> list = mapper.list();
		return list;

	}// list() end

	
	//Į�� ���
	int create(ColDTO dto){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end
	
	
	//Į�� ��ȸ
	ColDTO read(int b_no){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		ColDTO dto = mapper.read(b_no);
		return dto;
	}// create() end
	
	
	//Į�� ����
	int delete(int b_no){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		int count = mapper.delete(b_no);
		return count;
	}
	
	//Į�� ����
	int update(ColDTO dto){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		int count = mapper.update(dto);
		return count;
	}

	//��۵��
	public int replyCreate(ColDTO dto) {
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		int res = mapper.replyCreate(dto);
		return 0;
	}

	// ��۸��
	public ArrayList<ColDTO> replyList(int b_no) {
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		ArrayList<ColDTO> list = mapper.replyList(b_no);
		return list;
	}
	
	//��� ����
		int replyDelete(int r_no){
			ColMapper mapper = sqlSession.getMapper(ColMapper.class);
			int count = mapper.replyDelete(r_no);
			return count;
		}


		//�˻� �� ����Ʈ
		ArrayList<ColDTO> list_search(HashMap hashMap) {
			ColMapper mapper = sqlSession.getMapper(ColMapper.class);
			ArrayList<ColDTO> list = mapper.list_search(hashMap);				
			
			System.out.println("ColDTO " + hashMap);
			
			return list;			
		}// list_search() end
	
	
	
}// class end
