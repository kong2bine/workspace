-- 2024.8.12
-- GROUP BY : 데이터를 특정 기준에 맞춰 그룹 지은 결과를 도출 할 때 사용
-- 단일행 함수와 함께 사용하는 경우가 많음
-- 단일행 함수 : SUM(), MAX(), MIN(), COUNT(), AVG()

SELECT * FROM dept;
SELECT * FROM emp;

-- 사원 중에서 가장 많은 급여를 조회
SELECT MAX(SAL) FROM emp;

-- 사원 중에서 가장 많은 급여를 받는 사원명과 급여 조회
SELECT MAX(SAL), ENAME FROM emp;

-- 각 부서별로 가장 많은 급여를 조회
-- 기본적으로 단일행함수와 조회 결과 행의 갯수가 다른 컬럼을 사용하지 못하지만
-- GROUP BY절에서는 유일하게 그루핑한 컬럼은 조회가 가능함.
SELECT DEPTNO, MAX(SAL), SUM(SAL), COUNT(SAL), AVG(SAL)
FROM emp
GROUP BY DEPTNO;

-- 직급이 사원이 아닌 사원들 중 직급별 급여의 평균을 조회
-- 조회 결과를 평균 기준 내림차순으로 정렬
SELECT JOB, AVG(SAL)
FROM emp
WHERE JOB != '사원'
GROUP BY JOB
ORDER BY AVG(SAL) DESC;

-- 직급별로 그룹하여 직급, 각 직급별 평균 급여를 조회하되
-- 평균 급여가 300이상인 직급만 조회
-- 정렬은 평균 급여 기준 내림차순 정렬

-- 그룹한 후 결정해야 하는 조건은 HAVING 절에 사용
SELECT JOB, AVG(SAL)
FROM emp
GROUP BY JOB
HAVING AVG(SAL) >= 300;

-- 20번 부서를 제외한 정보 중에서
-- 부서별로 그룹하여 부서번호, 부서별 급여의 합을 조회하되
-- 각 그룹별 급여의 합이 700 이상인 데이터만 조회
-- 조회 결과 데이터는 부서별 급여의 합 기준 오름차순으로 정렬
SELECT DEPTNO, SUM(SAL)
FROM emp
WHERE DEPTNO != 20
GROUP BY DEPTNO
HAVING SUM(SAL) >= 700
ORDER BY AVG(SAL);

-- 조회 쿼리문의 해석 순서
-- FROM > JOIN > WEHRE > GROUP BY > HAVING > SELECT > ORDER BY 
SELECT JOB, AVG(SAL) AS AVG_SAL
FROM emp
WHERE EMPNO > 1003
GROUP BY JOB
ORDER BY AVG_SAL DESC;
