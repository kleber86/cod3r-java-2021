select * from estados;

select 
  nome, sigla 
from estados;

select 
  nome, sigla 
from 
  estados 
where regiao = 'Sul';

select 
  nome, populacao 
from 
  estados 
where 
  populacao >= 10 
order by populacao desc;