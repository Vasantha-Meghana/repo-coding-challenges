# Customers Who Never Order
SELECT name as Customers
FROM Customers 
WHERE id NOT IN (SELECT customerid
FROM Orders);
