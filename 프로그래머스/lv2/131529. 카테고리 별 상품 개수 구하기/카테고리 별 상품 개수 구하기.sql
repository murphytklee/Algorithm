-- 코드를 입력하세요
SELECT substring(product_code,1,2) as CATEGORY, count(*) as PRODUCTS from PRODUCT
group by substring(product_code,1,2)