
CREATE TABLE message(		-- ÂÊÁö Tb
 	msg_no     	  INT		      	 not null 		PRIMARY KEY,
 	msg_sid    	  VARCHAR(15)		 not null, 
 	msg_rid    	  VARCHAR(15)   	 not null,
 	msg_title     VARCHAR(30)   	 not null, 
 	msg_content	  VARCHAR(1000) 	 not null, 
	msg_file   	  VARCHAR(50)   	 null,
	msg_recepcode INT				 not null default 0,
	msg_transcode INT				 not null default 0,
	msg_sdate     DATETIME       	 not null,
	msg_rdate  	  DATETIME      	 null              
);

drop table message