-- 코드를 입력하세요
SELECT a.MCDP_CD as '진료과 코드',
       count(*) as '5월예약건수'
from APPOINTMENT a
where date_format(a.APNT_YMD,'%Y-%m') = '2022-05'
group by a.MCDP_CD
order by 5월예약건수, a.MCDP_CD