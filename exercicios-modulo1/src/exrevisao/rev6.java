package exrevisao;

import java.util.Scanner;

public class rev6 
{/*Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos.
Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.*/
	public static void main(String[] args) 
	{
		int vetor[] = new int [3];
		int matriz[][] = new int [3][3];
		int mult[][] = new int [3][3];
		int i,j;
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<3;i++)
		{
			System.out.printf("Entre com o %dº elemento do vetor: ",i+1);
			vetor[i]=ler.nextInt();
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.printf("Entre com o elemento [%d][%d] da matriz: ",i+1,j+1);
				matriz[i][j] = ler.nextInt();
			}
		}
		System.out.printf("O vetor ficou: { ");
		for(i=0;i<3;i++)
		{
			System.out.printf(" %d ",vetor[i]);
		}
		System.out.printf("O } ");
		System.out.println("\nA Matriz ficou: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.printf("\t %d \t",matriz[i][j]);
			}
			System.out.println();
		}
		System.out.printf("Veja a seguir a multiplicação do vetor pelas colunas da matriz\n");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mult[i][j]=vetor[i]*matriz[i][j];
				System.out.printf("\t %d \t",mult[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
