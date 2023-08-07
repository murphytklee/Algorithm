-- 코드를 입력하세요
SELECT h.car_id, round(avg(DATEDIFF(h.END_DATE, h.START_DATE)+1),1) as AVERAGE_DURATION from CAR_RENTAL_COMPANY_RENTAL_HISTORY h
group by h.car_id
having AVERAGE_DURATION >= 7
order by AVERAGE_DURATION desc, h.car_id desc