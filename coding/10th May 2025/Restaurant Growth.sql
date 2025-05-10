# Restaurant Growth
SELECT t.visited_on, t.amount, ROUND(AMOUNT/7, 2) average_amount
FROM (SELECT DISTINCT visited_on,
             SUM(amount) OVER(ORDER BY visited_on RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW) AMOUNT,
             MIN(visited_on) OVER() 1st_date
             FROM Customer
    ) t
WHERE visited_on >= 1st_date + 6
