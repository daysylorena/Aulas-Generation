package exlacodedecisao;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
public class exld4 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int num;
		double raiz,elevado;
		System.out.printf("Entre com um número: ");
		num = ler.nextInt();
		if(num%2==0)
		{
			raiz=Math.sqrt(num);
			System.out.printf("Este número é par e sua raiz quadrada é %f",raiz);
		}
		else
		{
			elevado=Math.round(Math.pow(num, 2));
			System.out.printf("Este número é ímpar e seu valor elevado ao quadrado é %f",elevado);
		}
	}

}
