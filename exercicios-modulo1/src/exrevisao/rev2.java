package exrevisao;

import java.util.Scanner;

public class rev2 
{/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para
dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.
IMC em adultos 		Condição
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
			System.out.printf("Seu IMC calculado é %f. Segundo a OMS, sua condição é abaixo do peso.\nPara manter a saúde em dia, procure um profissional da saúde.",imc);
		}
		else if(imc>=18.5 && imc<25)
		{
			System.out.printf("Seu IMC calculado é %f. Segundo a OMS, sua condição é de peso normal.\nPara manter a saúde em dia, procure um profissional da saúde.",imc);
		}
		else if(imc>=25 && imc<30)
		{
			System.out.printf("Seu IMC calculado é %f. Segundo a OMS, sua condição é acima do peso.\nPara manter a saúde em dia, procure um profissional da saúde.",imc);
		}
		else if(imc>=30)
		{
			System.out.printf("Seu IMC calculado é %f. Segundo a OMS, sua condição é de obesidade.\nPara manter a saúde em dia, procure um profissional da saúde.",imc);
		}
	}

}
