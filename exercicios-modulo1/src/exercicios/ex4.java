package exercicios;

import java.util.Scanner;

public class ex4 
{
	/*Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o: D=(R+S)/2, onde R=(A+B)� e S=(B+C)�.*/
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
		System.out.println("O resultado da express�o D=(R+S)/2 �: " + D + ".");
	}

}
