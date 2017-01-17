CREATE TABLE member(		-- 회원가입 Tb
	m_no		INT				not null	primary key,	
	m_name		VARCHAR(15)		not null,					
	m_id		VARCHAR(15)		not null	UNIQUE,			
	m_pw		VARCHAR(100)		not null,					
	m_nick		VARCHAR(20)		not null,					
	m_email		VARCHAR(30)		not null,					
	m_phone		VARCHAR(20)		not null,					
	m_job		VARCHAR(10)		not null,					
	m_lang		VARCHAR(50)		not null,					
	m_level		VARCHAR(10)		not null	default 'company',	
	m_newdate	DATETIME		not null,					
	m_editdate	DATETIME		null			
);

CREATE TABLE spmember(		-- sp팀원(스터디/프로젝트 진행중인 팀원) Tb
	spm_no			INT		not null,
	spm_feedback	VARCHAR(200)		null,
	spm_file		VARCHAR(50)		null,
	spm_startdate	DATETIME		null,
	spm_findate	DATETIME		null,
	spm_fin		VARCHAR(10)		not null		default 'N'
);

CREATE TABLE portfolio (	-- 개인 포트폴리오 Tb
	p_no			INT			not null	primary key,
	p_id			VARCHAR(15)		not null,
	p_title			VARCHAR(100)		not null,
	p_content		VARCHAR(5000)		not null,
	p_file1			VARCHAR(50)		not null,
	p_file2			VARCHAR(50)		null,
	p_file3			VARCHAR(50)		null,
	p_file4			VARCHAR(50)		null,
	p_file5			VARCHAR(50)		null,
	p_newdate		DATETIME		not null,
	p_editdate		DATETIME		null
);

CREATE TABLE message(		-- 쪽지 Tb
 	msg_no    	   INT		      	 not null 		PRIMARY KEY,
 	msg_sid		VARCHAR(15)		 not null, 
 	msg_rid		VARCHAR(15)   		 not null,
 	msg_title		VARCHAR(10)   		 not null, 
 	msg_content	VARCHAR(1000) 		 not null, 
	msg_file		VARCHAR(50)   		 null,
	msg_recepcode INT				 not null default 0,
	msg_transcode INT				 not null default 0,
	msg_sdate	DATETIME       		 not null,
	msg_rdate	DATETIME      		 null              
);

CREATE TABLE money(			-- 사이버머니 Tb
 	money_id	VARCHAR(15)		 not null,
 	money_in	INT		    	 not null		DEFAULT 0, 
 	ca_newdate	DATETIME	   	 not null 
);
CREATE TABLE shop(			-- 장바구니 Tb
	shop_no		INT		not null 		PRIMARY KEY,
	shop_id		VARCHAR(15)  	not null,
	shop_sellno	INT		not null,
	shop_date	VARCHAR(20)   	not null
);

 

CREATE TABLE board(			-- 게시판 Tb
 	b_code  		 VARCHAR(10)   	not null,
 	b_no   		 INT       	  	not null		 PRIMARY KEY,
 	b_origin  		 INT        		not null,
 	b_reply 		 INT		 not null		 DEFAULT 0,
 	b_id   		VARCHAR(15) 	 not null,
	b_title  		VARCHAR(100) 	 not null,
 	b_content   	VARCHAR(5000)	 not null, 
	b_recommend 	 INT  		not null		 DEFAULT 0,
	b_readcnt  	  INT  		not null		 DEFAULT 0,
	b_downcnt   	 INT  		not null		 DEFAULT 0,
 	b_newdate  	 DATETIME     	 not null,
	b_editdate  	 DATETIME      	 null
);


INSERT INTO 
board(b_code, b_no, b_origin, b_reply, b_id, b_title, b_content, b_recommend, b_readcnt, b_downcnt, b_newdate)
values('qna', 2, 1, 0, 'nayoung', '제목입니다.', '내용입니다.', 0, 0, 0, now());


CREATE TABLE reply(			-- 댓글 Tb
	 r_no     		 INT         		  not null	 	 PRIMARY KEY,
 	 r_bno		 INT          	 not null,
	 r_id     		 VARCHAR(15) 	  not null,
	 r_content  	 VARCHAR(5000)	 not null,
 	 r_date     	 DATETIME     	 not null
); 

CREATE TABLE `question` ( 		-- 문제 Tb
	`q_no` 		 INT	not null	PRIMARY KEY,
	`q_level`  	 VARCHAR(10)   	not null,
	`q_type`   	 INT      	not null,
	`q_file` 	 VARCHAR(50)  	not null 
);

CREATE TABLE `answer`(			-- 정답 Tb
	`a_qno`		INT			not null,
	`a_answer`	VARCHAR(50)		not null
);
 
CREATE TABLE `testresult`(		-- 시험결과 Tb
	`tr_qno`		INT			not null,
	`tr_qlevel`		VARCHAR(10)		not null,
	`tr_id`		VARCHAR(15)		not null,	
	`tr_answer`	VARCHAR(50)		not null,			
	`tr_date`		DATETIME		not null				
);



CREATE TABLE sproject (			-- 스터디&프로젝트 Tb
	sp_code		 VARCHAR(10) 		NOT NULL, 				 
	sp_no		 INT 			NOT NULL 	primary key,
	sp_rqno		 INT			NULL, 
	sp_id		 VARCHAR(15)		NOT NULL,				 
	sp_title		 VARCHAR(100)		NOT NULL,				 
	sp_content	 VARCHAR(5000)		NOT NULL,				 
	sp_pay		 INT			NOT NULL,				 
	sp_startdate	 DATETIME		NOT NULL,				 
	sp_findate	 DATETIME		NOT NULL, 				 
	sp_dbcnt 	 INT			NOT NULL 	default 0,		 
	sp_uicnt		 INT			NOT NULL 	default 0,		 
	sp_backcnt	 INT			NOT NULL 	default 0,		 
	sp_servercnt 	INT			NOT NULL 	default 0,		 
	sp_etccnt		 INT			NOT NULL 	default 0,		 
	sp_dbpay		 INT			NOT NULL 	default 0,		 
	sp_uipay		 INT			NOT NULL 	default 0,		 
	sp_backpay	 INT			NOT NULL 	default 0,		 
	sp_serverpay 	INT			NOT NULL 	default 0,		 
	sp_etcpay	 INT			NOT NULL 	default 0,		 
	sp_state		 INT			NOT NULL, 				 
	sp_newdate	 DATETIME		NOT NULL, 				 
	sp_enddate	 DATETIME		NULL				 	 
);


CREATE TABLE spapply (			-- 스터디&프로젝트 팀원 신청자 Tb
	spa_code		 VARCHAR(10) 	NOT NULL, 			
	spa_no		 INT 		NOT NULL,			
	spa_part		 VARCHAR(20)	NOT NULL,			
	spa_id	 	 VARCHAR(15)	NOT NULL,			
	spa_memo	 VARCHAR(200)	NULL,				
	spa_select	 VARCHAR(10)	NOT NULL 	default 'N'	
);


CREATE TABLE chiefapplicant (		-- 의뢰공고 팀장 신청자 Tb
	ca_no	 	 INT			NOT NULL	 primary key, 
	ca_rqno		 INT			NOT NULL,	
	ca_id		 VARCHAR(15) 		NOT NULL,				
	ca_price		 INT			NOT NULL,				
	ca_date	 	 INT			NOT NULL,				
	ca_memo	 VARCHAR(200)		NULL,					
	ca_newdate	 DATETIME		NOT NULL,				
	ca_select	 	VARCHAR(10)		NOT NULL 	default 'N'
);

CREATE TABLE request(			-- 의뢰 Tb
	rq_no			INT			not null 		primary key,
	rq_id			VARCHAR(15)		not null,
	rq_title 			VARCHAR(100)		not null,
	rq_comtent		VARCHAR(5000)		not null,
	rq_templete		VARCHAR(50)		null,
	rq_newdate		DATETIME		not null,
	rq_enddate		DATETIME		null,
	rq_state			INT			not null
);

CREATE TABLE sell(			-- 판매 Tb
	sell_no			INT			not null 		primary key,
	sell_id			VARCHAR(15)		not null,
	sell_title 			VARCHAR(100)		not null,
	sell_category		VARCHAR(30)		not null,
	sell_content		VARCHAR(5000)		not null,
	sell_price			INT			not null,
	sell_preview		VARCHAR(50)		not null,
	sell_file			VARCHAR(50)		not null,
	sell_downcnt		INT			not null 		default 0,
	sell_newdate		DATETIME		null
);

CREATE TABLE spchief(			-- 팀장 공지 Tb
	spc_code 		VARCHAR(10)		not null,
	spc_no			INT			not null,
	spc_feedback		VARCHAR(10)		not null
);

ALTER TABLE portfolio
	ADD CONSTRAINT FK_portfolio_TO_member 
		FOREIGN KEY (
			p_id
		)
		REFERENCES member ( 
			m_id 
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE answer
	ADD CONSTRAINT FK_answer_TO_question 
		FOREIGN KEY (
			a_qno
		)
		REFERENCES question ( 
			q_no
		)
		on update cascade
		on delete cascade;

ALTER TABLE testresult
	ADD CONSTRAINT FK_testresult_TO_question 
		FOREIGN KEY (
			tr_qno
		)
		REFERENCES question ( 
			q_no
		)
		on update cascade
		on delete cascade;
	
		
ALTER TABLE testresult
	ADD CONSTRAINT FK_testresult_TO_member
		FOREIGN KEY (
			tr_id
		)
		REFERENCES member ( 
			m_id
		)
		on update cascade
		on delete cascade;

ALTER TABLE board
	ADD CONSTRAINT FK_board_TO_member
		FOREIGN KEY (
			b_id
		)
		REFERENCES member ( 
			m_id
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE sproject
	ADD CONSTRAINT FK_sproject_TO_member
		FOREIGN KEY (
			sp_id
		)
		REFERENCES member ( 
			m_id
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE chiefapplicant
	ADD CONSTRAINT FK_chiefapplicant_TO_member
		FOREIGN KEY (
			ca_id
		)
		REFERENCES member ( 
			m_id
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE spapply
	ADD CONSTRAINT FK_spapply_TO_member
		FOREIGN KEY (
			spa_id
		)
		REFERENCES member ( 
			m_id
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE spapply
	ADD CONSTRAINT FK_spapply_TO_sproject
		FOREIGN KEY (
			spa_no
		)
		REFERENCES sproject ( 
			sp_no
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE request
	ADD CONSTRAINT FK_request_TO_member
		FOREIGN KEY (
			rq_id
		)
		REFERENCES member ( 
			m_id
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE spmember
	ADD CONSTRAINT FK_spmember_TO_sproject
		FOREIGN KEY (
			spm_no
		)
		REFERENCES sproject ( 
			sp_no
		)
		on update cascade
		on delete cascade;

ALTER TABLE spchief
	ADD CONSTRAINT FK_spchief_TO_sproject
		FOREIGN KEY (
			spc_no
		)
		REFERENCES sproject ( 
			sp_no
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE sell
	ADD CONSTRAINT FK_sell_TO_member
		FOREIGN KEY (
			sell_id
		)
		REFERENCES member ( 
			m_id
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE shop
	ADD CONSTRAINT FK_shop_TO_member
		FOREIGN KEY (
			shop_id
		)
		REFERENCES member ( 
			m_id
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE shop
	ADD CONSTRAINT FK_shop_TO_sell
		FOREIGN KEY (
			shop_sellno
		)
		REFERENCES sell ( 
			sell_no
		)
		on update cascade
		on delete cascade;
		
ALTER TABLE money
	ADD CONSTRAINT FK_money_TO_member
		FOREIGN KEY (
			money_id
		)
		REFERENCES member ( 
			m_id
		)
		on update cascade
		on delete cascade;

ALTER TABLE chiefapplicant
 ADD COLUMN ca_rqno int  not null AFTER ca_no
 
ALTER TABLE sproject
 ADD COLUMN sp_rqno int  not null  AFTER sp_code 
 
ALTER TABLE message
 ADD COLUMN msg_recepcode int  not null default 0 AFTER msg_rdate
ALTER TABLE message
 ADD COLUMN msg_transcode int  not null default 0 AFTER msg_recepcode


ALTER TABLE message
 ADD CONSTRAINT FK_msgsid_TO_member
  FOREIGN KEY (
   msg_sid
  )
  REFERENCES member ( 
   m_id
  )
  on update cascade
  on delete cascade;
  
ALTER TABLE message
 ADD CONSTRAINT FK_msgrid_TO_member
  FOREIGN KEY (
   msg_rid
  )
  REFERENCES member ( 
   m_id
  )
  on update cascade
  on delete cascade;
  
ALTER TABLE chiefapplicant
 ADD CONSTRAINT FK_chiefapplicant_TO_request
  FOREIGN KEY (
   ca_rqno
  )
  REFERENCES request (
   rq_no
  )
  on update cascade
  on delete cascade;
  
ALTER TABLE sproject
 ADD CONSTRAINT FK_sproject_TO_request
   FOREIGN KEY (
    sp_rqno
   )
   REFERENCES request (
    rq_no
   )
   on update cascade
   on delete cascade;
   
   ==============================================
   
-- 추가 변경사항 (01/04)
   -- Spapply 테이블의 기존 spa_no컬럼을 spa_spno로 변경 (프로젝트 번호 저장되는 컬럼)
   ALTER TABLE spapply
   CHANGE COLUMN spa_no spa_spno int null
   -- Spapply 테이블에 spa_no를 원래 기본키로 설정
   ALTER TABLE spapply
   ADD COLUMN spa_no INT   NOT NULL primary key
   -- Spmember 테이블에 팀원ID 컬럼 추가
   ALTER TABLE spmember
   ADD COLUMN spm_id VARCHAR(15) NOT NULL
   -- Spmember 테이블의 ID를 Member 테이블의 ID와 외래키 관계 설정
   ALTER TABLE spmember
         ADD CONSTRAINT FK_spmember_TO_member
         FOREIGN KEY (
            spm_id
         )
         REFERENCES member (
            m_id
         )
         on update cascade
         on delete cascade;
   -- Spmember 테이블의 기존 spm_no를 spm_spno로 변경(프로젝트 번호 담는 컬럼)
   ALTER TABLE spmember
   CHANGE COLUMN spm_no spm_spno int not null
   
   ==============================================
   
   select * from spmember;
   
   DELETE FROM reply
		WHERE r_no = 4;
		
	
select * from reply
where b_code='qna'

INSERT into 
member(m_no, m_name, m_id, m_pw, m_nick, m_email, m_phone,
      m_job, m_lang, m_level, m_newdate, m_editdate )
values(1, '김나영', 'soldesk', 'soldesk', '의뢰인', 'nyk18@naver.com', '01062288024',
      '대학생', 'C, JAVA, Android', 'company', now(), null);
      
      SELECT b_code, b_no, b_origin, b_reply, b_title, b_id,	b_recommend, b_readcnt, b_newdate
		from (
		select @rnum := @rnum + 1 AS rownum, board.*
		FROM (
		select @rnum := 0
		)
		r, board
		WHERE b_code = 'qna'
		ORDER BY b_origin DESC, b_reply ASC
		) result
		WHERE rownum BETWEEN 6 AND 10
		
		