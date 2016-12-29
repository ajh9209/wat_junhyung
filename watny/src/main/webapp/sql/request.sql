
CREATE TABLE request(			-- 의뢰 Tb
	rq_no			INT					not null 		primary key,
	rq_id			VARCHAR(15)			not null,
	rq_title 		VARCHAR(100)		not null,
	rq_content		VARCHAR(5000)		not null,
	rq_templete		VARCHAR(50)			null,
	rq_newdate		DATETIME			not null,
	rq_enddate		DATETIME			null,
	rq_state		INT					not null
);


select * from request;


Insert into 
request(rq_no, rq_id, rq_title, rq_content, rq_templete, rq_newdate, rq_enddate, rq_state)
values(1, 'nayoung', '제목입니다', '내용입니다.', 'templete_nayoung1.png', now(), null, 0);
       

Insert into 
request(rq_no, rq_id, rq_title, rq_content, rq_templete, rq_newdate, rq_enddate, rq_state)
values(2, 'sangyeop', '제목입니다', '내용입니다.\n내용입니다.\n내용입니다.', 'templete_sangyeop1.png', now(), null, 0);


INSERT INTO request(rq_no, rq_id, rq_title, rq_content, rq_templete, 
			  				rq_newdate, rq_enddate, rq_state)
		VALUES(3,
		       'nayoung', '제목', '내용입니다\n내용입니다.', 'templete_nayoung2.png', 
				now(), '2017-02-11 10:00:00', 0	);


       