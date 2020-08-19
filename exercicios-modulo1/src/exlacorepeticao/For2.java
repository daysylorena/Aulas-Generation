package exlacorepeticao;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
public class For2 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int i, n, par=0, impar=0;
		
		for(i=1;i<=10;i++)
		{
			System.out.printf("Entre com o %dº número: ",i);
			n = ler.nextInt();
			if(n%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.printf("%d número(s) é/são par(es) e %d número(s) é/são ímpar(es).",par,impar);
		
		
	}

}
