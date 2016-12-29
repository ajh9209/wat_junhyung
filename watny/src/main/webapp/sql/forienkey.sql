
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



----------------------------
ALTER TABLE chiefapplicant
 ADD COLUMN ca_rqno int  not null AFTER ca_no
 
ALTER TABLE sproject
 ADD COLUMN sp_rqno int  not null  AFTER sp_code 
 
ALTER TABLE message
 ADD COLUMN msg_recepcode int  not null default 0 AFTER msg_rdate

ALTER TABLE message
 ADD COLUMN msg_transcode int  not null default 0 AFTER msg_recepcode

 
-- 추가사항 외래키 추가
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
   
   ALTER TABLE request
CHANGE COLUMN   rq_comtent   rq_content   varchar(5000) not null

ALTER TABLE message
CHANGE COLUMN   msg_title   msg_title   varchar(30)   not null
   
