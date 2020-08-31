/*Uma tabela que represente um petshop, contendo:
 ID do animal;
 Peso do animal;
 + 5 informações que você considera importante;

*Importante a tabela também precisa ter 15 dados;
Para essa tabela considere fazer o SELECT que retorne:
 Todos os animais maiores que 10 kilos;
 Todos os animais menores que 10 kilos;
 Todos os animais peso entre 10 e 30 kilos;*/
-- create database db_petshop;
-- use db_petshop;
/*create table tb_pets(
	id bigint (5),
    nomeTutor varchar (100),
    nomePet varchar (100),
    tipo varchar (100),
    genero varcharacter (1),
    peso decimal (10,3),
    idade int,
    primary key (id)
);*/
/*insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10001,"Daysy","Mel","cachorro/a","F",10.500,7);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10002,"Rosane","Luna","cachorro/a","F",14.000,3);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10003,"Eugenia","Totó","cachorro/a","M",3.500,14);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10004,"Patricia","Bony","cachorro/a","M",1.700,15);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10005,"Laura","Toy","cachorro/a","M",4.500,9);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10006,"Isabella","Loly","cachorro/a","M",8.500,16);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10007,"Camila","Miliu","cachorro/a","F",15.000,8);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10008,"Anderson","Roger","gato/a","M",2.500,1);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10009,"Fred","Rex","cachorro/a","M",7.500,6);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10010,"Thiago","Fred","gato/a","M",3.500,7);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10011,"Leandro","Fifi","gato/a","F",1.500,5);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10012,"John","Garfiel","gato/a","M",6.500,7);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10013,"John","Odie","cachorro/a","M",6.500,5);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10014,"Pedro","Pietra","gato/a","F",2.500,3);
insert into tb_pets(id,nomeTutor,nomePet,tipo,genero,peso,idade) values (10015,"Max","Cacau","cavalo/égua","F",110.500,15);*/
-- select * from tb_pets where peso > 10
-- select * from tb_pets where peso < 10
select * from tb_pets where peso between 10 and 30