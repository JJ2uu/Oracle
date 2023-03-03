SELECT UPPER(ename) FROM emp; -- 대문자로

SELECT LOWER(ename) FROM emp; -- 소문자로

SELECT INITCAP(ename) FROM emp; -- 첫글자만 대문자로

SELECT LENGTH(ename) FROM emp; -- 글자수

SELECT LENGTH(trim(ename)) FROM emp; -- 글자수

SELECT substr(ename, 2) FROM emp; -- 두 번째 글자부터 추출

SELECT substr(ename, 1, 2) FROM emp; -- 첫 번째 글자부터 2개 추출

SELECT substr(ename, -2) FROM emp; -- 뒤에서 두 번째 글자부터 끝까지

SELECT REPLACE(ename, 'L', 'N') FROM emp; -- L 글자를 N, 으로 변경

SELECT LPAD(ename, 6, '#') FROM emp; -- 6글자 중 빈 공간을 #으로 채우기, 채우지 않을 경우 공백으로

SELECT CONCAT(EMPNO , ename) FROM emp; -- enpno와 ename 을 결합

SELECT EMPNO || ':' || ENAME FROM EMP; -- 오라클에서 문자열 3개 결합

SELECT TRIM('W' FROM ename) FROM emp; -- W글자 삭제

SELECT TRIM('  hong ') FROM emp; -- 공백을 제거

SELECT * FROM EMP

SELECT TRIM(BOTH 'A' from ename) FROM emp 

SELECT TRIM(LEADING 'A' from ename) FROM emp

SELECT TRIM(TRAILING 'A' from ename) FROM emp

SELECT REPLACE(ename, ' ', '') FROM emp -- 중간 공백 없애기는 replace로

SELECT * FROM emp WHERE HIREDATE > TO_DATE('1981/01/01', 'YYYY/MM/DD'); 

UPDATE EMP
SET comm = 0
WHERE COMM IS NULL

SELECT SAL + COMM AS total FROM EMp

SELECT LENGTH(Ename) FROM EMP

SELECT LENGTH(ename) FROM emp WHERE job = 'MANAGER'

SELECT ename, job FROM emp WHERE comm = NULL

SELECT hiredate FROM emp WHERE NOT comm = NULL

SELECT SUBSTR(ename, 2) FROM EMP 

SELECT SUBSTR(job, 1, 3) FROM EMP 

SELECT REPLACE(ename, 'K', 'P') FROM EMP

SELECT empno || '번은 ' || Ename || '입니다' FROM emp

SELECT hiredate,
	TO_char(sysdate, 'MM') AS MM,
	TO_CHAR(sysdate, 'DAY') AS DAY
FROM EMP

SELECT hiredate,
	TO_CHAR(SYSDATE, 'YYYY') AS YYYY
FROM EMP

SELECT CASE job
	WHEN 'MANAGER' THEN 'level1'
	WHEN 'SALESMAN' THEN 'level2'
	ELSE 'level3'
	END AS LEVEL_RESULT
FROM EMP

SELECT COUNT(*)
FROM EMP

SELECT COUNT(SAL)
FROM EMP

-- 집계함수
SELECT COUNT(SAL), SUM(SAL), AVG(SAL), MIN(SAL), MAX(SAL)  
FROM EMP
WHERE JOB = 'SALESMAN'

SELECT JOB, COUNT(SAL), SUM(SAL), ROUND(AVG(SAL)), MIN(SAL), MAX(SAL)  
FROM EMP
GROUP BY JOB
HAVING COUNT(SAL) >= 4  -- 그룹 안에서 조건을 주고싶을 때는 HAVING 사용
ORDER BY JOB DESC -- 모든 검색이 다 끝난 후, 결과를 정렬하고자 하는 경우

SELECT * FROM EMP

SELECT COUNT(SAL) FROM EMP

SELECT COUNT(SAL) FROM EMP WHERE DEPTNO = 20 OR MGR <= 7700

SELECT MIN(SAL) FROM EMP WHERE DEPTNO = 10 OR DEPTNO = 20

SELECT MIN(SAL), MAX(SAL), SUM(SAL)
FROM EMP

SELECT DEPTNO, ROUND(AVG(SAL))
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO DESC

SELECT DEPTNO, SUM(SAL)
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO

SELECT DEPTNO ,ROUND(AVG(SAL))
FROM EMP
GROUP BY DEPTNO
HAVING ROUND(AVG(SAL)) >= 2000
ORDER BY DEPTNO DESC

SELECT JOB, COUNT(*), ROUND(AVG(SAL))
FROM EMP
GROUP BY JOB
HAVING JOB = 'MANAGER'

SELECT COUNT(ENAME)
FROM emp
WHERE ENAME LIKE '%S%'

SELECT COUNT(*)
FROM EMP
WHERE SAL >= 3000 AND COMM IS NOT NULL 
ORDER BY SAL DESC

-- join 왜 하는가 ?
-- 검색을 하고 싶은데 항목들이 여러 개의 테이블에 흩어져 있는 경우
-- 테이블을 모아서(합해서) 검색

SELECT * FROM BBS2 b, MEMBER4 m
WHERE m.ID = b.WRITER

SELECT NO, TITLE, NAME
FROM BBS2 b, MEMBER4 m
WHERE m.ID = b.WRITER

-- Inner join
-- emp 와 dept 테이블 조인
-- EMPNO, ENAME, JOB, DEPTNO, LOC

SELECT e.EMPNO, e.ENAME, e.JOB, d.LOC, d.DEPTNO
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO

SELECT *
FROM MEMBER4 m
LEFT OUTER JOIN BBS2 b
on(m.ID = b.WRITER)

SELECT *
FROM MEMBER4 m
RIGHT OUTER JOIN BBS2 b
on(m.ID = b.WRITER)

SELECT *
FROM EMP e 
LEFT OUTER JOIN DEPT d 
on(e.DEPTNO = d.DEPTNO)

SELECT *
FROM EMP e 
right OUTER JOIN DEPT d 
on(e.DEPTNO = d.DEPTNO)

SELECT *
FROM BBS2 b , MEMBER4 m 
WHERE b.WRITER = m.ID

SELECT *
FROM MEMBER4 m 
LEFT OUTER JOIN BBS2 b 
on(m.ID = b.WRITER)

SELECT *
FROM MEMBER4 m 
RIGHT OUTER JOIN BBS2 b 
on(m.ID = b.WRITER)

CREATE TABLE HR.COMPANY (
	ID varchar2(200) PRIMARY KEY,
	NAME varchar2(200),
	ADDR varchar2(200),
	TEL varchar2(200)
)

INSERT INTO COMPANY
VALUES ('c100', 'good', 'seoul', '011')

INSERT INTO COMPANY
VALUES ('c200', 'joa', 'busan', '012')

INSERT INTO COMPANY
VALUES ('c300', 'maria', 'ulsan', '013')

INSERT INTO COMPANY
VALUES ('c400', 'my', 'kwangju', '014')

SELECT * FROM COMPANY

-- inner join
SELECT *
FROM PRODUCT p , COMPANY c 
WHERE p.COMPANY = c.ID

-- left outer join
SELECT *
FROM PRODUCT p 
LEFT OUTER JOIN COMPANY c 
on(p.COMPANY = c.ID)

-- right outer join
SELECT *
FROM PRODUCT p 
RIGHT OUTER JOIN COMPANY c 
on(p.COMPANY = c.ID)

-- 이름과 가격, 아이디
SELECT p.NAME, p.PRICE, c.ID
FROM PRODUCT p 
LEFT OUTER JOIN COMPANY c 
ON(p.COMPANY = c.ID)

-- 컨텐트와 주소와 전화번호
SELECT p.CONTENT, c.ADDR, c.TEL
FROM PRODUCT p 
RIGHT OUTER JOIN COMPANY c 
on(p.COMPANY = c.ID)