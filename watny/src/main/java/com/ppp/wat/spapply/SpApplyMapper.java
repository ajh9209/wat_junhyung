package com.ppp.wat.spapply;

import java.util.ArrayList;

public interface SpApplyMapper {
	
	
	// <select id="list" resultType="SpApplyDTO"> 
	public ArrayList<SpApplyDTO> list();
	
	//<insert id="create">
	public int create(SpApplyDTO dto);
	
	//<select id="read" resultType="SpApplyDTO">
	public SpApplyDTO read(int sp_no);

	//<delete id="delete" >
	public int delete(int sp_no);
	
	//<update id="update">
	public int update(SpApplyDTO dto);

}
