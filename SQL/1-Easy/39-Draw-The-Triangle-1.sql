SELECT 
    RPAD('* ', (21 - level) * 2 - 1, '* ')
FROM 
    DUAL
CONNECT BY level <= 20;