package exercicios;

import java.util.Scanner;

public class ex2 
{
	//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
	public static void main(String args[])
	{
		int anos,meses,dias,totaldias;
		Scanner ler = new Scanner(System.in);
		System.out.println("Há quantos dias você nasceu?");
		totaldias = ler.nextInt();
		anos=totaldias/365;
		meses=(totaldias%365)/30;
		dias=(totaldias%365)%30;
		System.out.println("Você nasceu há " + anos + " anos, " + meses + " meses e " + dias + " dias.");
	}

}
