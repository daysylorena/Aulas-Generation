package exInterfacePolimorfismo;

public class Preguica extends Animal{
	void movimenta()
	{
		System.out.println("Este animal sobe em árvores ");
	}
	
	public void emiteSom()
	{
		System.out.println("shhhh...");
	}
	public String getInfo()
	{
		return "Nome do bichinho: " + super.getNome() + "\nIdade: " + super.getIdade();
	}
}
