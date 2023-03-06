CREATE TABLE HR.studentInformation (
	학생번호 NUMBER(38,0) PRIMARY KEY,
	학생이름 varchar2(100),
	주소 varchar2(100),
	학과 varchar2(100)
)

CREATE TABLE HR.SUBJECT2 (
	강좌이름 varchar2(100) PRIMARY KEY,
	강의실 varchar2(100)
)

CREATE TABLE HR.RECORD (
	학생번호 number(38,0),
	강좌이름 varchar2(100),
	성적 float
)

DROP TABLE hr."RECORD"

CREATE TABLE HR.department (
	학과 varchar2(100) PRIMARY KEY,
	학과사무실 varchar2(100)
)

INSERT INTO HR.DEPARTMENT
VALUES ('컴퓨터과', '공학관101')

INSERT INTO hr.DEPARTMENT
VALUES ('체육학과', '체육관101')

INSERT INTO hr.STUDENTINFORMATION 
VALUES (501, '박지성', '영국 멘체스타', '컴퓨터과')

INSERT INTO HR.STUDENTINFORMATION
VALUES (401, '김연아', '대한민국 서울', '체육학과')

INSERT INTO HR.STUDENTINFORMATION
VALUES (402, '장미란', '대한민국 강원도', '체육학과')

INSERT INTO HR.STUDENTINFORMATION
VALUES (502, '추신수', '미국 클리블랜드', '컴퓨터과')

INSERT INTO SUBJECT2
VALUES ('데이터베이스', '공학관110')

INSERT INTO SUBJECT2
VALUES ('스포츠경영학', '체육관103')

INSERT INTO SUBJECT2
VALUES ('자료구조', '공학관111')

INSERT INTO RECORD
VALUES (501, '데이터베이스', 3.5)

INSERT INTO RECORD
VALUES (401, '데이터베이스', 4)

INSERT INTO RECORD
VALUES (402, '스포츠경영학', 3.5)

INSERT INTO RECORD
VALUES (502, '자료구조', 4)

INSERT INTO RECORD
VALUES (501, '자료구조', 3.5)

SELECT *
FROM STUDENTINFORMATION s
LEFT OUTER JOIN DEPARTMENT d 
ON (s.학과 = d.학과)

SELECT *
FROM STUDENTINFORMATION s
LEFT OUTER JOIN "RECORD" r
ON (s.학생번호 = r.학생번호)
LEFT OUTER JOIN SUBJECT2 s2 
ON (r.강좌이름 = s2.강좌이름)


SELECT * FROM STUDENTINFORMATION s 
LEFT JOIN TABLE "RECORD" r
ON (s.학생번호 = r.학생번호 )

SELECT s.학생번호, s.학생이름, s.주소, s.학과, r.강좌이름, s2.강의실 , r.성적
FROM STUDENTINFORMATION s 
LEFT OUTER JOIN "RECORD" r
ON (s.학생번호 = r.학생번호)
LEFT OUTER JOIN SUBJECT2 s2 
ON (r.강좌이름 = s2.강좌이름)

SELECT s.학생번호, s.학생이름, s.주소, s.학과, r.강좌이름, s2.강의실, r.성적
FROM STUDENTINFORMATION s 
INNER JOIN "RECORD" r 
ON (s.학생번호 = r.학생번호)
INNER JOIN SUBJECT2 s2 
ON (r.강좌이름 = s2.강좌이름)

SELECT * FROM STUDENTINFORMATION WHERE 학생번호 IN (SELECT 학생번호 FROM "RECORD" WHERE 성적 = 3.5)

SELECT * FROM "RECORD" WHERE 강좌이름 = (SELECT 강좌이름 FROM SUBJECT2 WHERE 강의실 = '공학관110')

INSERT INTO membership
VALUES ('JJ2uu', '장유진', '대한민국 서울')

('노브랜드 사골육수', 980, '한끼뚝딱')
('노브랜드 쇠고기 사골미역국', 1980, '한끼뚝딱')
('노브랜드 비빔쫄면', 3380, '한끼뚝딱')
('노브랜드 마라탕면', 2180, '한끼뚝딱')
('노브랜드 가벼운한끼 콘포테이토마차', 4980, '한끼뚝딱')

CREATE TABLE HR.MEMBERSHIP (
	ID varchar2(100) PRIMARY KEY,
	NAME varchar2(100),
	ADDRESS varchar2(100)
)

CREATE TABLE HR.CART (
	PRODUCT varchar2(100),
	QUANTITY NUMBER(38,0),
	ID varchar2(100)
)

CREATE TABLE HR.PRODUCT5 (
	PRODUCT varchar2(100) PRIMARY KEY,
	PRICE NUMBER(38,0),
	CATEGORY varchar2(100)
)

CREATE TABLE HR.EVENT (
	CATEGORY varchar2(100) PRIMARY KEY,
	EVENT varchar2(100)
)

-- MEMBERSHIP

INSERT INTO HR.MEMBERSHIP
VALUES ('JJ', '장길동', '서울특별시 영등포구')

INSERT INTO HR.MEMBERSHIP
VALUES ('HH', '홍길동', '경기도 안양시')

INSERT INTO HR.MEMBERSHIP
VALUES ('KK', '김길동', '강원도 춘천시')

INSERT INTO HR.MEMBERSHIP
VALUES ('CC', '최길동', '경상남도 김해시')

-- EVENT

INSERT INTO HR.EVENT
VALUES ('반려/취미', null)

INSERT INTO HR.EVENT
VALUES ('정육', '할인')

INSERT INTO HR.EVENT
VALUES ('과자/빙과', '사은')

INSERT INTO HR.EVENT
VALUES ('한끼뚝딱', null)

-- PRODUCT5

INSERT INTO HR.PRODUCT5
VALUES ('반려견 사료', 13980, '반려/취미')

INSERT INTO HR.PRODUCT5
VALUES ('츄잉스틱 플레인 요거트', 5480, '반려/취미')

INSERT INTO HR.PRODUCT5
VALUES ('오리목뼈', 8580, '반려/취미')

INSERT INTO HR.PRODUCT5
VALUES ('반려묘 사료', 24980, '반려/취미')

INSERT INTO HR.PRODUCT5
VALUES ('삼겹살 바로구이', 12900, '정육')

INSERT INTO HR.PRODUCT5
VALUES ('빅그릴프랑크', 5880, '정육')

INSERT INTO HR.PRODUCT5
VALUES ('닭다리살 스테이크', 9580, '정육')

INSERT INTO HR.PRODUCT5
VALUES ('한우국거리', 12980, '정육')

INSERT INTO HR.PRODUCT5
VALUES ('마늘 오리불고기', 6980, '정육')

INSERT INTO HR.PRODUCT5
VALUES ('초코베어', 2900, '과자/빙과')

INSERT INTO HR.PRODUCT5
VALUES ('구슬아이스크림', 6900, '과자/빙과')

INSERT INTO HR.PRODUCT5
VALUES ('졸음깨는껌', 3280, '과자/빙과')

INSERT INTO HR.PRODUCT5
VALUES ('스몰리아띠네', 2580, '과자/빙과')

INSERT INTO HR.PRODUCT5
VALUES ('고소한맛짱', 2180, '과자/빙과')

INSERT INTO HR.PRODUCT5
VALUES ('노브랜드 사골육수', 980, '한끼뚝딱')

INSERT INTO HR.PRODUCT5
VALUES ('노브랜드 쇠고기 사골미역국', 1980, '한끼뚝딱')

INSERT INTO HR.PRODUCT5
VALUES ('노브랜드 비빔쫄면', 3380, '한끼뚝딱')

INSERT INTO HR.PRODUCT5
VALUES ('노브랜드 마라탕면', 2180, '한끼뚝딱')

INSERT INTO HR.PRODUCT5
VALUES ('노브랜드 가벼운한끼 콘포테이토마차', 4980, '한끼뚝딱')

INSERT INTO HR.CART
VALUES ('노브랜드 가벼운한끼 콘포테이토마차', 1, 'HH')

INSERT INTO HR.CART
VALUES ('고소한맛짱', 1, 'HH')

INSERT INTO HR.CART
VALUES ('삼겹살 바로구이', 1, 'HH')

INSERT INTO HR.CART
VALUES ('삼겹살 바로구이', 1, 'JJ')

INSERT INTO HR.CART
VALUES ('노브랜드 마라탕면', 2, 'JJ')

INSERT INTO HR.CART
VALUES ('구슬아이스크림', 3, 'JJ')

INSERT INTO HR.CART
VALUES ('초코베어', 1, 'KK')

INSERT INTO HR.CART
VALUES ('노브랜드 쇠고기 사골미역국', 1, 'KK')

INSERT INTO HR.CART
VALUES ('고소한맛짱', 1, 'KK')

INSERT INTO HR.CART
VALUES ('삼겹살 바로구이', 2, 'CC')

INSERT INTO HR.CART
VALUES ('졸음깨는껌', 2, 'CC')

INSERT INTO HR.CART
VALUES ('노브랜드 마라탕면', 5, 'CC')

SELECT c.ID , m.NAME , c.PRODUCT , p.CATEGORY , e.EVENT , p.PRICE
FROM CART c , MEMBERSHIP m , PRODUCT5 p , EVENT e 
WHERE c.ID = m.ID AND c.PRODUCT = p.PRODUCT AND p.CATEGORY = e.CATEGORY
ORDER BY m.NAME

