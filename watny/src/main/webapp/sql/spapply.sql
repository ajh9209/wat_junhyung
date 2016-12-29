
CREATE TABLE spapply (			-- 스터디&프로젝트 팀원 신청자 Tb
	spa_code	 VARCHAR(10) 	NOT NULL, 			
	spa_no		 INT 			NOT NULL,			
	spa_part	 VARCHAR(20)	NOT NULL,			
	spa_id	 	 VARCHAR(15)	NOT NULL,			
	spa_memo	 VARCHAR(200)	NULL,				
	spa_select	 VARCHAR(10)	NOT NULL 	default 'N'	
);
