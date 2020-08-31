package exEncapsulamentoHeranca;
/*Implemente a classe Operario como subclasse da classe Pessoa. Um determinado operário
tem como atributos da classe Pessoa e também os atributos próprios como valorProducao
(que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e
comissao (que corresponde à porcentagem do valorProducao que será adicionado ao
vencimento base do operário).*/
public class Operario extends Pessoa{
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome,String endereco,String telefone, String dataDeNascimento, char genero, double valorProducao, double comissao)
	{
		super(nome,endereco,telefone,dataDeNascimento,genero);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double salarioComissionado (double salarioProdutivo)
	{
		salarioProdutivo = 1-comissao/valorProducao;
		return salarioProdutivo;
	}
	

}
