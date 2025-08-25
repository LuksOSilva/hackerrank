SELECT 
    RPAD('* ', (level * 2)-1, '* ')
FROM 
    DUAL
CONNECT BY level <= 20;