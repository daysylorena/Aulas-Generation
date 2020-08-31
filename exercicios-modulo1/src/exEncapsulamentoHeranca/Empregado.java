package exEncapsulamentoHeranca;
/*Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
inst�ncia da classe Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa,
os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
retida dos impostos). Implemente a classe Empregado com m�todos seletores e modificadores
e um m�todo calcularSalario. Escreva um programa de teste adequado para a classe Empregado.*/
public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	private double salario;
	
	public Empregado(String nome,String endereco,String telefone, String dataDeNascimento, char genero, int codigoSetor, double salarioBase, double imposto)
	{
		super(nome,endereco,telefone,dataDeNascimento,genero);
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public double calcularSalario(double salario)
	{
		imposto = imposto/100;
		salario = salarioBase - salarioBase*imposto;
		return salario;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
