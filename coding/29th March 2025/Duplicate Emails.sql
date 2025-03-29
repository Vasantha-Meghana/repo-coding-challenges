# Duplicate Emails
SELECT DISTINCT p1.email
FROM Person p1
WHERE p1.email IN (SELECT p2.email
FROM Person p2
WHERE NOT p1.id = p2.id);
