
CREATE TABLE reply(			-- ´ñ±Û Tb
	 r_no     		 INT           not null 	 PRIMARY KEY,
 	 r_bno			 INT           not null,
	 r_id     		 VARCHAR(15)   not null,
	 r_content  	 VARCHAR(5000) not null,
 	 r_date     	 DATETIME      not null
); 