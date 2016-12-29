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
					<h3>Q&amp;A등록</h3>
<FORM name="frm" method="post" action="./create.do">
		
		<table class='table'>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="b_id" size="20"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="b_title" size="20"></td>
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
					
				</div>
			</div>
		</div>
	</div>
</div>
<!-- body end -------------------------------------->
<%@ include file="../footer.jsp"%>