package com.ppp.wat.col;

import java.io.InputStream;
import java.util.ArrayList;
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
	 * myBatis를 사용하지 않은 경우,
	 * 
	 * @Autowired DBOpen dbopen
	 * 
	 * 
	 
	   MyBatis와 Spring을 사용하는 방법
	   	1. col.xml : SQL문 작성
	 	2. interface colMapper{}에 등록
	 	3. class ColDAO()에서 ColMapper호출
	 
	 */

	@Autowired
	private SqlSession sqlSession;

	
	public ColDAO() {
		System.out.println("ColDAO() 객체 생성됨");
	}

	
	//칼럼 리스트
	ArrayList<ColDTO> list() {
		// interface ColMapper{}
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		ArrayList<ColDTO> list = mapper.list();
		return list;

	}// list() end

	
	//칼럼 등록
	int create(ColDTO dto){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end
	
	
	//칼럼 조회
	ColDTO read(int b_no){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		ColDTO dto = mapper.read(b_no);
		return dto;
	}// create() end
	
	
	//갈럼 삭제
	int delete(int b_no){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		int count = mapper.delete(b_no);
		return count;
	}
	
	//칼럼 수정
	int update(ColDTO dto){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		int count = mapper.update(dto);
		return count;
	}
	
	
	
}// class end
