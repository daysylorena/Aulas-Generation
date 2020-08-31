/*Atividade 3
Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco
deverá ter o seguinte nome db_farmacia_do_bem, onde o sistema trabalhará com as
informações dos produtos desta empresa.
O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.
siga exatamente esse passo a passo:
- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desta farmacia.
- Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia(não
esqueça de criar a foreign key de tb_categoria nesta tabela).
- Popule esta tabela Categoria com até 5 dados.
- Popule esta tabela Produto com até 8 dados.
- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
- Faça um select utilizando LIKE buscando os Produtos com a letra B.
- Faça um um select com Inner join entre tabela categoria e produto.
- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são cosméticos).*/
-- create database db_farmacia_do_bem
/*use db_farmacia_do_bem;
create table tb_categoria(
	id int (3) auto_increment,
	remedio boolean,
	cosmetico boolean,
	higiene boolean,
    primary key(id)
);
create table tb_produto(
	id_produto int (3) auto_increment,
	nome varchar (30),
    quantidade varchar (10),
	tipo_de_uso varchar (100),
	preco decimal (6,2),
	entrega boolean,
    categoria_id int (3),
    primary key(id_produto),
    foreign key(categoria_id) references tb_categoria(id)
);*/
/*insert into tb_categoria(remedio,cosmetico,higiene) values (1,0,0);
insert into tb_categoria(remedio,cosmetico,higiene) values (0,1,0);
insert into tb_categoria(remedio,cosmetico,higiene) values (0,0,1);
insert into tb_categoria(remedio,cosmetico,higiene) values (1,1,0);
insert into tb_categoria(remedio,cosmetico,higiene) values (0,1,1);*/
-- insert into tb_produto(nome,quantidade,tipo_de_uso,preco,entrega,categoria_id) values ("escova dental","1 unidade","externo",24.99,0,3);
/*insert into tb_produto(nome,quantidade,tipo_de_uso,preco,entrega,categoria_id) values ("creme dental","1 unidade","externo",3.99,0,3);
insert into tb_produto(nome,quantidade,tipo_de_uso,preco,entrega,categoria_id) values ("Ibuflex","cx 8 unid","interno",14.99,1,1);
insert into tb_produto(nome,quantidade,tipo_de_uso,preco,entrega,categoria_id) values ("batom","1 unidade","externo",24.99,0,2);
insert into tb_produto(nome,quantidade,tipo_de_uso,preco,entrega,categoria_id) values ("soro fisiológico","500 ml","interno/externo",4.99,0,1);
insert into tb_produto(nome,quantidade,tipo_de_uso,preco,entrega,categoria_id) values ("sabonete","180 g","externo",2.99,0,3);
insert into tb_produto(nome,quantidade,tipo_de_uso,preco,entrega,categoria_id) values ("fio dental","1 unidade","externo",4.99,0,3);
insert into tb_produto(nome,quantidade,tipo_de_uso,preco,entrega,categoria_id) values ("vitamina D","cx 30 unid","interno",15.99,1,1);*/
-- select * from tb_produto where preco > 50
-- select * from tb_produto where preco between 3 and 60
-- select * from tb_produto where nome like "%b%"
-- select * from tb_produto inner join tb_categoria on tb_produto.categoria_id = tb_categoria.id 
select * from tb_produto inner join tb_categoria on tb_produto.categoria_id = tb_categoria.id where tb_categoria.cosmetico = 1