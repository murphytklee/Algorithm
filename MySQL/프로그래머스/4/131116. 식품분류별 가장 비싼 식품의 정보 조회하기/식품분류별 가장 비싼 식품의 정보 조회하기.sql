SELECT CATEGORY, PRICE   MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT
WHERE 1=1
    AND CATEGORY IN ('과자','국','김치','식용유')
    AND (CATEGORY, PRICE) IN (
                                SELECT CATEGORY
                                     , MAX(PRICE) PRICE
                                FROM FOOD_PRODUCT
                                GROUP BY CATEGORY
                             )
ORDER BY 2 DESC