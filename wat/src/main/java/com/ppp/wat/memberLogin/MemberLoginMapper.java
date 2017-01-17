package com.ppp.wat.memberLogin;

import java.util.ArrayList;

public interface MemberLoginMapper {

		public int create(MemberLoginDTO dto);
		
		public ArrayList<MemberLoginDTO> check(MemberLoginDTO dto);
}
