package Collections;

import java.util.ArrayList;
import java.util.Collection;
/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular 
os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
- Armazenar dados da List
- Remover dados da list;
- Atualizar dados da list.
- Apresentar todos os dados da list.*/

public class exEstoque {
	public static void main(String[] args) 
	{
		Collection <String> itens = new ArrayList();
		//armazenar os dados da List
		itens.add("sabonete");
		itens.add("xampu");
		itens.add("condicionador");
		itens.add("creme dental");
		itens.add("escova dental");
		itens.add("fio dental");
		itens.add("esponja");
		
		//remover dados da list		
		System.out.println("Lista de itens: "+itens);
		itens.remove("esponja");
		//atualizar dados da list
		System.out.println("Lista de itens: "+itens);
		
		//apresentar todos os dados da list
		System.out.println("Lista de itens: ");
		for (String item:itens)
		{
			System.out.println("- "+item);
		}
	}

}
