package exlacorepeticao;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
public class While2 
{
	public static void main(String[] args) 
	{
		int n=1,idade,sexo,fem=0,masc=0,outros=0,psic,calma=0,nervosa=0,agressiva=0,femnerv=0,mascagr=0,outroscalm=0,nerv40=0,calm18=0;
		Scanner ler = new Scanner(System.in);
		
		while(n<=5)
		{
			System.out.printf("Entre com a idade: ");
			idade = ler.nextInt();
			System.out.printf("Entre com o gênero (1-feminino / 2-masculino / 3-outros): ");
			sexo = ler.nextInt();
			switch(sexo)
			{
			case 1:
				fem++;
				break;
			case 2:
				masc++;
				break;
			case 3:
				outros++;
				break;
			}
			System.out.printf("Entre com a característica psicológica (1-calma / 2-nervosa / 3-agressiva): ");
			psic = ler.nextInt();
			switch(psic)
			{
			case 1:
				calma++;
				break;
			case 2:
				nervosa++;
				break;
			case 3:
				agressiva++;
				break;
			}
			n++;
			if(sexo==1 && psic==2)
			{
				femnerv++;
			}
			else if(sexo==2 && psic==3)
			{
				mascagr++;
			}
			else if(sexo==3 && psic==1)
			{
				outroscalm++;
			}
			else if(psic==2 && idade>40)
			{
				nerv40++;
			}
			else if(psic==1 && idade<18)
			{
				calm18++;
			}
		}
		System.out.printf("Os dados revelam que:\n");
		System.out.printf("Há %d pessoas calmas.\n",calma);
		System.out.printf("Há %d mulheres nervosas.\n",femnerv);
		System.out.printf("Há %d homens agressivos.\n",mascagr);
		System.out.printf("Há %d outros calmos.\n",outroscalm);
		System.out.printf("Há %d pessoas nervosas com mais de 40 anos.\n",nerv40);
		System.out.printf("Há %d pessoas calmas com medos de 18 anos.\n",calm18);		
	}

}
