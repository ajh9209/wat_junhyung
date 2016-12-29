package com.ppp.wat.spapply;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpApplyDAO {

	@Autowired
	private SqlSession sqlSession;

	public SpApplyDAO() {
		System.out.println("ChiefApplicantDAO() °´Ã¼ »ý¼ºµÊ");
	}


	// ÆÀÀå½ÅÃ» ¸®½ºÆ®
	ArrayList<SpApplyDTO> list() {
		SpApplyMapper mapper = sqlSession.getMapper(SpApplyMapper.class);
		ArrayList<SpApplyDTO> list = mapper.list();
		return list;

	}// list() end


	// ÆÀÀå½ÅÃ»  µî·Ï
	int create(SpApplyDTO dto){
		SpApplyMapper mapper = sqlSession.getMapper(SpApplyMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end


	// ÆÀÀå½ÅÃ» »ó¼¼º¸±â
	SpApplyDTO read(int spa_no){
		SpApplyMapper mapper = sqlSession.getMapper(SpApplyMapper.class);
		SpApplyDTO dto = mapper.read(spa_no);
		return dto;
	}// create() end


	// ÆÀÀå½ÅÃ»  »èÁ¦
	int delete(int spa_no){
		SpApplyMapper mapper = sqlSession.getMapper(SpApplyMapper.class);
		int count = mapper.delete(spa_no);
		return count;
	}

	// ÆÀÀå½ÅÃ»  ¼öÁ¤
	int update(SpApplyDTO dto){
		SpApplyMapper mapper = sqlSession.getMapper(SpApplyMapper.class);
		int count = mapper.update(dto);
		return count;
	}


}// class end
