-- 코드를 입력하세요
SELECT b.category, sum(s.sales) as TOTAL_SALES from BOOK b join BOOK_SALES s on b.BOOK_ID = s.BOOK_ID
where date_format(s.sales_date,'%Y-%m') = '2022-01'
group by b.category
order by b.category