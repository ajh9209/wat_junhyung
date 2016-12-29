package com.ppp.wat.request;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestDAO {

	@Autowired
	private SqlSession sqlSession;

	public RequestDAO() {
		System.out.println("RequestDAO() 객체 생성됨");
	}


	// 프로젝트 의뢰  리스트
	ArrayList<RequestDTO> list() {
		RequestMapper mapper = sqlSession.getMapper(RequestMapper.class);
		ArrayList<RequestDTO> list = mapper.list();
		return list;

	}// list() end


	// 프로젝트 의뢰  등록
	int create(RequestDTO dto){
		RequestMapper mapper = sqlSession.getMapper(RequestMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end


	// 프로젝트 의뢰 상세보기
	public RequestDTO read(int rq_no){
		RequestMapper mapper = sqlSession.getMapper(RequestMapper.class);
		RequestDTO dto = mapper.read(rq_no);
		return dto;
	}// create() end


	// 프로젝트 의뢰  삭제
	int delete(int rq_no){
		RequestMapper mapper = sqlSession.getMapper(RequestMapper.class);
		int count = mapper.delete(rq_no);
		return count;
	}

	// 프로젝트 의뢰  수정
	int update(RequestDTO dto){
		RequestMapper mapper = sqlSession.getMapper(RequestMapper.class);
		int count = mapper.update(dto);
		return count;
	}
	


}// class end
