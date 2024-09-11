SELECT
     h.FLAVOR
FROM
    FIRST_HALF h LEFT JOIN JULY j ON h.FLAVOR = j.FLAVOR
GROUP BY
    h.FLAVOR
ORDER BY
    SUM(h.TOTAL_ORDER + j.TOTAL_ORDER) DESC
LIMIT 3
    
