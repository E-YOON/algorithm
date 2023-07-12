-- 2022년 3월의 오프라인/온라인 상품 판매 데이터
-- OFFLINE_SALE의 USER_ID 값은 NULL로 표시

SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM ONLINE_SALE
WHERE DATE_FORMAT(SALES_DATE, '%m') = '03'

UNION ALL

SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, PRODUCT_ID, NULL AS USER_ID, SALES_AMOUNT
FROM OFFLINE_SALE
WHERE DATE_FORMAT(SALES_DATE, '%m') = '03'
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID
;