package exercicios;

import java.util.Scanner;

public class ex3 
{
	/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int tempo,horas,minutos,segundos;
		System.out.println("Digite qual foi a dura��o do evento (em segundos): ");
		tempo = ler.nextInt();
		horas=tempo/3600;
		minutos=(tempo-horas*3600)/60;
		segundos=tempo-horas*3600-minutos*60;
		System.out.println("O evento durou " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s).");
	}

}
