
CREATE TABLE `question` ( 		-- ¹®Á¦ Tb
	`q_no` 		 INT			not null	PRIMARY KEY,
	`q_level`  	 VARCHAR(10)    not null,
	`q_type`   	 INT      		not null,
	`q_file` 	 VARCHAR(50)  	not null 
);