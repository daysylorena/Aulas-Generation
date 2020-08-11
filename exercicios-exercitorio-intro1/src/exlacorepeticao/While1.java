package exlacorepeticao;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
public class While1 
{
	public static void main(String[] args) 
	{
		int idade,menos21=0,mais50=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Entre com a idade: ");
		idade = ler.nextInt();
		while(idade!=-99)
		{
			if(idade<21)
			{
				menos21++;
			}
			else if (idade>50)
			{
				mais50++;
			}
			System.out.printf("Entre com a idade: ");
			idade = ler.nextInt();
		}
		System.out.printf("Total de pessoas com menos de 21 anos: %d\nTotal de pessoas com mais de 50 anos: %d",menos21,mais50);
		
	}

}
