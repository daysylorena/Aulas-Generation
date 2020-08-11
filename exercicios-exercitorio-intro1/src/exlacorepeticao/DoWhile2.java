package exlacorepeticao;
/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

import java.util.Scanner;

public class DoWhile2 
{
	public static void main(String[] args) 
	{
		int valor,contmult=0,somamult=0,mediamult;
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.printf("Entre com um valor: ");
			valor = ler.nextInt();
			if(valor%3==0)
			{
				somamult = somamult + valor;
				contmult++;
			}
		}while(valor!=0);
		mediamult=somamult/(contmult-1);
		System.out.printf("A média dos números múltiplos de 3 é %d.",mediamult);
	}

}
