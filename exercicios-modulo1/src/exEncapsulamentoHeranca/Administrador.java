package exEncapsulamentoHeranca;
/*Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/
public class Administrador extends Pessoa{
	private double ajudaDeCusto;
	
	public Administrador (String nome,String endereco,String telefone, String dataDeNascimento, char genero,double ajudaDeCusto)
	{
		super(nome,endereco,telefone,dataDeNascimento,genero);
		this.ajudaDeCusto = ajudaDeCusto;
	}

}
