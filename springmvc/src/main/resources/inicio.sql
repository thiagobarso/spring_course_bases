DROP TABLE usuario IF EXISTS;

DROP TABLE produto IF EXISTS;

CREATE TABLE usuario(
 id int not null primary key auto_increment,
 login varchar2(50)
);

CREATE TABLE produto(
 id int not null primary key auto_increment,
 nome varchar2(50)
);

insert into usuario(login) values ('admin');

insert into produto(nome) values ('teclado');
