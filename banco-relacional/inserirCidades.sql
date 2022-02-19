insert into cidades (nome, area, estado_id)
values ('Campinas', 795, 26);

insert into cidades (nome, area, estado_id)
values ('Niteroi', 133.9, 20);

insert into cidades (nome, area, estado_id)
values ('Caruaru', 920.6, (select id from estados where sigla = 'PE'));

insert into cidades (nome, area, estado_id)
values 
('Juazeiro do Norte', 248.2, 
(select id from estados where sigla = 'CE'));


SELECT * from estados where id = 26;