<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../header.jsp"%>
     <form action="./login.do" method="post">
    <span> 아이디 <input type="text" name="m_id"></span>
    <span> 비밀번호 <input type="password" name="m_pw"></span>
    <button type="submit"> Login </button>
      <button type="button" onclick="javascript:history.back();"> Close </button>
      <button type="button"> Sign iN</button>
</form>

<%@ include file="../footer.jsp"%>