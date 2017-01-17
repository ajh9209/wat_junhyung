package com.ppp.wat.memberLogin;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.fabric.xmlrpc.base.Member;

@Component
public class MemberLoginDAO { 
	
	@Autowired
	private SqlSession sqlSession;
	
	public MemberLoginDAO(){
		System.out.println("---MemberLoginDAO °´Ã¼ »ý¼ºµÊ");
	}
	
	public int create(MemberLoginDTO dto) {
		MemberLoginMapper mapper = sqlSession.getMapper(MemberLoginMapper.class);
		int count = mapper.create(dto);
		return count;
	} //create end 
	
	public ArrayList<MemberLoginDTO> check(MemberLoginDTO dto){
		MemberLoginMapper mapper = sqlSession.getMapper(MemberLoginMapper.class);
		ArrayList<MemberLoginDTO> list = mapper.check(dto);
		return list; 
	}

}
