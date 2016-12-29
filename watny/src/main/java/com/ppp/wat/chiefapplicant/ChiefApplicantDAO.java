package com.ppp.wat.chiefapplicant;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChiefApplicantDAO {

	@Autowired
	private SqlSession sqlSession;

	public ChiefApplicantDAO() {
		System.out.println("ChiefApplicantDAO() °´Ã¼ »ý¼ºµÊ");
	}


	// ÆÀÀå½ÅÃ» ¸®½ºÆ®
	ArrayList<ChiefApplicantDTO> list() {
		ChiefApplicantMapper mapper = sqlSession.getMapper(ChiefApplicantMapper.class);
		ArrayList<ChiefApplicantDTO> list = mapper.list();
		return list;

	}// list() end


	// ÆÀÀå½ÅÃ»  µî·Ï
	int create(ChiefApplicantDTO dto){
		ChiefApplicantMapper mapper = sqlSession.getMapper(ChiefApplicantMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end


	// ÆÀÀå½ÅÃ» »ó¼¼º¸±â
	ChiefApplicantDTO read(int ca_no){
		ChiefApplicantMapper mapper = sqlSession.getMapper(ChiefApplicantMapper.class);
		ChiefApplicantDTO dto = mapper.read(ca_no);
		return dto;
	}// create() end


	// ÆÀÀå½ÅÃ»  »èÁ¦
	int delete(int ca_no){
		ChiefApplicantMapper mapper = sqlSession.getMapper(ChiefApplicantMapper.class);
		int count = mapper.delete(ca_no);
		return count;
	}

	// ÆÀÀå½ÅÃ»  ¼öÁ¤
	int update(ChiefApplicantDTO dto){
		ChiefApplicantMapper mapper = sqlSession.getMapper(ChiefApplicantMapper.class);
		int count = mapper.update(dto);
		return count;
	}


}// class end
