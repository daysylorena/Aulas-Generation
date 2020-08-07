package exercicios;

import java.util.Scanner;

public class ex5 
{
	/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/
	public static void main(String[] args)
	{
		float n1,n2,n3,mp;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor da primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Digite o valor da segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Digite o valor da terceira nota: ");
		n3 = ler.nextFloat();
		mp=(n1*2+n2*3+n3*5)/10;
		System.out.println("A média final é " + mp + ".");
	}

}
