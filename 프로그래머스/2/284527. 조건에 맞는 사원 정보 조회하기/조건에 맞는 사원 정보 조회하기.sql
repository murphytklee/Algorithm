WITH Combined_Scores AS (
    SELECT 
        EMP_NO, 
        SUM(SCORE) AS SCORE
    FROM 
        HR_GRADE
    WHERE 
        YEAR = 2022
    GROUP BY 
        EMP_NO
)
SELECT 
    cs.SCORE,
    e.EMP_NO,
    e.EMP_NAME,
    e.POSITION,
    e.EMAIL
FROM 
    Combined_Scores cs
JOIN 
    HR_EMPLOYEES e
ON 
    cs.EMP_NO = e.EMP_NO
WHERE 
    cs.SCORE = (
        SELECT 
            MAX(SCORE) 
        FROM 
            Combined_Scores
    )