package programacaoOrientadaaObjetos;
/*Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
import java.util.Scanner;

public class Cliente //cria��o da classe Cliente 
{
	private String nomeCliente; //cria��o dos atributos
	private int codigoCliente;
	double preco,imposto, taxaServico,total;
	
	//abaixo cria��o dos m�todos
	public Cliente (String Nome, int Codigo)
	{
		nomeCliente = Nome;
		codigoCliente = Codigo;
	}
	
	
	public double valor(double total)
	{
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o valor da compra: ");
		preco=ler.nextDouble();
		total=preco*taxaServico+imposto;
		return total;
	}
	public String getinfo()
	{
		String info = nomeCliente + "\t" + codigoCliente;
		return info;
	}
	public void compra()
	{
		System.out.printf("\nTotal da compra: R$ %.2f ",valor(0.0));
	}
	

}
