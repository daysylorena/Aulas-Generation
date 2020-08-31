package exEncapsulamentoHeranca;
/*Implemente a classe Operario como subclasse da classe Pessoa. Um determinado oper�rio
tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorProducao
(que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) e
comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao
vencimento base do oper�rio).*/
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
