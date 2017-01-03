<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../header.jsp"%>
<%@ include file="../cmuLeftTemp.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
%>

<!-- body start -------------------------------------->
					<h3>칼럼목록</h3>				
					<FORM name='frm' method='POST' action='./list.do'>
					<input type="hidden" name="b_code" value="${dto.b_code }">
		<TABLE class='table' style='text-align: center;'>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>추천수</th>
				<th>조회수</th>
				<th>작성자</th>
				<th>등록일</th>				
			</tr>

			<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.b_no }</td>
					<td><a href="./read.do?b_no=${dto.b_no }">${dto.b_title }</a>
					</td>					
					<td>${dto.b_recommend }</td>
					<td>${dto.b_readcnt }</td>
					<td>${dto.b_id }</td>
					<td>${dto.b_newdate }</td>
				</tr>
			</c:forEach>

		</TABLE>

		<DIV class='bottom'>
			<input type='button' value='글쓰기'
				onclick="location.href='./create.do'">
		</DIV>
	</FORM>
				
				
					
<!-- body end -------------------------------------->
<%@ include file="../footer.jsp"%>