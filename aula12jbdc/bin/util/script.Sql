create table cliente(codigo serial primary key,
			 nome varchar(50),
			 telefone varchar(11),
			 email varchar(30));
			 
insert into cliente (nome,telefone,email) values('João','22431000','Joao@gmail.com');
insert into cliente (nome,telefone,email) values('Duda','22431000','Duda@gmail.com');