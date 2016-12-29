
CREATE TABLE board(			-- °Ô½ÃÆÇ Tb
 	b_code  		 VARCHAR(10)    not null,
 	b_no   			 INT         	not null	 PRIMARY KEY,
 	b_origin  		 INT        	not null,
 	b_reply 		 INT 		    not null	 DEFAULT 0,
 	b_id   			 VARCHAR(15)    not null,
	b_title  		 VARCHAR(100)   not null,
 	b_content   	 VARCHAR(5000)  not null, 
	b_recommend 	 INT  			not null	 DEFAULT 0,
	b_readcnt  	 	 INT  			not null	 DEFAULT 0,
	b_downcnt   	 INT  			not null	 DEFAULT 0,
 	b_newdate  	 	 DATETIME       not null,
	b_editdate  	 DATETIME       null
);