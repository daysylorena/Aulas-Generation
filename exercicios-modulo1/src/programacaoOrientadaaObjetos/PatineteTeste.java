package programacaoOrientadaaObjetos;

public class PatineteTeste 
{
	public static void main(String[] args) 
	{
		Patinete patinete1 = new Patinete("Prata","X");
		patinete1.velocidadeAtual = 0;
		
		System.out.println(patinete1.getinfo());
		patinete1.liga();
		patinete1.acelerador(2);
		System.out.println("Velocidade: "+patinete1.velocidadeAtual);
	}

}
