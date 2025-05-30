# Department Highest Salary
SELECT d.name AS Department, e.name AS Employee, Salary AS Salary
FROM Employee e JOIN Department d
ON e.departmentId = d.id
WHERE e.salary = (SELECT MAX(salary)
FROM Employee e1
WHERE e1.departmentId = e.departmentId);
