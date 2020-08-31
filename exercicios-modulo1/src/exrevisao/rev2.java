package exrevisao;

import java.util.Scanner;

public class rev2 
{/*O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de para
dar uma indica��o sobre a condi��o de peso de uma pessoa adulta. A f�rmula � IMC = peso / ( altura )2
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condi��o de acordo com a tabela abaixo.
IMC em adultos 		Condi��o
Abaixo de 18,5 		Abaixo do peso
Entre 18,5 e 25 	Peso normal
Entre 25 e 30 		Acima do peso
Acima de 30 		Obeso*/
	public static void main(String[] args) 
	{
		double peso,altura,imc;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Para calcular seu IMC digite seu peso e altura.\nPeso: ");
		peso = ler.nextDouble();
		System.out.printf("Altura: ");
		altura = ler.nextDouble();
		
		imc=peso/Math.pow(altura,2);
		
		if(imc<18.5)
		{
			System.out.printf("Seu IMC calculado � %f. Segundo a OMS, sua condi��o � abaixo do peso.\nPara manter a sa�de em dia, procure um profissional da sa�de.",imc);
		}
		else if(imc>=18.5 && imc<25)
		{
			System.out.printf("Seu IMC calculado � %f. Segundo a OMS, sua condi��o � de peso normal.\nPara manter a sa�de em dia, procure um profissional da sa�de.",imc);
		}
		else if(imc>=25 && imc<30)
		{
			System.out.printf("Seu IMC calculado � %f. Segundo a OMS, sua condi��o � acima do peso.\nPara manter a sa�de em dia, procure um profissional da sa�de.",imc);
		}
		else if(imc>=30)
		{
			System.out.printf("Seu IMC calculado � %f. Segundo a OMS, sua condi��o � de obesidade.\nPara manter a sa�de em dia, procure um profissional da sa�de.",imc);
		}
	}

}
