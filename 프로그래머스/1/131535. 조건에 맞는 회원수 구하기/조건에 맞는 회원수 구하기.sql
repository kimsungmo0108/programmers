-- 코드를 입력하세요
SELECT COUNT(*) AS USERS
FROM (
    SELECT USER_ID, GENDER, AGE, JOINED
    FROM USER_INFO
    WHERE 20 <= AGE 
        AND AGE <= 29
        AND DATE_FORMAT(JOINED, '%Y') = '2021'
) AS Subquery;