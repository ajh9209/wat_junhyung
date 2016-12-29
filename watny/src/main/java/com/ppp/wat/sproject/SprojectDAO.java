package com.ppp.wat.sproject;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SprojectDAO {

	/*
	   MyBatis와 Spring을 사용하는 방법
	   	1. notice.xml : SQL문 작성
	 	2. interface noticeMapper{}에 등록
	 	3. class NoticeDAO()에서 NoticeMapper호출

	 */

	@Autowired
	private SqlSession sqlSession;


	public SprojectDAO() {
		System.out.println("SprojectDAO() 객체 생성됨");
	}


	// SP팀원모집 리스트
	ArrayList<SprojectDTO> list() {
		SprojectMapper mapper = sqlSession.getMapper(SprojectMapper.class);
		ArrayList<SprojectDTO> list = mapper.list();
		return list;

	}// list() end


	// SP팀원모집 등록
	int create(SprojectDTO dto){
		SprojectMapper mapper = sqlSession.getMapper(SprojectMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end


	// SP팀원모집 조회
	public SprojectDTO read(int sp_no){
		SprojectMapper mapper = sqlSession.getMapper(SprojectMapper.class);
		SprojectDTO dto = mapper.read(sp_no);
		return dto;
	}// create() end


	// SP팀원모집 삭제
	int delete(int sp_no){
		SprojectMapper mapper = sqlSession.getMapper(SprojectMapper.class);
		int count = mapper.delete(sp_no);
		return count;
	}

	// SP팀원모집 수정
	int update(SprojectDTO dto){
		SprojectMapper mapper = sqlSession.getMapper(SprojectMapper.class);
		int count = mapper.update(dto);
		return count;
	}

}// class end
