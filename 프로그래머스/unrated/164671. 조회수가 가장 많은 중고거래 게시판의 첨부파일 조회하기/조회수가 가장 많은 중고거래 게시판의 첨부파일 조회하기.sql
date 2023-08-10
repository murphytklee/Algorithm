-- 코드를 입력하세요
SELECT concat('/home','/grep','/src/',b.BOARD_ID,'/',f.FILE_ID,f.FILE_NAME,f.FILE_EXT) as FILE_PATH from USED_GOODS_BOARD b join USED_GOODS_FILE f on b.BOARD_ID = f.BOARD_ID
where b.views = (select max(b.views) from USED_GOODS_BOARD b)
order by f.FILE_ID DESC