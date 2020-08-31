package exerciciosIniciais;

import java.util.Scanner;

public class ex1 
{
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
	public static void main (String args[])
	{
		int anos,meses,dias,totaldias;
		Scanner ler = new Scanner(System.in);
		System.out.println("Há quantos anos, meses e dias você nasceu?\nVamos começar pelos anos. Quantos anos fazem?");
		anos = ler.nextInt();
		System.out.println("E quantos meses?");
		meses = ler.nextInt();
		System.out.println("E quantos dias?");
		dias = ler.nextInt();
		totaldias=anos*365+meses*30+dias;
		System.out.println("Você nasceu há " + totaldias + " dias.");
		
	}

}
