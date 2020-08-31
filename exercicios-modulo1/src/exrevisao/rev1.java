package exrevisao;

import java.util.Scanner;

public class rev1 
{	/*Elabore um programa que calcule o que deve ser pago por um produto, considerando
o pre�o normal de etiqueta e a escolha da condi��o de pagamento. Utilize os c�digos
da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo
adequado.
C�digo 	Condi��o de pagamento
	1 	� vista em dinheiro ou cheque, recebe 20% de desconto
	2 	� vista no cart�o de cr�dito, recebe 15% de desconto
	3 	Em duas vezes, pre�o normal de etiqueta sem juros
	4 	Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%*/
	public static void main(String[] args) 
	{
		double precoprod, precof; //pre�o do produto e pre�o final
		int opcao;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite o pre�o do produto: ");
		precoprod = ler.nextFloat();
		
		System.out.println("Escolha a op��o de pagamento:");
		System.out.println("1-� vista em dinheiro ou cheque (recebe 20% de desconto)");
		System.out.println("2-� vista no cart�o de cr�dito (recebe 15% de desconto)");
		System.out.println("3-Em duas vezes (pre�o normal de etiqueta sem juros)");
		System.out.println("4-Em tr�s vezes (pre�o normal de etiqueta mais juros de 10%)");
		opcao = ler.nextInt();
		
		switch(opcao)
		{
		case 1:
			precof=precoprod*0.8;
			System.out.println("O valor a ser pago com esta op��o � R$ "+precof);
			break;
		case 2:
			precof=precoprod*0.75;
			System.out.println("O valor a ser pago com esta op��o � R$ "+precof);
			break;
		case 3:
			precof=precoprod;
			System.out.println("O valor a ser pago com esta op��o � R$ "+precof);
			break;
		case 4:
			precof=precoprod*1.1;
			System.out.println("O valor a ser pago com esta op��o � R$ "+precof);
			break;
		default:
			System.out.println("Op��o inv�lida!");
		}
		
		
	}

}
