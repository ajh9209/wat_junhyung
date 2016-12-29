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
					<h3>Q&amp;A</h3>
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
	
				</div>
			</div>
		</div>
	</div>
</div>
<!-- body end -------------------------------------->
<%@ include file="../footer.jsp"%>