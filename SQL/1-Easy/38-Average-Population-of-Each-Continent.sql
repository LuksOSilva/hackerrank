SELECT
    co.continent,
    FLOOR(AVG(ci.population))
FROM
    COUNTRY co
    INNER JOIN CITY ci
        ON co.code = ci.countrycode
GROUP BY
    co.continent;