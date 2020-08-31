package exInterfacePolimorfismo;

public class Cachorro extends Animal{
	
	void movimenta()
	{
		System.out.println("Este animal corre ");
	}
	
	public void emiteSom()
	{
		System.out.println("wolf wolf wolf wolf");
	}
	public String getInfo()
	{
		return "Nome do bichinho: " + super.getNome() + "\nIdade: " + super.getIdade();
	}

}
