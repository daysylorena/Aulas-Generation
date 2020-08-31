/*Uma tabela que represente um varejo, contendo:
 ID do produto;
 Preço do produto;
 Categoria do produto ( Ex: quarto/sala / cozinha / banheiro)
 4 informações que você considera importante;

*Importante a tabela também precisa ter 15 dados;
Para essa tabela considere fazer o SELECT que retorne:
 Todos os produtos que comecem com a letra “A”;
 Todos os produtos de uma determinada categoria;
 Todos os produtos entre $ 1.000 e 1.500 de uma determinada categoria;
 Todos os produtos listados por uma categoria utilizando like;*/
-- create database db_loja
/*use db_loja;
create table tb_varejo(
	id bigint(5),
    nome varchar(100),
    preco decimal (10,2),
    categoria varchar (100),
    cor varchar (100),
    qtd int,
    entrega boolean
);*/
/* insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31001,"abajur",45.99,"quarto","vermelho",16,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31002,"ventilador",99.99,"sala","preto",34,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31003,"pipoqueira",78.99,"cozinha","branco",11,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31004,"umidificador",132.99,"quarto","branco",3,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31005,"cama box solteiro",999.99,"quarto","bege",15,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31006,"cama box casal",1299.99,"quarto","bege",13,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31007,"cama box queen",1499.99,"quarto","bege",9,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31008,"cama box king",2499.99,"quarto","bege",5,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31010,"ar_condicionado",1349.99,"quarto","branco",16,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31011,"geladeira",1399.99,"cozinha","inox",42,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31012,"fogão",459.99,"cozinha","azul",8,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31013,"lâmpada",15.99,"quarto","branco",118,0);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31014,"mesa_de_escritório",639.99,"escritório","preto",42,1);
insert into tb_varejo (id,nome,preco,categoria,cor,qtd,entrega) values (31015,"cadeira_de_escritório",219.99,"escritório","preto",55,1);*/

-- select * from tb_varejo where categoria = "escritório"
-- select * from tb_varejo where categoria = "quarto" and preco between 1000 and 1500
-- select * from tb_varejo where categoria like '%cozinha%'