SELECT COUNT(DISTINCT ID) AS COUNT
FROM ECOLI_DATA
WHERE ((GENOTYPE & 2) != 2 OR GENOTYPE IS NULL)
AND ((GENOTYPE & 1) = 1 OR (GENOTYPE & 4) = 4);
