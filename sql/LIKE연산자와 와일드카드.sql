-- 2024.7.1

SELECT * FROM emp;

-- 글자가 포함되는지 조회 할 때는 LIKE 연산자와 와일드 카드를 사용
-- 와일드 카드 : %, _ (퍼센트랑 언더바...)
-- '%' : 글자 수 제한이 없는 랜덤한 문자
-- '_' : 한 글자의 랜덤한 문자

-- 사원명이 '이'라는 글자가 포함된 사원의 모든 정보 조회
SELECT *
FROM emp
WHERE ENAME LIKE '%이%';

-- 이름은 세글자이며 가운데 글자가 '이'인 이름을 조회 
SELECT *
FROM emp
WHERE ENAME LIKE '_이_'; 

-- 마지막 글자가 '이'로 끝나는 모든 이름 조회 
SELECT *
FROM emp
WHERE ENAME LIKE '%이';


-- 두번째 글자가 '이'인 모든 이름 조회 
SELECT *
FROM emp
WHERE ENAME LIKE '_이%';


-- 문자열 연결 함수
SELECT 'JAVA', 1+1, CONCAT('집에', '가고','싶다'); 