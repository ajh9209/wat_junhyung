<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../header.jsp"%>
<%@ include file="../cmuLeftTemp.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
%>

<!-- body start -------------------------------------->
					<h3>Q&amp;A수정</h3>
	<FORM name='frm' method='POST' action='./update.do'>	
		<input type="hidden" name="b_no" value="${dto.b_no }">
		<input type="hidden" name="b_code" value="${dto.b_code }">
		<div class='table'>
			<table>
				<tr>
					<th>번호</th>
					<td>${dto.b_no }</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${dto.b_id }</td>
				</tr>
				<tr>
				<th>제목</th>
				<td><input type="text" name="b_title" size="20" value='${dto.b_title }'></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea rows="10" cols="55" name="b_content" >${dto.b_content }</textarea></td>
				</tr>
				<tr>
					<th>등록일</th>
					<td>${dto.b_newdate }</td>
				</tr>
			</table>
		</div>
		<div class='bottom'>
			<input type='submit' value='수정'> <input type='button'
				value='목록'
				onclick="location.href='./read.do?b_no=${dto.b_no}'">
		</div>
	</FORM>
	
 			
<!-- body end -------------------------------------->
<%@ include file="../footer.jsp"%>