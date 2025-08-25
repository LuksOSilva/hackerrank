SELECT
    DISTINCT CITY
FROM
    STATION
WHERE
    UPPER(SUBSTR(city, -1, 1)) IN ('A', 'E', 'I', 'O', 'U');