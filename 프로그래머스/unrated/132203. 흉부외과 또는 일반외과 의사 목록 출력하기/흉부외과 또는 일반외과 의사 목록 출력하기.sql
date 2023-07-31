-- 코드를 입력하세요
SELECT d.DR_NAME, d.DR_ID, d.MCDP_CD, substring(d.HIRE_YMD,1,10) as HIRE_YMD from DOCTOR d
where d.MCDP_CD in ('CS', 'GS')
order by d.HIRE_YMD desc, d.DR_NAME asc