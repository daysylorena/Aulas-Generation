package encapsulamentoEheranca;

public class Funcionario1 extends Pessoa		//'extends' cria a herança da classe Pessoa para a classe Funcionario1
{
	private String departamento;
	
	public Funcionario1 (String nome, int matricula, String departamento)
	{
		super (nome,matricula);		//'super' traz a herança da superclasse (classe mãe) 'Pessoa'
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	

}
