package exlacorepeticao;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
public class For2 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int i, n, par=0, impar=0;
		
		for(i=1;i<=10;i++)
		{
			System.out.printf("Entre com o %d� n�mero: ",i);
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
		System.out.printf("%d n�mero(s) �/s�o par(es) e %d n�mero(s) �/s�o �mpar(es).",par,impar);
		
		
	}

}
