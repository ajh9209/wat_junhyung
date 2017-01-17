<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../header.jsp"%>
<%@ include file="../cmuLeftTemp.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
%>

<!-- body start -------------------------------------->
					<h3>Q&amp;A 답변글 등록</h3>
<FORM name="frm" method="post" action="./rlpCreate.do">
<input type="hidden" name="b_no" value="${b_no }">
<input type="hidden" name="b_origin" value="${b_origin}">
<input type="hidden" name="b_reply" value="${b_reply+1 }">

		<table class='table'>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="b_id" size="20"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td align="left">
				<c:forEach var = "i" begin = "1" end ="${b_origin}" >
				&nbsp;&nbsp;&nbsp;&nbsp;
				</c:forEach>
				<input type="text" name="b_title" size="20"></td>
			</tr>
			<tr>
				<th>Q&amp;A내용</th>
				<td><textarea rows="10" cols="55" name="b_content"></textarea></td>
			</tr>
		</table>

		<DIV class='bottom'>
			<input type='submit' value='등록'> <input type='button'
				value='목록' onclick="location.href='./list.do'">
		</DIV>
	</FORM>			
					
	
<!-- body end -------------------------------------->
<%@ include file="../footer.jsp"%>