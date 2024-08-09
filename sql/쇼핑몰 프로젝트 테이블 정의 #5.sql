-- 2024.8.1
-- 쇼핑몰 프로젝트 테이블 정의
-- 테이블 종류 --
-- 1. 회원 정보 테이블
-- 2. 상품 카테고리 테이블
-- 3. 상품 정보 테이블
-- 4. 상품 이미지 정보 테이블
-- 5. 장바구니 정보 테이블
-- 6. 구매 정보 테이블 

-- 1. 회원 정보 테이블
-- 권한 : USER, ADMIN
CREATE TABLE SHOP_MEMBER (
    MEM_ID VARCHAR(50) PRIMARY KEY,
    MEM_PW VARCHAR(100) NOT NULL,
    MEM_NAME VARCHAR(50) NOT NULL,
    MEM_TEL VARCHAR(30) UNIQUE,
    POST VARCHAR(10),
    MEM_ADDR VARCHAR(50),
    ADDR_DETAIL VARCHAR(100),
    MEM_EMAIL VARCHAR(100),
    MEM_ROLE VARCHAR(30) DEFAULT 'USER'
);

-- 2. 상품 카테고리 테이블(소설, 에세이, 인터넷/IT)
CREATE TABLE ITEM_CATEGORY (
    CATE_CODE INT AUTO_INCREMENT PRIMARY KEY,
    CATE_NAME VARCHAR(50) NOT NULL UNIQUE
);

-- 카테고리 데이터
INSERT INTO ITEM_CATEGORY (CATE_NAME) VALUES ('인터넷/IT');
INSERT INTO ITEM_CATEGORY (CATE_NAME) VALUES ('소설/에세이');
INSERT INTO ITEM_CATEGORY (CATE_NAME) VALUES ('자기계발');

-- 3. 상품 정보 테이블
-- ITEM_STATUS(상품 상태) : FOR_SALE(판매중), SOLD_OUT(매진) 
CREATE TABLE SHOP_ITEM (
    ITEM_CODE INT AUTO_INCREMENT PRIMARY KEY,
    ITEM_NAME VARCHAR(50) NOT NULL UNIQUE,
    ITEM_PRICE INT NOT NULL,
    ITEM_INTRO VARCHAR(100),
    ITEM_STOCK INT DEFAULT 20,
    ITEM_STATUS VARCHAR(10) DEFAULT 'FOR_SALE',
    CATE_CODE INT NOT NULL,
    FOREIGN KEY (CATE_CODE) REFERENCES ITEM_CATEGORY (CATE_CODE) 
);


-- 데이터 조회
SELECT * FROM SHOP_MEMBER;

-- 회원 정보 업데이트
UPDATE SHOP_MEMBER
SET MEM_ROLE = 'ADMIN'
WHERE MEM_ID = 'Doyoung';

-- 카테고리 데이터 조회
SELECT CATE_CODE, CATE_NAME FROM item_category;

-- SELECT * FROM ITEM_CATEGORY WHERE CATE_CODE = 1;
-- UPDATE SHOP_ITEM SET CATE_CODE = 2 WHERE ITEM_CODE = 1;

-- SELECT * FROM shop_item;
-- SELECT * FROM item_category;

-- 상품 이미지 정보 테이블
-- ORIGIN_FILE_NAME : 원본 파일명
-- ATTACHED_FILE_NAME : 첨부된 파일명
-- IS MAIN : 대표 이미지 여부 (Y,N) 
CREATE TABLE ITEM_IMG (
    IMG_CODE INT AUTO_INCREMENT PRIMARY KEY,
    ORIGIN_FILE_NAME VARCHAR(100) NOT NULL,
    ATTACHED_FILE_NAME VARCHAR(100) NOT NULL,
    IS_MAIN ENUM('Y', 'N') NOT NULL, -- 'Y' 또는 'N' 값으로 제한
    ITEM_CODE INT NOT NULL,
    FOREIGN KEY (ITEM_CODE) REFERENCES shop_item (ITEM_CODE) ON DELETE CASCADE
);

SELECT * FROM item_img;


DROP TABLE item_img;

-- ON DELETE CASCADE : 키 지우면 딸린거 다 같이 지워줌

INSERT INTO ITEM_IMG(ORIGIN_FILE_NAME, ATTACHED_FILE_NAME, IS_MAIN, ITEM_CODE)
VALUES( 'abc.jpg', 'aaa.jpg', 'Y', 1),


SELECT * FROM shop_item;
SELECT * FROM item_img;

SELECT * FROM shop_item;

SELECT ITEM.ITEM_CODE
	, ITEM_NAME
	, ITEM_PRICE
	, ATTACHED_FILE_NAME
FROM shop_item ITEM, item_img IMG
WHERE ITEM.ITEM_CODE = IMG.ITEM_CODE
AND IS_MAIN = 'Y'
ORDER BY ITEM_CODE DESC;
