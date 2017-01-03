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

	
	//qna ����Ʈ
	ArrayList<QnaDTO> list() {
		// interface QnaMapper{}
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		ArrayList<QnaDTO> list = mapper.list();
		return list;

	}// list() end

	
	//qna ���
	int create(QnaDTO dto){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		int count = mapper.create(dto);
		return count;
	}// create() end
	
	
	//qna ��ȸ
	QnaDTO read(int b_no){
		QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
		QnaDTO dto = mapper.read(b_no);
		return dto;
	}// create() end
	
	
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
