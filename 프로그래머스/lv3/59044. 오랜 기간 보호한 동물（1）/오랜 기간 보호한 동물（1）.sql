-- 코드를 입력하세요
SELECT a.name, a.datetime from animal_ins a left join animal_outs a2 on a.ANIMAL_ID = a2.ANIMAL_ID
where a2.datetime is null
order by a.datetime
limit 3