<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../header.jsp"%>
<%@ include file="../cmuLeftTemp.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
%>

<!-- body start -------------------------------------->
					<h3>칼럼</h3>
	<FORM name='frm' method='POST' action='./delete.do'>
	<input type="hidden" name="b_no" value="${dto.b_no }">
		<div class='content'>
			<p>칼럼을 삭제하시겠습니까?</p>
		</div>
		<div class='bottom'>
			<input type='submit' value='삭제'> <input type='button'
				value='목록' onclick="location.href='./list.do'">
		</div>
	</FORM>
	

<!-- body end -------------------------------------->
<%@ include file="../footer.jsp"%>