package exlacodedecisao;
//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
import java.util.Scanner;

public class exld2 
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
		
		if(n1<=n2 && n2<=n3)
		{
			System.out.printf("A ordem crescente � %d, %d, %d",n1,n2,n3);
		}
		else if(n1<=n2 && n3<=n2)
		{
			System.out.printf("A ordem crescente � %d, %d, %d",n1,n3,n2);
		}
		else if(n2<=n1 && n1<=n3)
		{
			System.out.printf("A ordem crescente � %d, %d, %d",n2,n1,n3);
		}
		else if(n2<=n1 && n3<=n1)
		{
			System.out.printf("A ordem crescente � %d, %d, %d",n2,n3,n1);
		}
		else if(n3<=n1 && n1<=n2)
		{
			System.out.printf("A ordem crescente � %d, %d, %d",n3,n1,n2);
		}
		else if(n3<=n1 && n2<=n1)
		{
			System.out.printf("A ordem crescente � %d, %d, %d",n3,n2,n1);
		}
	}

}
