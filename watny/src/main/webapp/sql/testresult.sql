
CREATE TABLE `testresult`(		-- 시험결과 Tb
	`tr_qno`	INT				not null,
	`tr_qlevel`	VARCHAR(10)		not null,
	`tr_id`		VARCHAR(15)		not null,	
	`tr_answer`	VARCHAR(50)		not null,			
	`tr_date`	DATETIME		not null				
);