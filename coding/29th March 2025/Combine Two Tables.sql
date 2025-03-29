# Combine Two Tables
SELECT firstName, lastName, city, state
FROM Person P LEFT JOIN Address a
ON p.personId = a.personId;
