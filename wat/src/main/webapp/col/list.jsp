<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../header.jsp"%>
<%@ include file="../cmuLeftTemp.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
%>

<!-- body start -------------------------------------->
					<h3>칼럼목록</h3>	
					
					<!-- 글갯수 -->
<h5 style="float: left; font-style: bold;">
	글갯수: <strong>${totalRecord }</strong>개
</h5>
<c:choose>
	<c:when test="${sch_type == 'b_title' }">
		<h5 style="float: right; font-style: bold;">
			<strong>'제목'</strong>에서&nbsp; 
			<strong>'${sch_value }'</strong>을 검색한 결과
		</h5>
		<br>
	</c:when>
	<c:when test="${sch_type == 'b_content' }">
		<h5 style="float: right; font-style: bold;">
			<strong>'내용'</strong>에서&nbsp;; 
			<strong>'${sch_value }'</strong>을 검색한 결과
		</h5>
		<br>
	</c:when>
	<c:when test="${sch_type == 'b_id' }">
		<h5 style="float: right; font-style: bold;">
			<strong>'작성자'</strong>에서&nbsp; 
			<strong>'${sch_value }'</strong>을 검색한 결과
		</h5>
		<br>
	</c:when>
</c:choose>
								
					<FORM name='frm' method='POST' action='./list.do'>
					<input type="hidden" name="b_code" value="${dto.b_code }">
		<TABLE class='table' style='text-align: center;'>
			<tr>
				<th style='text-align: center;'>번호</th>
				<th style='text-align: center;'>제목</th>
				<th style='text-align: center;'>추천수</th>
				<th style='text-align: center;'>조회수</th>
				<th style='text-align: center;'>작성자</th>
				<th style='text-align: center;'>등록일</th>				
			</tr>

			<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.b_no }</td>
					<td><a href="./read.do?b_no=${dto.b_no }">${dto.b_title }</a>
					</td>					
					<td>${dto.b_recommend }</td>		<!-- 추천수 -->
					<td>${dto.b_readcnt }</td>			<!-- 조회수 -->
					<td>${dto.b_id }</td>						<!-- 작성자 -->
					<td>${dto.b_newdate }</td>			<!-- 등록일 -->
				</tr>
			</c:forEach>

		</TABLE>
  
  <!-- 페이징-->
<table width="600">
<Div id= pagig>
	<tr>
		<td colspan="5" align="center">
			<c:if test="${nowGrp >= 2}">
				<span class='span_box_1'> 
				<a href="${pageContext.request.contextPath}/col/list.do?&nowPage=${BnowPage }&sch_type=${sch_type }&sch_value=${sch_value}">이전</a>
				</span>
			</c:if> 
			
			<c:forEach var="i" begin="${startPage }" end="${endPage }">
				<c:if test="${1 > totalPage}">
				<c:set var="doneLoop" value="true"/> 			
				</c:if>			
		
				<c:choose>
					<c:when test="${nowPage == i }">
						<span class='span_box_2'>${i}</span>
					</c:when>
					<c:otherwise>
						
						<span class='span_box_1'> 
						<a href="${pageContext.request.contextPath}/col/list.do?nowPage=${i}&sch_type=${sch_type }&sch_value=${sch_value}">${i}</a>
						</span>
					</c:otherwise>
				</c:choose>
				
			</c:forEach> 
			
			<c:if test="${nowGrp < totalGrp}">
				<span class='span_box_1'> 
				<a href="${pageContext.request.contextPath}/col/list.do?nowPage=${NnowPage }&sch_type=${sch_type }&sch_value=${sch_value}">다음</a>
				</span>
			</c:if></td>
	</tr>
</Div>
</table>
		

		<DIV class='bottom'>
			<input type='button' value='글쓰기' style='float: right;'
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