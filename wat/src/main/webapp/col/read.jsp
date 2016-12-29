<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../header.jsp"%>
<%
	request.setCharacterEncoding("utf-8");
%>

<!-- body start -------------------------------------->
<div class="section">
	<div class="container">
		<div class="col-md-2">
			<div class="span3 sidebar">
				<h4>community</h4>
				<ul class="nav nav-tabs nav-stacked">
					<li><a href="../col/list.do">칼럼</a></li>
					<li><a href="../qna/list.do">Q&amp;A</a></li>
				</ul>
			</div>
		</div>
		<div class="col-md-7">
			<div class="row-fluid" id="content">
				<div class="span8 main">
					<h3>칼럼</h3>
					
	<FORM name='frm' method='POST' action='./update.do'>
		<div class='table'>
			<table
				style="text-align: center; padding-left: 30; padding-right: 30;">
				<tr>
					<th>번호</th>
					<td>${dto.b_no }</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${dto.b_id }</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>${dto.b_title }</td>
				</tr>
				<tr>
					<th>등록일</th>
					<td>${dto.b_newdate }</td>
				</tr>
			</table>
		</div>
		<div class='bottom'>
			<input type='button' 
					value='수정'
					onclick="location.href='./update.do?b_no=${dto.b_no }'">
			<input type='button' 
					value='목록'
					onclick="location.href='./list.do'">
			<input type='button' 
					value='삭제'
					onclick="location.href='./delete.do?b_no=${dto.b_no }'">
		</div>
	</FORM>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- body end -------------------------------------->
<%@ include file="../footer.jsp"%>