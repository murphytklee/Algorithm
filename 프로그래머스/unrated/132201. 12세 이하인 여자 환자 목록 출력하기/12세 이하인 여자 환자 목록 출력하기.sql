-- 코드를 입력하세요
SELECT p.PT_NAME, p.PT_NO, p.GEND_CD, p.AGE, (case when p.TLNO is null then 'NONE' else p.TLNO end) as TLNO from PATIENT p
where p.AGE <= 12 and p.GEND_CD = 'W'
order by p.AGE DESC, p.PT_NAME