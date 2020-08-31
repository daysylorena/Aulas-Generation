package exInterfacePolimorfismo;

public class AnimalTeste {
	public static void main(String[] args) 
	{
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Melzinha");
		cachorro.setIdade(7);
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Pé de Pano");
		cavalo.setIdade(10);
		
		Preguica preguica = new Preguica();
		preguica.setNome("Dona Preguiça");
		preguica.setIdade(17);
		
		Animal[] animais = new Animal[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(Animal animal:animais)
		{
			System.out.println("Nome do bichinho: " + animal.getNome() + "\nIdade: " + animal.getIdade());
			if(animal.getNome()=="Melzinha") {
				cachorro.emiteSom();
				cachorro.movimenta();
			}
			else if (animal.getNome()=="Pé de Pano") {
				cavalo.emiteSom();
				cavalo.movimenta();
			}
			else if (animal.getNome()=="Dona Preguiça") {
				preguica.emiteSom();
				preguica.movimenta();
			}
			System.out.println();
		}
	}

}
