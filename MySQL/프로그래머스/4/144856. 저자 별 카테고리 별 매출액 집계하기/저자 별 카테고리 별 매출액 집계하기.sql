SELECT
    a.AUTHOR_ID,
    a.AUTHOR_NAME,
    b.CATEGORY,
    SUM(s.SALES * b.PRICE) AS TOTAL_SALES
FROM
    BOOK_SALES s
JOIN
    BOOK b ON s.BOOK_ID = b.BOOK_ID
JOIN
    AUTHOR a ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE
    s.SALES_DATE LIKE '2022-01%'
GROUP BY
    a.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY
ORDER BY
    a.AUTHOR_ID ASC, b.CATEGORY DESC