/*Atividade 1
Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter
o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as
informações dos personagens desse game.
O sistema trabalhará com 2 tabelas tb_personagem e tb_classe.
siga exatamente esse passo a passo:
- Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos
relevantes do Cargos para se trabalhar com o serviço desse game Online.
- Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online
(não esqueça de criar a foreign key de tb_cargo nesta tabela).
- Popule a tabela classe com até 5 dados.
- Popule a tabela personagem com até 8 dados.
- Faça um select que retorne os funcionários com o poder de ataque maior do que 2000.
- Faça um select trazendo os funcionários com poder de defesa entre 1000 e 2000.
- Faça um select utilizando LIKE buscando os personagens com a letra C.
- Faça um um select com Inner join entre tabela classe e personagem.
- Faça um select onde traga todos os personagem de uma classe específica (exemplo todos
os personagens que são arqueiros).
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.*/

-- create database db_generation_game_online
/*use db_generation_game_online;
create table tb_classe(
	id int(5) auto_increment,
	nivel varchar (20),
	ferramenta varchar (20),
    cor varchar (20),
	primary key(id)
);*/
/*use db_generation_game_online;
create table tb_personagem(
nome_personagem varchar (10),
ataque int (100),
defesa int (100),
cura int (100),
elemento varchar (10),
classe_id int(5),
foreign key (classe_id) references tb_classe(id)
);*/
/* insert into tb_classe(nivel,ferramenta,cor) values ("iniciante","armadura","verde");
insert into tb_classe(nivel,ferramenta,cor) values ("intermediário","flecha","azul");
insert into tb_classe(nivel,ferramenta,cor) values ("iniciante","espada","vermelho");
insert into tb_classe(nivel,ferramenta,cor) values ("profissional","varinha","amarelo");
insert into tb_classe(nivel,ferramenta,cor) values ("intermediário","armadura","azul");*/

/*insert into tb_personagem(nome_personagem,ataque,defesa,cura,elemento,classe_id) values ("Lara",95,60,50,"ar",1);
insert into tb_personagem(nome_personagem,ataque,defesa,cura,elemento,classe_id) values ("Lana",55,90,60,"ar",2);
insert into tb_personagem(nome_personagem,ataque,defesa,cura,elemento,classe_id) values ("Nino",30,100,70,"fogo",3);
insert into tb_personagem(nome_personagem,ataque,defesa,cura,elemento,classe_id) values ("Pedro",35,50,95,"terra",4);
insert into tb_personagem(nome_personagem,ataque,defesa,cura,elemento,classe_id) values ("Zeca",25,50,100,"terra",5);
insert into tb_personagem(nome_personagem,ataque,defesa,cura,elemento,classe_id) values ("Biba",35,50,95,"terra",2);
insert into tb_personagem(nome_personagem,ataque,defesa,cura,elemento,classe_id) values ("Morgana",100,100,100,"fogo",3);
insert into tb_personagem(nome_personagem,ataque,defesa,cura,elemento,classe_id) values ("Victor",100,100,100,"água",4);*/
-- select * from tb_personagem where ataque > 2000
-- select * from tb_personagem where defesa between 1000 and 2000
-- select * from tb_personagem where nome_personagem like "%c%"
-- select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id
select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id where nivel = "iniciante"