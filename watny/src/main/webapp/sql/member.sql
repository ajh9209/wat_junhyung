CREATE TABLE member(		-- 회원가입 Tb
	m_no		INT				not null	primary key,	
	m_name		VARCHAR(15)		not null,					
	m_id		VARCHAR(15)		not null	UNIQUE,			
	m_pw		VARCHAR(100)	not null,					
	m_nick		VARCHAR(20)		not null,					
	m_email		VARCHAR(30)		not null,					
	m_phone		VARCHAR(20)		not null,					
	m_job		VARCHAR(10)		not null,					
	m_lang		VARCHAR(50)		not null,					
	m_level		VARCHAR(10)		not null	default 'company',	
	m_newdate	DATETIME		not null,					
	m_editdate	DATETIME		null						
);