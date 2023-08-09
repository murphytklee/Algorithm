-- 코드를 입력하세요
SELECT u.user_id, u.nickname,
        concat(u.CITY,' ',u.STREET_ADDRESS1,' ',u.STREET_ADDRESS2) as '전체주소',
        concat(LEFT(u.TLNO,3),'-',MID(u.TLNO,4,4),'-',RIGHT(u.TLNO,4)) as '전화번호'
from USED_GOODS_BOARD b join USED_GOODS_USER u on b.WRITER_ID = u.USER_ID
group by u.USER_ID
having count(*) >= 3
ORDER BY u.USER_ID DESC;