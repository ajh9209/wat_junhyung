<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../header.jsp"%>
<%@ include file="../cmuLeftTemp.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
%>

<!-- body start -------------------------------------->
					<h3>Q&amp;A</h3>
					
	<FORM name='frm' method='POST' action='./update.do'>
		<div class='table'>
			<table class = 'table'>
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
					<td>${dto.b_title }</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>${dto.b_content }</td>
				</tr>
				<tr>
					<th>조회수</th>
					<td>${dto.b_readcnt }</td>
				</tr>
				<tr>
					<th>추천수</th>
					<td>${dto.b_recommend }</td>
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
					onclick="location.href='./update.do?b_no=${dto.b_no }' ">
			<input type='button' 
					value='목록'
					onclick="location.href='./list.do'">
			<input type='button' 
					value='삭제'
					onclick="location.href='./delete.do?b_no=${dto.b_no }' ">
	       <input type='button' 
					value='추천'
					onclick="reCommend(${dto.b_no })">
			<input type='button' 
					value='답변글 쓰기'
					onclick="location.href='./rlpCreate.do?b_no=${dto.b_no }&b_origin=${dto.b_origin}&b_reply=${dto.b_reply}' ">
		</div>		
	</FORM>
	
<FORM name='replyfrm' method='POST'  action='./replyCreate.do'>
	<table class='table'>
	<tr>
		<td> <input type='text' name='r_id'> </td>
		<td> <textarea name='r_content'></textarea> </td>
		<td> <button type='submit'>등록</button> </td>
		<td> <input type="hidden"  name='b_no'  value=${dto.b_no }> </td> 
	</tr>	
	
	</table>
</FORM>

<table class='table'>
	<c:forEach var="dto" items="${list }">
		<tr>

			<td>${dto.r_id }</td>
			<td>${dto.r_content }</td>
			<td>${dto.r_date }</td>
			<td><input type="button" value="삭제"
				onclick="replyDeleteFrom(${dto.r_no },${dto.r_bno } )"></td>
		</tr>
	</c:forEach>
</table>

<!-- body end -------------------------------------->
<script>
function replyDeleteFrom(r_no, r_bno){
	    if (confirm(r_no+"삭제하시겠습니까?!") == true) {
	    	location.href = "./replyDelete.do?r_no="+r_no+"&r_bno="+r_bno;
	    } else {
	    	window.close();
	    }
}

function reCommend(b_no){
	 if(confirm("추천하시겠습니까?") == true) {
		location.href = "./recommend.do?b_no="+b_no;
   } else {
   	window.close();
   } 
}

</script>
<%@ include file="../footer.jsp"%>