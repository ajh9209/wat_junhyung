CREATE TABLE spmember(		-- sp팀원(스터디/프로젝트 진행중인 팀원) Tb
	spm_no			INT				not null,
	spm_feedback	VARCHAR(200)	null,
	spm_file		VARCHAR(50)		null,
	spm_startdate	DATETIME		null,
	spm_findate		DATETIME		null,
	spm_fin			VARCHAR(10)		not null	default 'N'
);

DROP TABLE spmemeber;