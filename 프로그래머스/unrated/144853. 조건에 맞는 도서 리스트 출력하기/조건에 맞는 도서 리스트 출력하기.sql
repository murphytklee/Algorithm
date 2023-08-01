-- 코드를 입력하세요
SELECT b.BOOK_ID, DATE_FORMAT(b.published_date,'%Y-%m-%d') as PUBLISHED_DATE from BOOK b
where year(b.PUBLISHED_DATE) = '2021' and b.CATEGORY = '인문'
order by b.PUBLISHED_DATE asc