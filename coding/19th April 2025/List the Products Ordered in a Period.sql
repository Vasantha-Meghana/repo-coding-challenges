# List the Products Ordered in a Period
SELECT p.product_name, SUM(unit) AS unit
FROM Products p JOIN Orders o
ON p.product_id = o.product_id
WHERE order_date BETWEEN DATE '2020-02-01' AND DATE '2020-02-29'
GROUP BY o.product_id
HAVING SUM(unit) >= 100;
