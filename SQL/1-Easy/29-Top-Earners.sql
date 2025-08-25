SELECT
    MAX(salary * months),
    count(*)
FROM
    employee
WHERE
    salary * months in (SELECT MAX(salary * months) FROM employee);