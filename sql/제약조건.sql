-- 2024.7.1

-- 테이블 삭제(데이터 삭제와 구분해야함)
DROP TABLE basic_board; -- 테이블 삭제
DELETE TABLE basic_board; -- 데이터 삭제(테이블은 살아있음)
 

-- 게시판 프로그램 테이블 생성
CREATE TABLE BASIC_BOARD(
	-- 컬럼명 데이터타입 [제약조건들]
	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY 
	, TITLE VARCHAR(50) NOT NULL -- NULL 입력 불가(입력 필수라는 것 but, 빈 문자(띄어쓰기)는 입력 가능)
	, WRITER VARCHAR(50) NOT NULL 
	, CONTENT VARCHAR(100) 
	, CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	, READ_CNT INT DEFAULT 0
	--	UNIQUE : 중복불가 <-NULL은 중복처리하지 않아서 미입력시 오류X 실행됨
);

INSERT INTO basic_board (TITLE, WRITER, CONTENT)
VALUES('1','1','1');

INSERT INTO basic_board (BOARD_NUM, TITLE, WRITER)
VALUES(3, '제목', '김작가');

SELECT * FROM basic_board;

INSERT INTO basic_board (BOARD_NUM, TITLE, WRITER, CONTENT, CREATE_DATE, READ_CNT) 
VALUES (1, 'ONLY', 'JUST', 'ME', '2024-07-01', 5); 

INSERT INTO basic_board (BOARD_NUM, TITLE, WRITER, CONTENT, CREATE_DATE, READ_CNT) 
VALUES (2, '제목', '작성자', '내용', '2024-07-01', 3); 


SELECT BOARD_NUM
	, TITLE
	, WRITER
	, CREATE_DATE
	, READ_CNT
FROM basic_board
WHERE TITLE LIKE '%등록%';
    