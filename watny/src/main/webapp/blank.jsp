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
				<h4>사이드바이름</h4>
				<ul class="nav nav-tabs nav-stacked">
					<li><a href="#">메뉴1</a></li>
					<li><a href="#">메뉴2</a></li>
				</ul>
			</div>
		</div>
		<div class="col-md-7">
			<div class="row-fluid" id="content">
				<div class="span8 main">
					<h3 style="text-align: center;">제목써주세요</h3>
				
				
				
					<!-- 여기에 입력하면 되용 -->
				
				
					
				</div>
			</div>
		</div>
	</div>
</div>
<!-- body end -------------------------------------->
<%@ include file="../footer.jsp"%>