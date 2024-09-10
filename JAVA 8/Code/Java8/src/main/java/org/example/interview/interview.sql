-- Find Duplicate Records
SELECT column_name, COUNT(*)
FROM table_name
GROUP BY column_name
HAVING COUNT(*) > 1;

-- Find the Nth Highest Salary
SELECT salary
FROM employees e1
WHERE N = (SELECT COUNT(DISTINCT salary) FROM employees e2 WHERE e2.salary > e1.salary);

-- Find 2nd Highest (Maximum) Salary
SELECT DISTINCT salary
FROM employees
ORDER BY salary DESC
LIMIT 1 OFFSET 1;

-- Find 2nd Lowest (Minimum) Salary
SELECT DISTINCT salary
FROM employees
ORDER BY salary ASC
LIMIT 1 OFFSET 1;

-- Join Two Tables
SELECT e.name, d.department_name
FROM employees e
INNER JOIN departments d
ON e.department_id = d.department_id;

-- Find Employees Who Earn More Than the Average Salary
SELECT name, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

-- Find the Employees With Maximum Salary
SELECT *
FROM employees
WHERE salary = (SELECT MAX(salary) FROM employees);

-- Delete Duplicate Records
DELETE FROM table_name
WHERE id NOT IN (
   SELECT MIN(id)
   FROM table_name
   GROUP BY column_name1, column_name2
);

-- Show only departments with more than 5 employees.
SELECT department_id, COUNT(*)
FROM employees
GROUP BY department_id
HAVING COUNT(*) > 5;

-- Find the Last Record in a Table
SELECT *
FROM employees
ORDER BY employee_id DESC
LIMIT 1;
