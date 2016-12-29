package com.ppp.wat.sproject;

import java.util.ArrayList;

public interface SprojectMapper {
	
	// sproject.xml의 
	// <select id="list" resultType="SprojectDTO"> 
	// 아이디와 메서드명이 동일해야 한다.
	public ArrayList<SprojectDTO> list();
	
	//<insert id="create">
	public int create(SprojectDTO dto);
	
	//<select id="read" resultType="SprojectDTO">
	public SprojectDTO read(int sp_no);


	//<delete id="delete" >
	public int delete(int sp_no);
	
	//<update id="update">
	public int update(SprojectDTO dto);
	
}
