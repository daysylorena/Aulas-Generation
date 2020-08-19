package programacaoOrientadaaObjetos;
/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
import java.util.Scanner;

public class Cliente //criação da classe Cliente 
{
	private String nomeCliente; //criação dos atributos
	private int codigoCliente;
	double preco,imposto, taxaServico,total;
	
	//abaixo criação dos métodos
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
