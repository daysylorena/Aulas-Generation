package exarrays;

import java.util.Scanner;

public class Array2 
{/*Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
	public static void main(String[] args) 
	{
		int vetor[] = new int [6];
		int[]pares = new int [6];
		int[]impares = new int [6];
		int i,somapar=0,qtdimpar=0;
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<6;i++)
		{
			System.out.println("Entre com um valor inteiro: ");
			vetor[i] = ler.nextInt();
		}
		System.out.printf("Vetor resultante: {");
        for(i=0; i<6; i++) 
        {
            System.out.printf(" %d ",vetor[i]);
        }
        System.out.printf("}");
		System.out.printf("\nOs números pares digitados foram: ");
		for(i=0;i<6;i++)
		{
			if(vetor[i]%2==0)
			{
				System.out.printf(" %d ", vetor[i]);
				somapar=somapar+vetor[i];
			}
		}
		System.out.printf("\nA soma dos números pares digitados é: %d", somapar);
		System.out.printf("\nOs números ímpares digitados foram: ");
		for(i=0;i<6;i++)
		{
			if(vetor[i]%2!=0)
			{
				System.out.printf(" %d ", vetor[i]);
				qtdimpar++;
			}
		}
		System.out.printf("\nA quantidade de números ímpares digitados é: %d", qtdimpar);
		
	}

}
