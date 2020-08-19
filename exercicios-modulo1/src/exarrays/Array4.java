package exarrays;

import java.util.Scanner;

/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um  menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/
public class Array4 
{
	public static void main(String[] args) 
	{
		float [][]matrizA= new float[2][2];
		float [][]matrizB= new float[2][2];
		int linha,coluna,opcao,x;
		float [][]matrizC= new float[2][2];
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Matriz A[2][2]");
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.printf("Insira o elemento A[%d][%d]: ",linha+1,coluna+1);
				matrizA[linha][coluna]=ler.nextFloat();
			}
		}
		System.out.println("Matriz B[2][2]");
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.printf("Insira o elemento B[%d][%d]: ",linha+1,coluna+1);
				matrizB[linha][coluna]=ler.nextFloat();
			}
		}
		System.out.println("Escolha uma opção do menu:\n1--somar as duas matrizes\n2--subtrair a primeira matriz da segunda\n3--adicionar uma constante as duas matrizes\n4--imprimir as matrizes\n");
		opcao = ler.nextInt();
		
		switch(opcao)
		{
		case 1:
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matrizC[linha][coluna]=matrizA[linha][coluna]+matrizB[linha][coluna];
					System.out.printf("\t %f \t",matrizC[linha][coluna]);
				}
				System.out.println();
			}
			break;
		case 2:
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matrizC[linha][coluna]=matrizB[linha][coluna]-matrizA[linha][coluna];
					System.out.printf("\t %f \t",matrizC[linha][coluna]);
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.println("Entre com o valor da constante: ");
			x = ler.nextInt();
			System.out.println("\nA:\n");
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matrizA[linha][coluna]=matrizA[linha][coluna]+x;
					System.out.printf("\t %f \t",matrizA[linha][coluna]);
				}
				System.out.println();
			}
			System.out.println("\nB:\n");
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matrizB[linha][coluna]=matrizB[linha][coluna]+x;
					System.out.printf("\t %f \t",matrizB[linha][coluna]);
				}
				System.out.println();
			}
			break;
		case 4:
			System.out.printf("\nAs matrizes são: \nA\n");
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					System.out.printf("\t %f \t",matrizA[linha][coluna]);
				}
				System.out.println();
			}
			System.out.printf("\nB\n");
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					System.out.printf("\t %f \t",matrizB[linha][coluna]);
				}
				System.out.println();
			}
			break;
		}
		
	}

}
