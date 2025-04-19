# Project Employees 1
SELECT project_id, ROUND(SUM(experience_years) / COUNT(experience_years), 2) AS average_years
FROM Project p JOIN Employee e ON p.employee_id = e.employee_id
GROUP BY project_id;
