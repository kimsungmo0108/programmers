-- 코드를 작성해주세요
SELECT G.SCORE, E.EMP_NO, E.EMP_NAME, E.POSITION, E.EMAIL
FROM (
    SELECT EMP_NO, SUM(SCORE) AS SCORE
    FROM HR_GRADE
    WHERE YEAR = 2022
    GROUP BY EMP_NO
) G
JOIN HR_EMPLOYEES E ON G.EMP_NO = E.EMP_NO
WHERE G.SCORE = ( 
    SELECT MAX(SUM_SCORE)
    FROM (
        SELECT EMP_NO, SUM(SCORE) AS SUM_SCORE
        FROM HR_GRADE
        WHERE YEAR = 2022
        GROUP BY EMP_NO
    ) TEMP
)
ORDER BY E.EMP_NO;
