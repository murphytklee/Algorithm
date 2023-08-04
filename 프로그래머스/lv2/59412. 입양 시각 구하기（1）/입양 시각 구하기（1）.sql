-- 코드를 입력하세요
SELECT date_format(datetime,'%H') as HOUR, count(*) as COUNT from ANIMAL_OUTS
group by HOUR
having HOUR between 09 and 20
order by HOUR