package exrevisao;

import java.util.Scanner;

public class rev5 
{/*Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e, depois, um
c�digo inteiro. Se o c�digo for zero, finalize o programa; se for 1, mostre o vetor na
ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o c�digo for diferente
de 1 e 2, escreva uma mensagem informando que o c�digo inv�lido.*/
	public static void main(String[] args) 
	{
		float vetor[]= new float [6];
		int i,codigo;
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<5;i++)
		{
			System.out.printf("Entre com a %d� posi��o: ",i+1);
			vetor[i] = ler.nextFloat();
		}
		System.out.printf("Digite 1 para ver o vetor na ordem direta, 2 para v�-lo na ordem inversa, ou 0 para finalizar o programa. ");
		codigo = ler.nextInt();
		
		if(codigo==1)
		{
			System.out.printf("Vetor: { ");
			for(i=0;i<5;i++)
			{
				System.out.printf(" %f ",vetor[i]);
			}
			System.out.printf(" } ");
		}
		else if(codigo==2)
		{
			System.out.printf("Vetor: { ");
			for(i=4;i>=0;i--)
			{
				System.out.printf(" %f ",vetor[i]);
			}
			System.out.printf(" } ");
		}
		else if(codigo==0)
		{
			System.out.printf("C�digo inv�lido. Programa finalizado com sucesso.");
		}
		else
		{
			System.out.printf("C�digo inv�lido!");
		}
	}

}
