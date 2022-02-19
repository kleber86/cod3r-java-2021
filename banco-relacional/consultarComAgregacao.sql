select 
  regiao as Região,
  sum(populacao) as Total
FROM estados
group by regiao
order by Total desc;

select 
  AVG(populacao) as Total
from estados;

select
  avg(populacao) as Total
from estados
where regiao = 'Sudeste';