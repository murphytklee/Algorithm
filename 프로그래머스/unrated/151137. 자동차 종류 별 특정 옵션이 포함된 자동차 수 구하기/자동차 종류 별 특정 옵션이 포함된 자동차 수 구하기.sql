-- 코드를 입력하세요
SELECT r.car_type, count(*) as CARS from CAR_RENTAL_COMPANY_CAR r
where r.options regexp ('통풍시트|열선시트|가죽시트')
group by r.car_type
order by car_type asc