package programacaoOrientadaaObjetos;
/*Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informa��es deste objeto no console.*/
public class ContaBancaria 
{
	private String nomeCliente;
	private long cpfCliente;
	private int digitoCpfCliente;
	private int agenciaCliente;
	private int contaCliente;
	private double contaCorrenteCliente;
	private double contaPoupancaCliente;

	public ContaBancaria (String nome, long cpf, int digitoCpf, int agencia, int conta, double contaCorrente, double contaPoupanca)
	{
		nomeCliente = nome;
		cpfCliente = cpf;
		digitoCpfCliente = digitoCpf;
		agenciaCliente = agencia;
		contaCliente = conta;
		contaCorrenteCliente = contaCorrente;
		contaPoupancaCliente = contaPoupanca;
	}
	public String getinfo()
	{
		String info ="Nome: "+nomeCliente+"\nCPF: "+cpfCliente+"-"+digitoCpfCliente+"\nAg�ncia: "+agenciaCliente+"\nConta: "+contaCliente+"\nConta Corrente: "+contaCorrenteCliente+"\nConta Poupan�a: "+contaPoupancaCliente;
		return info;
	} 

}
