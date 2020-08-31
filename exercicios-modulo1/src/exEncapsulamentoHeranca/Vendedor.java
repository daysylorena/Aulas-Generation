package exEncapsulamentoHeranca;
/*Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorVendas
(correspondente ao valor monet�rio dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que ser� adicionado ao vencimento base do Vendedor).*/
public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome,String endereco,String telefone, String dataDeNascimento, char genero, double valorVendas, double comissao)
	{
		super(nome,endereco,telefone,dataDeNascimento,genero);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public double calculoVendedor (double salarioVendedor)
	{
		salarioVendedor = 1-comissao/valorVendas;
		return salarioVendedor;
	}

}
