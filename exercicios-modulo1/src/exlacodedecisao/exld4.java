package exlacodedecisao;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
public class exld4 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int num;
		double raiz,elevado;
		System.out.printf("Entre com um n�mero: ");
		num = ler.nextInt();
		if(num%2==0)
		{
			raiz=Math.sqrt(num);
			System.out.printf("Este n�mero � par e sua raiz quadrada � %f",raiz);
		}
		else
		{
			elevado=Math.round(Math.pow(num, 2));
			System.out.printf("Este n�mero � �mpar e seu valor elevado ao quadrado � %f",elevado);
		}
	}

}
