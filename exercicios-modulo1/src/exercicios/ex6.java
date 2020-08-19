package exercicios;

import java.util.Scanner;

public class ex6 
{
	/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
que efetua tal cálculo é: d=raizDe((x2-x2)²+(y2-y1)²).*/
	public static void main(String[] args)
	{
		int x1,y1,x2,y2;
		double d;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com as coordenadas do primeiro ponto.\nx: ");
		x1 = ler.nextInt();
		System.out.println("y: ");
		y1 = ler.nextInt();
		System.out.println("Entre com as coordenadas do segundo ponto.\nx: ");
		x2 = ler.nextInt();
		System.out.println("y: ");
		y2 = ler.nextInt();
		d=Math.sqrt(((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2))));
		System.out.println("A distância entre os pontos é " + d + ".");
	}

}
