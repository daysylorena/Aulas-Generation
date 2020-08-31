/*Crie um banco de dados com o nome de “db_diversos”;
Dentro desse banco de dados devem conter as seguintes tabelas e os seguintes SELECT’s:
1. Uma tabela que represente uma escola, contendo:
 ID do aluno;
 Idade do aluno;
 + 5 informações que você considera importante;

*Importante a tabela precisa ter 15 dados de alunos;
Para essa tabela considere fazer o SELECT que retorne:
 Todos os participantes maiores que 18 anos;
 Todos os participantes menores que 18 anos;
 Todos os participantes com a idade entre 20 e 25 anos;*/
/*create database db_diversos;
use db_diversos;
create table tb_escola(
	id bigint(5) auto_increment,
    nome varchar(200),
    idade int not null,
    cpf bigint (11) not null,
    anoEscolar varchar(2),
    cicloEscolar varchar(10),
    notaMedia decimal (2,2),
    primary key(id)
);*/
-- alter table tb_escola
-- modify notaMedia decimal (10,2)
/*insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00001,"André Rui Barroco",22,52486314973,"1º","ES",8.75)
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00002,"Melody Caramelo",7,53698742681,"2º","EF",09.50);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00003,"Alice Costa",20,63149734687,"2º","ES",06.25);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00004,"Bruna Bernardes",15,97394254687,"1º","EM",07.50);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00005,"Carlos Soares",7,84549734845,"2º","EF",09.25);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00006,"Michelle Tedesco",20,88149734615,"3º","ES",06.00);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00007,"Rosa Brandão",21,41249734643,"4º","ES",06.50);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00008,"Kelly Ruescas",12,54149734645,"6º","EF",07.00);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00009,"Claudio Trindade",16,33149734622,"2º","EM",09.25);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00010,"Mirtes Silva",20,55149734644,"1º","ES",06.25);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00011,"Eduardo Cavalcante",9,76463134685,"3º","EF",06.75);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00012,"Aline Moraes",26,49672734687,"4º","ES",08.50);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00013,"Suzana Montes",8,89734644462,"2º","EF",05.00);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00014,"Marcelo Vieira",20,63193834654,"2º","EM",06.25);
insert into tb_escola (id,nome,idade,cpf,anoEscolar,cicloEscolar,notaMedia) values (00015,"Rodrigo Viana",32,73419735687,"5º","ES",07.25);*/
-- select * from tb_escola where idade>18
-- select * from tb_escola where idade<18
select * from tb_escola where idade between 20 and 25