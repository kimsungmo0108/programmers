SELECT COUNT(*) as COUNT
FROM ECOLI_DATA e
WHERE (e.GENOTYPE & 2) = 0  -- 2번 형질이 없는 대장균
  AND ((e.GENOTYPE & 1) > 0 OR (e.GENOTYPE & 4) > 0); -- 또는 3번 형질을 보유
