SELECT
    *
FROM 
    (SELECT
        name || '(' || SUBSTR(occupation, 1, 1) || ')'
    FROM
        occupations
    ORDER BY name)
UNION
SELECT
    *
FROM
    (SELECT
        'There are a total of ' || count(*) || ' ' || LOWER(occupation) || 's.'
    FROM
        occupations
    GROUP BY 
        occupation
    ORDER BY
        count(*), occupation);
