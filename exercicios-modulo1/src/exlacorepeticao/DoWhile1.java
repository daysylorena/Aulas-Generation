package exlacorepeticao;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
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
		System.out.printf("A soma dos valores digitados � %d.",soma);
	}

}
