SELECT
    SUM(ci.population)
FROM
    COUNTRY co
    INNER JOIN CITY ci
        ON co.code = ci.countrycode
WHERE
    co.continent = 'Asia';