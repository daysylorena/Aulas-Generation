package exlacodedecisao;
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
import java.util.Scanner;

public class exld1 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3;
		System.out.printf("Entre com o primeiro valor: ");
		n1 = ler.nextInt();
		System.out.printf("Entre com o segundo valor: ");
		n2 = ler.nextInt();
		System.out.printf("Entre com o terceiro valor: ");
		n3 = ler.nextInt();
		
		if(n1>=n2 && n1>=n3)
		{
			System.out.printf("O maior valor � %d",n1);
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.printf("O maior valor � %d",n2);
		}
		else
		{
			System.out.printf("O maior valor � %d",n3);
		}
	}

}
