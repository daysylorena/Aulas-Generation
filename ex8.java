package exercicios;

import java.util.Scanner;

public class ex8 
{
	/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.*/
	public static void main(String[] args)
	{
		double cconsu,cfab,pdist,imp; /*Respectivamente custo ao consumidor, custo de f�brica, 
		percentagem do distribuidor e impostos*/
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o valor do custo de f�brica do carro em quest�o?");
		cfab = ler.nextFloat();
		pdist=0.28*cfab;
		imp=0.45*cfab;
		cconsu=cfab+pdist+imp;
		System.out.println("O custo ao consumidor ser� de " + cconsu + " unidaes monet�rias.");
	}

}
