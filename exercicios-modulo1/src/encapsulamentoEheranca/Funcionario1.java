package encapsulamentoEheranca;

public class Funcionario1 extends Pessoa		//'extends' cria a heran�a da classe Pessoa para a classe Funcionario1
{
	private String departamento;
	
	public Funcionario1 (String nome, int matricula, String departamento)
	{
		super (nome,matricula);		//'super' traz a heran�a da superclasse (classe m�e) 'Pessoa'
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	

}
