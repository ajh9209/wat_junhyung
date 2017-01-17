<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../header.jsp"%>
	<form class="form-horizontal" method="POST" action="./create.do">
		<fieldset>
			<!-- Form Name -->
			<legend>
				<b>Sign In</b>
			</legend>
			<!-- Multiple Radios (inline) -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="radios">기업회원 or
					일반 회원</label>
				<div class="col-md-4">
					<label class="radio-inline" for="radios-0"> <input
						name="m_level" id="radios-0" value="company" checked="checked"
						type="radio">기업회원
					</label> <label class="radio-inline" for="radios-1"> <input
						name="m_level" id="radios-1" value="americano" type="radio">일반회원
					</label>
				</div>
				<div class="col-sm-offset-2 col-sm-10">
					<p class="help-block">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*
						가입 후 등급 테스트를 원하시면 일반회원을 체크해주세요.</p>
				</div>
			</div>
			<!-- m_id input-->
			<div class="form-group has-feedback">
				<label class="col-md-4 control-label" for="textinput">아이디</label>
				<div class="col-md-4">
					<input id="textinput" name="m_id" placeholder="아이디"
						class="form-control input-md" type="text">
				</div>
			</div>
			<!-- m_pw input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">비밀번호</label>
				<div class="col-md-4">
					<input type="password" class="form-control input-md" id="textinput"
						placeholder="비밀번호" name="m_pw">
				</div>
			</div>
			<!-- password check input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">비밀번호확인</label>
				<div class="col-md-4">
					<input type="password" class="form-control input-md" id="textinput"
						placeholder="비밀번호확인" name="repasswdinput">
				</div>
			</div>
			<!-- m_nameinput-->
			<div class="form-group has-feedback">
				<label class="col-md-4 control-label" for="textinput">이름</label>
				<div class="col-md-4">
					<input id="textinput" name="m_name" placeholder="이름"
						class="form-control input-md" type="text">
				</div>
			</div>
			<!-- m_nick input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">닉네임</label>
				<div class="col-md-4">
					<input type="text" class="form-control input-md" id="textinput"
						placeholder="닉네임" name="m_nick">
				</div>
			</div>
			<!-- m_email input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">이메일</label>
				<div class="col-md-4">
					<input type="text" class="form-control input-md" id="textinput"
						placeholder="ex) admin@wat.com" name="m_email">
				</div>
			</div>
			<!-- m_phone input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">전화번호</label>
				<div class="col-md-4">
					<input type="text" class="form-control input-md" id="textinput"
						placeholder="ex) 010-1234-5678" name="m_phone">
				</div>
			</div>

			<!-- m_job Multiple Radios (inline) -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="radios">직업</label>
				<div class="col-md-4">
					<label class="radio-inline" for="radios-0"> <input
						name="m_job" id="radios-0" value="고등학생" checked="checked"
						type="radio">고등학생
					</label> <label class="radio-inline" for="radios-1"> <input
						name="m_job" id="radios-1" value="대학생" type="radio">대학생
					</label> <label class="radio-inline" for="radios-2"> <input
						name="m_job" id="radios-2" value="직장인" type="radio">직장인
					</label> <label class="radio-inline" for="radios-3"> <input
						name="m_job" id="radios-3" value="기타" type="radio">기타 <input
						type="text" class="from-control input-md-2" disabled>
					</label>
				</div>
			</div>

			<!-- m_lang Multiple Radios (inline) -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="radios">관심분야</label>
				<div class="col-md-4">
					<label class="radio-inline" for="radios-0"> <input
						name="m_lang" id="radios-0" value="Java" checked="checked"
						type="radio">JAVA
					</label> <label class="radio-inline" for="radios-1"> <input
						name="m_lang" id="radios-1" value="UI" type="radio">UI
					</label> <label class="radio-inline" for="radios-2"> <input
						name="m_lang" id="radios-2" value="DB" type="radio">DB
					</label> <label class="radio-inline" for="radios-3"> <input
						name="m_lang" id="radios-3" value="SERVER" type="radio">SERVER
					</label> <label class="radio-inline" for="radios-4"> <input
						name="m_lang" id="radios-4" value="기타" type="radio">기타 <input
						type="text" class="from-control input-md-2" disabled>
					</label>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-4 col-sm-2">
					<br>
					<button type="submit" class="btn btn-default">Sign in</button>
					<button type="button" class="btn btn-default">Cancel</button>
				</div>
			</div>
		</fieldset>
	</form>
	<%@ include file="../footer.jsp"%>