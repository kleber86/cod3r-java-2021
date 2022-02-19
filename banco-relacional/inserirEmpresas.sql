alter table empresas modify cnpj varchar(14);

SELECT * from empresas;

insert into empresas
 (nome, cnpj)
values
  ('Bradesco', 9990999999),
  ('Vale', 8888888888),
  ('Cielo', 777777777);

DESC empresas;

desc prefeitos;

SELECT * FROM empresas;

SELECT * FROM cidades;

INSERT INTO empresas_unidades
  (empresa_id, cidade_id, sede)
VALUES
  (1, 1, 1),
  (1, 2, 0),
  (2, 1, 0),
  (2, 2, 1);