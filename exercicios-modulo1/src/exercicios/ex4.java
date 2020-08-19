package exercicios;

import java.util.Scanner;

public class ex4 
{
	/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D=(R+S)/2, onde R=(A+B)² e S=(B+C)².*/
	public static void main(String args[]) 
	{
		int A,B,C;
		double D,R,S;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		A = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		B = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		C = ler.nextInt();
		R=Math.pow((A+B),2);
		S=Math.pow((B+C),2);
		D=(R+S)/2;
		System.out.println("O resultado da expressão D=(R+S)/2 é: " + D + ".");
	}

}
