package programacaoOrientadaaObjetos;
/*Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Patinete 
{
		String corPatinete;
		String modeloPatinete;
		int velocidadeAtual;
		
		public Patinete (String cor,String modelo)
		{
			corPatinete = cor;
			modeloPatinete = modelo;;
		}
		public String getinfo()
		{
			String info = "Cor: "+corPatinete+"\nModelo: "+modeloPatinete;
			return info;
		}
		void liga()
		{
			System.out.println("Ligado");
		}
		void acelerador(int quantidade)
		{
			int velocidadeNova = this.velocidadeAtual + quantidade;
			this.velocidadeAtual = velocidadeNova;
		}
		
		void velocidade() 
		{
			if(velocidadeAtual==0)
			{
				System.out.println("Em repouso");
			}
			if(velocidadeAtual==1)
			{
				System.out.println("Passeando");
			}
			if(velocidadeAtual==2)
			{
				System.out.println("Caminhando");
			}
			if(velocidadeAtual==3)
			{
				System.out.println("Correndo");
			}
		}
}
