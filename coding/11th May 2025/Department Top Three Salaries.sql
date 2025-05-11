# Department Top Three Salaries
SELECT d.name AS Department, e.name AS Employee, salary AS Salary
FROM Employee e JOIN Department d
ON d.id = e.departmentId
WHERE (SELECT COUNT(DISTINCT salary)
       FROM Employee e2
       WHERE e2.departmentId = e.departmentId AND e2.salary >= e.salary)
       <= 3
ORDER BY Department, Salary DESC
