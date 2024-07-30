-- 8월 시험
CREATE TABLE CAR_INFO(
	CAR_NUM INT AUTO_INCREMENT PRIMARY KEY
	, CAR_NAME VARCHAR(50) NOT NULL
	, CAR_PRICE VARCHAR(50) NOT NULL
	, CAR_BRAND VARCHAR(50) NOT NULL
);

CREATE TABLE SALES_INFO(
	SALES_NUM INT AUTO_INCREMENT PRIMARY KEY
	, BUYER VARCHAR(50) NOT NULL
	, BUYER_CAL VARCHAR(50) NOT NULL
	, COLOR VARCHAR(50) NOT NULL
	, SALES_DATE VARCHAR(50) NOT NULL
	, CAR_NUM INT REFERENCES CAR_INFO (CAR_NUM)
);