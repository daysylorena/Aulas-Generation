package exercicios;

import java.util.Scanner;

public class ex8 
{
	/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.*/
	public static void main(String[] args)
	{
		double cconsu,cfab,pdist,imp; /*Respectivamente custo ao consumidor, custo de fábrica, 
		percentagem do distribuidor e impostos*/
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o valor do custo de fábrica do carro em questão?");
		cfab = ler.nextFloat();
		pdist=0.28*cfab;
		imp=0.45*cfab;
		cconsu=cfab+pdist+imp;
		System.out.println("O custo ao consumidor será de " + cconsu + " unidaes monetárias.");
	}

}
