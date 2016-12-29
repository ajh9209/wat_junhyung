
CREATE TABLE money(			-- 사이버머니 Tb
 	money_id     VARCHAR(15)	 not null,
 	money_in     INT		     not null		DEFAULT 0, 
 	ca_newdate   DATETIME	     not null 
);