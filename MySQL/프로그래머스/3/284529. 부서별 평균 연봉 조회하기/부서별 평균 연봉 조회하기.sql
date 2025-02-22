SELECT A.DEPT_ID, A.DEPT_NAME_EN, ROUND(AVG(B.SAL), 0) AS AVG_SAL
FROM HR_DEPARTMENT A
JOIN HR_EMPLOYEES B on A.DEPT_ID = B.DEPT_ID
GROUP BY DEPT_ID, DEPT_NAME_EN
ORDER BY AVG_SAL DESC