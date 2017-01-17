package com.ppp.wat.qna;

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

import com.ppp.wat.col.ColDTO;
import com.ppp.wat.col.ColMapper;
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

	/*
	//qna 리스트
	ArrayList<QnaDTO> list() {
		// interface QnaMapper{}
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		ArrayList<QnaDTO> list = mapper.list();
		return list;

	}// list() end
*/
	
	//qna 등록
	int create(QnaDTO dto){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end
	
	
	//qna 상세보기
	QnaDTO read(int b_no){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		increment(b_no);
		return mapper.read(b_no);
	}// create() end
	
	//조회수
			public void increment(int b_no){
				QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
				mapper.increment(b_no);
			}
		
	
	
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
	
	//추천수
			public int recommend(int b_no){
				QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
				int count = mapper. recommend(b_no);
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
		public int replyDelete(int r_no){
				QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
				int count = mapper.replyDelete(r_no);
				return count;
			}


			public int rlpCreate(QnaDTO dto) {
				QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
				int count = mapper.rlpCreate(dto);
				return count;
			}
		
			//검색 후 리스트
			ArrayList<QnaDTO> list_search(QnaDTO dto) {
				
				/*int nowPage = 1;				//현재 클릭 페이지
				if(dto.getNowPage() != 0) nowPage = dto.getNowPage();
				int recordPerPage = 5; 	*/
				
				/*dto.setStartRow(((nowPage-1) * recordPerPage) + 1); // (0 * 10) + 1 = 1, 11, 21
				dto.setEndRow(nowPage * recordPerPage);             // 1 * 10 = 10, 20, 30
*/				
				QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
				ArrayList<QnaDTO> list = mapper.list(dto);				
				
				System.out.println("QnaDTO " + dto);
				
				return list;			
			}// list_search() end
			
			public int count(QnaDTO dto){		
				QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
				int count = mapper.count(dto);
				return count;		
			}//list() end
	
	
	
}// class end
