# Find Products with Valid Serial Numbers
SELECT *
FROM products
WHERE description REGEXP 'SN[0-9]{4}-[0-9]{4}( |$)'
ORDER BY product_id
