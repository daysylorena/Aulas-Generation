package programacaoOrientadaaObjetos;

public class ClienteTeste 
{
	public static void main(String[] args) 
	{
		Cliente cliente1 = new Cliente ("Oprah Winfrey",4210042);
		cliente1.taxaServico=1.1;
		cliente1.imposto=500.99;
		cliente1.compra();
		System.out.println(cliente1.getinfo());
		
	}

}
