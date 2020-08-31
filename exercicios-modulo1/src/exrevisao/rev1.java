package exrevisao;

import java.util.Scanner;

public class rev1 
{	/*Elabore um programa que calcule o que deve ser pago por um produto, considerando
o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos
da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
adequado.
Código 	Condição de pagamento
	1 	À vista em dinheiro ou cheque, recebe 20% de desconto
	2 	À vista no cartão de crédito, recebe 15% de desconto
	3 	Em duas vezes, preço normal de etiqueta sem juros
	4 	Em três vezes, preço normal de etiqueta mais juros de 10%*/
	public static void main(String[] args) 
	{
		double precoprod, precof; //preço do produto e preço final
		int opcao;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite o preço do produto: ");
		precoprod = ler.nextFloat();
		
		System.out.println("Escolha a opção de pagamento:");
		System.out.println("1-À vista em dinheiro ou cheque (recebe 20% de desconto)");
		System.out.println("2-À vista no cartão de crédito (recebe 15% de desconto)");
		System.out.println("3-Em duas vezes (preço normal de etiqueta sem juros)");
		System.out.println("4-Em três vezes (preço normal de etiqueta mais juros de 10%)");
		opcao = ler.nextInt();
		
		switch(opcao)
		{
		case 1:
			precof=precoprod*0.8;
			System.out.println("O valor a ser pago com esta opção é R$ "+precof);
			break;
		case 2:
			precof=precoprod*0.75;
			System.out.println("O valor a ser pago com esta opção é R$ "+precof);
			break;
		case 3:
			precof=precoprod;
			System.out.println("O valor a ser pago com esta opção é R$ "+precof);
			break;
		case 4:
			precof=precoprod*1.1;
			System.out.println("O valor a ser pago com esta opção é R$ "+precof);
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		
	}

}
