/*Atividade 2
Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco
deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as 
informações dos produtos desta empresa.
O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.
siga exatamente esse passo a passo:
- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.
- Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de
criar a foreign key de tb_categoria nesta tabela).
- Popule a tabela Categoria com até 5 dados.
- Popule a tabela pizza com até 8 dados.
- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
- Faça um select trazendo os Produtos com valor entre 29 e 60 reais.
- Faça um select utilizando LIKE buscando os Produtos com a letra C.
- Faça um um select com Inner join entre tabela categoria e pizza.
- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são pizza doce).*/
-- create database db_pizzaria_legal
/*use db_pizzaria_legal;
create table tb_categoria(
	id int (3) auto_increment,
	frita boolean,
	borda_recheada boolean,
	integral boolean,
    primary key(id)
);*/
/*use db_pizzaria_legal;
create table tb_pizza(
	id_pizza int (3) auto_increment,
	tamanho varchar (10),
	sabor varchar (30),
	adicionais varchar (100),
	preco decimal (6,2),
	entrega boolean,
    categoria_id int (3),
    primary key(id_pizza),
    foreign key(categoria_id) references tb_categoria(id)
);*/
/* insert into tb_categoria(frita,borda_recheada,integral) values (1,1,1);
insert into tb_categoria(frita,borda_recheada,integral) values (1,1,0);
insert into tb_categoria(frita,borda_recheada,integral) values (1,0,0);
insert into tb_categoria(frita,borda_recheada,integral) values (0,1,1);
insert into tb_categoria(frita,borda_recheada,integral) values (0,0,0);*/
/* insert into tb_pizza(tamanho,sabor,adicionais,preco,entrega,categoria_id) values ("P","jaca crazy","milho",45.00,1,1);
insert into tb_pizza(tamanho,sabor,adicionais,preco,entrega,categoria_id) values ("M","jaca crazy","milho",50.00,1,1);
insert into tb_pizza(tamanho,sabor,adicionais,preco,entrega,categoria_id) values ("G","jaca crazy","milho",55.00,1,1);
insert into tb_pizza(tamanho,sabor,adicionais,preco,entrega,categoria_id) values ("G","caipira de soja","milho",35.00,1,1);
insert into tb_pizza(tamanho,sabor,adicionais,preco,entrega,categoria_id) values ("G","mousse de limão","milho",40.00,1,1);
insert into tb_pizza(tamanho,sabor,adicionais,preco,entrega,categoria_id) values ("G","banana com canela","milho",40.00,1,1);
insert into tb_pizza(tamanho,sabor,adicionais,preco,entrega,categoria_id) values ("G","prestígio","milho",40.00,1,1);
insert into tb_pizza(tamanho,sabor,adicionais,preco,entrega,categoria_id) values ("G","\"frango\" com catupop","milho",45.00,1,1);*/
-- select * from tb_pizza where preco > 45
-- select * from tb_pizza where preco between 29 and 60
-- select * from tb_pizza where sabor like "%c%"
-- select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id where borda_recheada = 1