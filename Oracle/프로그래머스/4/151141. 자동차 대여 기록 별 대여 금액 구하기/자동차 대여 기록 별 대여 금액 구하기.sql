WITH RentalDurations AS (
    SELECT
        h.HISTORY_ID,
        h.CAR_ID,
        h.START_DATE,
        h.END_DATE,
        (END_DATE - START_DATE + 1) AS DURATION
    FROM
        CAR_RENTAL_COMPANY_RENTAL_HISTORY h
    JOIN
        CAR_RENTAL_COMPANY_CAR c ON h.CAR_ID = c.CAR_ID
    WHERE
        c.CAR_TYPE = '트럭'
),
Discounts AS (
    SELECT
        p.CAR_TYPE,
        p.DURATION_TYPE,
        p.DISCOUNT_RATE
    FROM
        CAR_RENTAL_COMPANY_DISCOUNT_PLAN p
    WHERE
        p.CAR_TYPE = '트럭'
),
CalculatedFees AS (
    SELECT
        rd.HISTORY_ID,
        rd.DURATION,
        c.DAILY_FEE,
        COALESCE(
            CASE
                WHEN rd.DURATION > 90 THEN (c.DAILY_FEE * rd.DURATION * (1 - (SELECT DISCOUNT_RATE / 100 FROM Discounts WHERE DURATION_TYPE LIKE '%90%')))
                WHEN rd.DURATION > 30 THEN (c.DAILY_FEE * rd.DURATION * (1 - (SELECT DISCOUNT_RATE / 100 FROM Discounts WHERE DURATION_TYPE LIKE '%30%')))
                WHEN rd.DURATION > 7 THEN (c.DAILY_FEE * rd.DURATION * (1 - (SELECT DISCOUNT_RATE / 100 FROM Discounts WHERE DURATION_TYPE LIKE '%7%')))
                ELSE (c.DAILY_FEE * rd.DURATION)
            END, 0) AS FEE
    FROM
        RentalDurations rd
    JOIN
        CAR_RENTAL_COMPANY_CAR c ON rd.CAR_ID = c.CAR_ID
)
SELECT
    HISTORY_ID,
    FLOOR(FEE) AS FEE
FROM
    CalculatedFees
ORDER BY
    FEE DESC,
    HISTORY_ID DESC;
