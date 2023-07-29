-- 코드를 입력하세요
SELECT f.FACTORY_ID, f.FACTORY_NAME, f.ADDRESS from FOOD_FACTORY f
where f.ADDRESS like '%강원도%'
order by f.FACTORY_ID asc