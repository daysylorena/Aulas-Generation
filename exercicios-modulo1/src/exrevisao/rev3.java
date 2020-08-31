package exrevisao;

import java.util.Scanner;

public class rev3 
{/*Escrever um programa que leia uma quantidade desconhecida de números e conte
quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A
entrada de dados deve terminar quando for lido um número negativo.*/
	//while valor>=0
	//ifs com um contador para cada intervalo 
	public static void main(String[] args) 
	{
		int valor,cont0a25=0,cont26a50=0,cont51a75=0,cont76a100=0;
		Scanner ler = new Scanner(System.in);
		do
		{
			System.out.printf("Entre com um valor positivo (ou insira um valor negativo para encerrar o programa): ");
			valor = ler.nextInt();
			
			if(valor>=0 && valor<=25)
			{
				cont0a25++;
			}
			else if(valor>=26 && valor<=50)
			{
				cont26a50++;
			}
			else if(valor>=51 && valor<=75)
			{
				cont51a75++;
			}
			else if(valor>=76 && valor<=100)
			{
				cont76a100++;
			}
		}while(valor>=0);
		System.out.printf("\nPrograma encerrado.");
		System.out.printf("\nHá %d número(s) no intervalo [0-25].",cont0a25);
		System.out.printf("\nHá %d número(s) no intervalo [26-50].",cont26a50);
		System.out.printf("\nHá %d número(s) no intervalo [51-75].",cont51a75);
		System.out.printf("\nHá %d número(s) no intervalo [76-100].",cont76a100);
		
	}

}
