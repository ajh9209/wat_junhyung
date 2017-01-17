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

import com.ppp.wat.qna.QnaMapper;



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

	/*
	//칼럼 리스트
	ArrayList<ColDTO> list() {
		// interface ColMapper{}
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		ArrayList<ColDTO> list = mapper.list();
		return list;

	}// list() end

*/	
	//칼럼 등록
	int create(ColDTO dto){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end
	
	
	//칼럼 상세보기
	ColDTO read(int b_no){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		increment(b_no);
		return mapper.read(b_no);
	}// create() end
	
	//조회수
	public void increment(int b_no){
	ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		mapper.increment(b_no);
	}
	
	
	//칼럼 삭제
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
	
	//추천수
		public int recommend(int b_no){
			ColMapper mapper = sqlSession.getMapper(ColMapper.class);
			int count = mapper. recommend(b_no);
			return count;
		}

	//댓글등록
	public int replyCreate(ColDTO dto) {
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		int res = mapper.replyCreate(dto);
		return 0;
	}

	// 댓글목록
	public ArrayList<ColDTO> replyList(int b_no) {
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		ArrayList<ColDTO> list = mapper.replyList(b_no);
		return list;
	}
	
	//댓글 삭제
	public int replyDelete(int r_no){
			ColMapper mapper = sqlSession.getMapper(ColMapper.class);
			int count = mapper.replyDelete(r_no);
			return count;
		}


		//검색 후 리스트
		ArrayList<ColDTO> list_search(ColDTO dto) {
			
			/*int nowPage = 1;				//현재 클릭 페이지
			if(dto.getNowPage() != 0) nowPage = dto.getNowPage();
			int recordPerPage = 5; 	*/
			
			/*dto.setStartRow(((nowPage-1) * recordPerPage) + 1); // (0 * 10) + 1 = 1, 11, 21
			dto.setEndRow(nowPage * recordPerPage);             // 1 * 10 = 10, 20, 30
*/				
			ColMapper mapper = sqlSession.getMapper(ColMapper.class);
			ArrayList<ColDTO> list = mapper.list(dto);				
			
			System.out.println("ColDTO " + dto);
			
			return list;			
		}// list_search() end
		
		public int count(ColDTO dto){		
			ColMapper mapper = sqlSession.getMapper(ColMapper.class);
			int count = mapper.count(dto);
			return count;		
		}//list() end
		
		
	
	
	
}// class end
