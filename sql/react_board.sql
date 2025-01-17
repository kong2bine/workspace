
-- 2024.7.15
-- react 기본 게시판 프로젝트
CREATE TABLE REACT_BOARD(
	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY
	, BOARD_TITLE VARCHAR(50) NOT NULL
	, BOARD_CONTENT VARCHAR(100)
	, BOARD_WRITER VARCHAR(30) NOT NULL
	, CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	
);

SELECT * FROM REACT_BOARD;

INSERT INTO REACT_BOARD(
	BOARD_TITLE
	,BOARD_WRITER
) VALUES (
	'두번째 게시글'
	, '김자바'
);

SELECT BOARD_NUM
	,BOARD_TITLE
	,BOARD_WRITER
	,CREATE_DATE
FROM react_board;

SELECT BOARD_NUM
   ,BOARD_TITLE
FROM react_board;

SELECT BOARD_NUM
	,BOARD_TITLE
	,BOARD_CONTENT
	,BOARD_WRITER
	,CREATE_DATE
FROM react_board
WHERE BOARD_NUM = 1;


CREATE TABLE react_student(
	STU_NUM INT AUTO_INCREMENT PRIMARY KEY
	, STU_NAME VARCHAR(30) NOT NULL
	, KOR_SCORE INT
	, ENG_SCORE INT
	, MATH_SCORE INT
	, STU_AGE INT
	, STU_TELL VARCHAR(20) UNIQUE -- 중복 안됨
	, STU_ADDR VARCHAR(50)	
);

SELECT * FROM react_student;

SELECT STU_NUM
	,STU_NAME
	,KOR_SCORE
	,ENG_SCORE
	,MATH_SCORE
FROM react_student;

INSERT INTO react_student(STU_NAME, KOR_SCORE, ENG_SCORE, MATH_SCORE)
VALUES('김샹궈',55,65,85);

SELECT * FROM react_student;

SELECT 	STU_NUM 
	, STU_NAME 
	, KOR_SCORE 
	, ENG_SCORE 
	, MATH_SCORE 
	, STU_AGE 
	, STU_TELL 
	, STU_ADDR
FROM react_student
WHERE STU_NUM = 1;

