package exarrays;

import java.util.Scanner;

public class teste 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		float [][]matrizA= new float[2][2];
		float [][]matrizB= new float[2][2];
		int linha,coluna,opcao,x;
		float [][]matrizC= new float[2][2];
		
		System.out.println("Matriz A[2][2]");
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.printf("Insira o elemento A[%d][%d]: ",linha+1,coluna+1);
				matrizA[linha][coluna]=ler.nextFloat();
			}
		}
		System.out.println("Matriz M[3][3] \n");
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna] = ler.nextInt();
			}
		}
		
		System.out.println("\nA Matriz ficou: \n");
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.printf("\t %d \t",matriz[linha][coluna]);
			}
			System.out.println();
		}
		System.out.printf("\nAs matrizes são: \nA\n");
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.printf("\t %f \t",matrizA[linha][coluna]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
