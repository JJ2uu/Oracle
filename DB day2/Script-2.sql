CREATE TABLE "HR"."NOTICE" (
	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITERDATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEWCOUNT" NUMBER(38,0)
   )
   
-- 추천게시판(recommend)
   
CREATE TABLE "HR"."RECOMMEND" (
	"RE_NO" number(38,0),
	"TITLE" varchar2(100),
	"CONTENT" varchar2(100),
	"WRITER" varchar2(100)
)

ALTER TABLE HR.RECOMMEND ADD VIEWCOUNT NUMBER(38,0) NULL;

ALTER TABLE RECOMMEND DROP COLUMN VIEWCOUNT;

ALTER TABLE HR.RECOMMEND ADD TEXT1 VARCHAR2(100) NULL;

ALTER TABLE RECOMMEND DROP COLUMN TEXT1;

CREATE TABLE "HR"."BOARD2" (
	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITERDATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEWCOUNT" NUMBER(38,0)
   )
   
ALTER TABLE HR.BOARD2 DROP COLUMN TEST

ALTER TABLE HR.BOARD2 DROP COLUMN TEST2
 
ALTER TABLE HR.BOARD2 DROP COLUMN TEST3

ALTER TABLE HR.BOARD2 MODIFY WRITER VARCHAR2(200)

ALTER TABLE HR.BOARD2 DROP COLUMN VIEWCOUNT

ALTER TABLE HR.BOARD2 ADD VIEWCOUNT NUMBER(38,0) NULL;

DROP TABLE HR.BOARD2

DROP TABLE HR.BBS2 



-- DCL : DB 관리/제어해주는 문법(계정 생성, 계정권한 부여, 백업, 복구)

CREATE USER apple IDENTIFIED BY a1234 -- 처음 생성하면 권한이 없음

GRANT CONNECT, resource, dba TO apple -- 권한을 부여 (접속권한, 리소스권한, 관리자권한)

CREATE TABLE HR.BBS (
	"NO" NUMBER(38,0), -- DDL 에서 PRIMARY KEY 설정은 타입 뒤에 PRIMARY Key를 적어준다.
	"TITLE" VARCHAR2(100),
	"CONTENT" VARCHAR2(100),
	"WRITER" VARCHAR2(100)
)

INSERT INTO HR."MEMBER" VALUES ('100', '100', 'PARK', '011')

INSERT INTO HR."MEMBER" VALUES ('200', '200', 'PARK', '011')

INSERT INTO HR."MEMBER" VALUES ('300', '300', 'PARK', '011')

SELECT * FROM "MEMBER" -- 전부 다 보여줘라

SELECT * FROM MEMBER WHERE ID = '100' -- 아이디가 100인 애들만 보여줘라

SELECT id, name FROM MEMBER WHERE id = '100'-- id가 100인 id - name 칼럼

SELECT name, id FROM MEMBER WHERE id = '100' -- id가 100인 name - id

SELECT tel FROM MEMBER WHERE name = 'PARK'

UPDATE MEMBER SET name = 'kim' WHERE id = '100'

UPDATE MEMBER SET name = 'yang' WHERE id = '200'

UPDATE MEMBER SET name = 'lee' WHERE id = '300'

UPDATE MEMBER SET pw = '8888', tel = '999' WHERE id = 'ICE'

DELETE FROM MEMBER WHERE id = '100'

DELETE FROM MEMBER WHERE tel = '011'

SELECT * FROM MEMBER WHERE id = '200' AND tel = '011'

SELECT * FROM MEMBER WHERE id = '200' OR tel = '011'

CREATE TABLE product (
	id varchar2(200),
	name varchar2(2000),
	content varchar2(200),
	price varchar2(200),
	company varchar2(200),
	img varchar2(200)
)

SELECT * FROM product

SELECT * FROM product ORDER BY id -- 오름차순 정렬

SELECT * FROM product ORDER BY id DESC -- 내림차순 정렬

SELECT * FROM product ORDER BY PRICE DESC -- price로 내림차순 정렬하여 전체컬럼 검색

SELECT * FROM product ORDER BY COMPANY  -- company로 오름차순 정렬하여 제품의 이름, 내용, 가격 검색

SELECT name, price FROM product WHERE id = '100' -- id가 100인 제품의 이름과 가격 검색

SELECT content, company FROM product WHERE price = '5000' -- price가 5000인 제품명과 회사명

SELECT content, img FROM product WHERE id = '100' AND price = '1000' -- id가 100이고 가격이 1000인 제품명과 이미지 검색

SELECT company, content FROM product WHERE company = 'c100' -- 회사명이 c100인 회사명과 제품명

SELECT content, price FROM product WHERE company = 'c100' OR company = 'c200' -- 회사명이 c100, c200인 제품명과 가격

UPDATE product SET content = 'sold out' WHERE price = '5000' -- price가 5000원인 제품의 content를 품절로 수정

UPDATE product SET price = '10000', img = 'o.png' WHERE id = '100' OR id = '102' -- id가 100, 102번 제품의 img를 o.png로, price를 10000으로 수정

UPDATE product SET company = 'apple', name = 'appleshoes' WHERE id = '101' -- id가 101번 제품의 company를 apple, name은 appleshoes로 수정

DELETE FROM  product WHERE name = 'shoes1' OR id = '107' -- name이 shoes1이거나 id가 107인 제품 삭제

DELETE FROM product WHERE company = 'c100' -- 회사명이 c100인 경우 모든 정보 삭제

DELETE FROM product -- 테이블의 모든 정보 삭제

DROP TABLE product -- 테이블 삭제


ALTER TABLE HR.REPLY MODIFY ID NUMBER(38,0)

ALTER TABLE HR.REPLY MODIFY ORIID NUMBER(38,0)