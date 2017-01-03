package com.ppp.wat.qna;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ppp.wat.qna.QnaDTO;
import com.ppp.wat.qna.QnaMapper;

@Component
public class QnaDAO {

	/*
	 * myBatis를 사용하지 않은 경우,
	 * 
	 * @Autowired DBOpen dbopen
	 * 
	 * 
	 
	   MyBatis와 Spring을 사용하는 방법
	   	1. qna.xml : SQL문 작성
	 	2. interface qnaMapper{}에 등록
	 	3. class QnaDAO()에서 QnaMapper호출
	 
	 */

	@Autowired
	private SqlSession sqlSession;

	
	public QnaDAO() {
		System.out.println("QnaDAO() 객체 생성됨");
	}

	
	//qna 리스트
	ArrayList<QnaDTO> list() {
		// interface QnaMapper{}
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		ArrayList<QnaDTO> list = mapper.list();
		return list;

	}// list() end

	
	//qna 등록
	int create(QnaDTO dto){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end
	
	
	//qna 조회
	QnaDTO read(int b_no){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		QnaDTO dto = mapper.read(b_no);
		return dto;
	}// create() end
	
	
	//qna 삭제
	int delete(int b_no){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		int count = mapper.delete(b_no);
		return count;
	}
	
	//qna 수정
	int update(QnaDTO dto){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		int count = mapper.update(dto);
		return count;
	}


	//댓글등록
		public int replyCreate(QnaDTO dto) {
			QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
			int res = mapper.replyCreate(dto);
			return 0;
		}

		// 댓글목록
		public ArrayList<QnaDTO> replyList(int b_no) {
			QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
			ArrayList<QnaDTO> list = mapper.replyList(b_no);
			return list;
		}
		
		//댓글 삭제
			int replyDelete(int r_no){
				QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
				int count = mapper.replyDelete(r_no);
				return count;
			}


			public int rlpCreate(QnaDTO dto) {
				QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
				int count = mapper.rlpCreate(dto);
				return count;
			}
		
	
	
	
}// class end
