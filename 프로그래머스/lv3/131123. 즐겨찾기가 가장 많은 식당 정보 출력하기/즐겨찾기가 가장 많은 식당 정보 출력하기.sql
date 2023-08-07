-- 코드를 입력하세요
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES from REST_INFO
where FOOD_TYPE in (
    select FOOD_TYPE from REST_INFO
    group by FOOD_TYPE
    having FAVORITES = max(FAVORITES))
order by FOOD_TYPE desc