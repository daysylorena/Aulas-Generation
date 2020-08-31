package exrevisao;

public class rev4 
{//Faça um programa em Java que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
	public static void main(String[] args) 
	{
		double num=-1,den=0;
		double soma=0;
		System.out.printf("Soma = ");
		while(num<99 && den<=50)
		{
			num=num+2;
			den++;
			System.out.printf(" %f/%f + ",num,den);
			soma=soma+(num/den);
		};
		System.out.println("\nSoma = "+soma);
	}

}
