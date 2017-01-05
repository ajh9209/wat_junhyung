<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../header.jsp"%>
<%@ include file="../cmuLeftTemp.jsp"%>
<%
	request.setCharacterEncoding("utf-8");
%>

<!-- body start -------------------------------------->
<h3>Q&amp;A목록</h3>
<FORM name='frm' method='POST' action='./list.do'>
	<input type="hidden" name="b_code" value="${dto.b_code }">
	<TABLE class='table' style='text-align: left;'>
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
				<td>
					<c:forEach var="i" begin="1" end="${dto.b_reply}">
						&nbsp;&nbsp;
					</c:forEach> 
					<c:if test="${dto.b_reply >= 1 }">
						<img src=" ../images/reply.gif">
					</c:if> 
					<a href="./read.do?b_no=${dto.b_no }">${dto.b_title }</a>
				</td>
				<td>${dto.b_recommend }</td>
				<td>${dto.b_readcnt }</td>
				<td>${dto.b_id }</td>
				<td>${dto.b_newdate }</td>
			</tr>
		</c:forEach>

	</TABLE>

	<DIV class='bottom'>
		<input type='button' value='글쓰기'  style='float: right;'
		onclick="location.href='./create.do'">
	</DIV>
</FORM>

<form id="form_search" name="form_search" method="get"
	action="./list.do">
	<select id="sch_type" name="sch_type">
		<option value="b_title" selected="selected">제목</option>
		<option value="b_content">내용</option>
		<option value="b_id">작성자</option>
	</select> <input type="text" id="sch_value" name="sch_value" />
	<button type="button" onclick="search();">검색</button>
</form>

<script>
	function search() {
		var sch_value = jQuery('#form_search #sch_value').val();
		if (sch_value == '') {
			alert('검색어를 입력하세요.');
		} else {
			jQuery('#form_search').submit();
		}
	}
	jQuery('#form_search #sch_type value').val('${mapSearch.sch_type}');
</script>		


<!-- body end -------------------------------------->
<%@ include file="../footer.jsp"%>