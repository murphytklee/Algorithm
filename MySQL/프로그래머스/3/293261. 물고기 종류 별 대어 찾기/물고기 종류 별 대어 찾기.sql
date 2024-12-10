SELECT 
    A.ID, 
    B.FISH_NAME, 
    A.LENGTH
FROM 
    FISH_INFO A
LEFT JOIN 
    FISH_NAME_INFO B 
ON 
    A.FISH_TYPE = B.FISH_TYPE
WHERE 
    (B.FISH_NAME, A.LENGTH) IN (
        SELECT 
            B.FISH_NAME, 
            MAX(A.LENGTH)
        FROM 
            FISH_INFO A
        LEFT JOIN 
            FISH_NAME_INFO B 
        ON 
            A.FISH_TYPE = B.FISH_TYPE
        GROUP BY 
            B.FISH_NAME
    )