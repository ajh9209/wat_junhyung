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

	/*
	//Į�� ����Ʈ
	ArrayList<ColDTO> list() {
		// interface ColMapper{}
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		ArrayList<ColDTO> list = mapper.list();
		return list;

	}// list() end

*/	
	//Į�� ���
	int create(ColDTO dto){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end
	
	
	//Į�� �󼼺���
	ColDTO read(int b_no){
		ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		increment(b_no);
		return mapper.read(b_no);
	}// create() end
	
	//��ȸ��
	public void increment(int b_no){
	ColMapper mapper = sqlSession.getMapper(ColMapper.class);
		mapper.increment(b_no);
	}
	
	
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
	
	//��õ��
		public int recommend(int b_no){
			ColMapper mapper = sqlSession.getMapper(ColMapper.class);
			int count = mapper. recommend(b_no);
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
	public int replyDelete(int r_no){
			ColMapper mapper = sqlSession.getMapper(ColMapper.class);
			int count = mapper.replyDelete(r_no);
			return count;
		}


		//�˻� �� ����Ʈ
		ArrayList<ColDTO> list_search(ColDTO dto) {
			
			/*int nowPage = 1;				//���� Ŭ�� ������
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
