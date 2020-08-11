package exlacorepeticao;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/
public class DoWhile1 
{
	public static void main(String[] args) 
	{
		int valor,soma=0;
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.printf("Entre com um valor: ");
			valor = ler.nextInt();
			soma = soma + valor;
		}while(valor!=0);
		System.out.printf("A soma dos valores digitados é %d.",soma);
	}

}
