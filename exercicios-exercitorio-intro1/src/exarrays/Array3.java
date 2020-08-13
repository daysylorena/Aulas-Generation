package exarrays;

import java.util.Scanner;

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
public class Array3 
{
	public static void main(String[] args) 
	{
		int[][] matriz = new int[3][3];
		int contador=0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Matriz M[3][3] \n");
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna] = ler.nextInt();
				if(matriz[linha][coluna]>10)
				{
					contador++;
				}
			}
		}
		System.out.println("\nA Matriz ficou: \n");
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.printf("\t %d \t",matriz[linha][coluna]);
			}
			System.out.println();
		}
		System.out.printf("\nA matriz em questão possui %d valor(es) maior(es) que 10.",contador);
		
		
		
	}

}
