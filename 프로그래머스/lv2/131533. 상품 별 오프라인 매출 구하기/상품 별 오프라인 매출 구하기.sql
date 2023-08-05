-- 코드를 입력하세요
SELECT p.product_code, sum(p.price * s.sales_amount) as SALES from PRODUCT p join OFFLINE_SALE s on p.PRODUCT_ID = s.PRODUCT_ID
group by p.PRODUCT_CODE
order by SALES desc, p.PRODUCT_CODE