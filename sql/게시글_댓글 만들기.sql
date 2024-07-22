-- 2024.7.22

-- 데이터베이스의 키(KEY)종류
-- KEY : 데이터베이스에서 각 행을 구분하는 식별자를 의미
-- 슈퍼키(SUPER KEY) : 하나의 행을 식별할 수 있는 하나 이상의 컬럼
-- 후보키 (CANDIDATE KEY) : 기본키가 될 수 있는 후보
-- 기본키 (PRIMARY KEY, PK) : 후보키 중 각 행을 구분짓기 위해 결정한 키
-- 대체키(ALTERNATE KEY) : 후보키 중에서 기본키를 제외한 키
-- 외래키(FOREIGN KEY, FK) : 

-- 로그인, 게시글, 댓글 관련 기능 포함 게시판 프로젝트
-- 테이블 : 회원정보, 게시글 번호, 댓글 정보

-- 회원정보 
-- USER : 일반회원
-- ADMIN : 관리자 


CREATE TABLE BOARD_MEMBER (
	MEM_ID VARCHAR(50) PRIMARY KEY
	, MEM_PW VARCHAR(50) NOT NULL
	, MEM_NAME VARCHAR(50) NOT NULL
	, GENDER VARCHAR(10) -- 'male' 'femaele'
	, MEM_ROLE VARCHAR(20) DEFAULT 'USER'
	
);

-- 임시 회원 데이터
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES ('java', '1111', '김자바', 'male', 'USER');
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES ('admin', '1111', '관리자', 'female', 'ADMIN');

SELECT * FROM board_member;

-- 게시판(회원만 게시글 작성 가능)
CREATE TABLE BOARD (
	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY
		, TITLE VARCHAR(50) NOT NULL
		, CONTENT VARCHAR(100)
		, MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER (MEM_ID) -- 외래키
		, CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- 게시글 임시데이터
INSERT INTO board (TITLE, CONTENT, MEM_ID)
VALUES('1번글', '1번내용', 'java');
INSERT INTO board (TITLE, CONTENT, MEM_ID)
VALUES('2번글', '2번내용', 'java');
INSERT INTO board (TITLE, CONTENT, MEM_ID)
VALUES('3번글', '3번내용', 'admin');
		

-- 댓글 테이블
CREATE TABLE BOARD_REPLY (
	REPLY_NUM INT AUTO_INCREMENT PRIMARY KEY
	, REPLY_CONTENT VARCHAR(50) NOT NULL
	, REPLY_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	, MEM_ID VARCHAR(50) REFERENCES board_member (MEM_ID)
	, BOARD_NUM INT REFERENCES BOARD (BOARD_NUM)
);

-- 댓글 임시데이터
INSERT INTO board_reply (REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글1', 'java', 1);
INSERT INTO board_reply (REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글2', 'java', 2);
INSERT INTO board_reply (REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글3', 'java', 1);
INSERT INTO board_reply (REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글4', 'admin', 1);
INSERT INTO board_reply (REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글5', 'admin', 2);

SELECT * FROM board_member;
SELECT * FROM board;
SELECT * FROM board_reply;


-- 데이터 조회 연습
-- 회원의 이름이 '김자바'인 회원이 작성한 게시글의
-- 글번호, 제목, 작성자 아이디,
-- 글번호, 제목, 작성자를 조회, 작성일 기준 최신글부터 조회(내림차순)

SELECT BOARD_NUM, TITLE

