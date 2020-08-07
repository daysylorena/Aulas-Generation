package exercicios;

import java.util.Scanner;

public class ex7 
{
	/*Um sistema de equações lineares do tipo:
	 ax+by=c
	 dx+ey=f
	 pode ser resolvido segundo mostrado abaixo :
	x=(c*e-b*f)/(a*e*d)
	y=(a*f-c*d)/(a*e-b*d)
	Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.*/
	public static void main(String[] args)
	{
		int a,b,c,d,e,f;
		float x,y;
		Scanner ler = new Scanner(System.in);
		System.out.println("Considerando o sistema de equações lineares \nax+by=c\ndn+ey=f\nDigite o valor dos coeficientes\n");
		System.out.println("a: ");
		a = ler.nextInt();
		System.out.println("b: ");
		b = ler.nextInt();
		System.out.println("c: ");
		c = ler.nextInt();
		System.out.println("d: ");
		d = ler.nextInt();
		System.out.println("e: ");
		e = ler.nextInt();
		System.out.println("f: ");
		f = ler.nextInt();
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		System.out.println("Para os valores digitados temos que x=" + x + "e y=" + y);
	}

}
