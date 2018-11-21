CREATE TABLE usuario (
  id serial primary key,
  nome varchar(100) NOT NULL,
  usuario varchar(10) NOT NULL,
  senha varchar(8) NOT NULL,
  sexo varchar(9) NOT NULL,
  raca varchar(15) NOT NULL,
  reino varchar(15) NOT NULL
)
insert into USUARIO (id, nome, usuario, senha, sexo, raca, reino) values
(1, 'Saruman', 'admin', 'admin', 'Masculino', 'Istari', 'Orthanc');
