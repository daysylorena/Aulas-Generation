programa
{
	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

	funcao inicio()
	{
		const inteiro tamL=2,tamC=2
		inteiro N1[tamL][tamC],N2[tamL][tamC],l,c

		para(l=0;l<tamL;l++)
		{
			para(c=0;c<tamC;c++)
			{
				escreva(" Valor N1: ")
				leia(N1[l][c])
			}
		}
				
		para(l=0;l<tamL;l++)
		{
			para(c=0;c<tamC;c++)
			{
				escreva(" Valor N2: ")
				leia(N2[l][c])
			}
		}
		limpa()
		escreva("N1: \n")
		para(l=0;l<tamL;l++)
		{
			para(c=0;c<tamC;c++)
			{
				escreva(" [ ",N1[l][c]," ] ")
			}
		escreva("\n")
		}
		escreva("N2: \n")
		para(l=0;l<tamL;l++)
		{
			para(c=0;c<tamC;c++)
			{
				escreva(" [ ",N2[l][c]," ] ")
			}
		escreva("\n")
		}
		escreva("M1(soma): \n")
		para(l=0;l<tamL;l++)
		{
			para(c=0;c<tamC;c++)
			{
				escreva(" [ ",(N1[l][c]+N2[l][c])," ] ")
			}
		escreva("\n")
		}
		escreva("M2(diferença): \n")
		para(l=0;l<tamL;l++)
		{
			para(c=0;c<tamC;c++)
			{
				escreva(" [ ",(N1[l][c]-N2[l][c])," ] ")
			}
		escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */