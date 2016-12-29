
CREATE TABLE portfolio (	-- 개인 포트폴리오 Tb
	p_no			INT				not null	primary key,
	p_id			VARCHAR(15)		not null,
	p_title			VARCHAR(100)	not null,
	p_content		VARCHAR(5000)	not null,
	p_file1			VARCHAR(50)		not null,
	p_file2			VARCHAR(50)		null,
	p_file3			VARCHAR(50)		null,
	p_file4			VARCHAR(50)		null,
	p_file5			VARCHAR(50)		null,
	p_newdate		DATETIME		not null,
	p_editdate		DATETIME		null
);