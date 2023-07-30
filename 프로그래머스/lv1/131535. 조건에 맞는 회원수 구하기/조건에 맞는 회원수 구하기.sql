-- 코드를 입력하세요 O
SELECT count(*) as USERS from USER_INFO u
where year(u.joined) = '2021'
and u.age between 20 and 29