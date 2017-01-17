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
	 * myBatis�� ������� ���� ���,
	 * 
	 * @Autowired DBOpen dbopen
	 * 
	 * 
	 
	   MyBatis�� Spring�� ����ϴ� ���
	   	1. qna.xml : SQL�� �ۼ�
	 	2. interface qnaMapper{}�� ���
	 	3. class QnaDAO()���� QnaMapperȣ��
	 
	 */

	@Autowired
	private SqlSession sqlSession;

	
	public QnaDAO() {
		System.out.println("QnaDAO() ��ü ������");
	}

	/*
	//qna ����Ʈ
	ArrayList<QnaDTO> list() {
		// interface QnaMapper{}
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		ArrayList<QnaDTO> list = mapper.list();
		return list;

	}// list() end
*/
	
	//qna ���
	int create(QnaDTO dto){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end
	
	
	//qna �󼼺���
	QnaDTO read(int b_no){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		increment(b_no);
		return mapper.read(b_no);
	}// create() end
	
	//��ȸ��
			public void increment(int b_no){
				QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
				mapper.increment(b_no);
			}
		
	
	
	//qna ����
	int delete(int b_no){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		int count = mapper.delete(b_no);
		return count;
	}
	
	//qna ����
	int update(QnaDTO dto){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		int count = mapper.update(dto);
		return count;
	}
	
	//��õ��
			public int recommend(int b_no){
				QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
				int count = mapper. recommend(b_no);
				return count;
			}

	//��۵��
		public int replyCreate(QnaDTO dto) {
			QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
			int res = mapper.replyCreate(dto);
			return 0;
		}

		// ��۸��
		public ArrayList<QnaDTO> replyList(int b_no) {
			QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
			ArrayList<QnaDTO> list = mapper.replyList(b_no);
			return list;
		}
		
		//��� ����
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
		
			//�˻� �� ����Ʈ
			ArrayList<QnaDTO> list_search(QnaDTO dto) {
				
				/*int nowPage = 1;				//���� Ŭ�� ������
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
