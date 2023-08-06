-- 코드를 입력하세요
SELECT b.BOARD_ID,
       b.WRITER_ID,
       b.TITLE,
       b.PRICE,
       case
           when b.STATUS = 'DONE' then '거래완료'
           when b.STATUS = 'SALE' then '판매중'
           else '예약중'  end as STATUS
       from USED_GOODS_BOARD b
where DATE_FORMAT(b.CREATED_DATE , '%Y-%m-%d') = '2022-10-05'
order by BOARD_ID desc