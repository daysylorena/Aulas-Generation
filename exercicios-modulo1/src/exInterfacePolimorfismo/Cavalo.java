package exInterfacePolimorfismo;

public class Cavalo extends Animal{

	void movimenta()
	{
		System.out.println("Este animal corre ");
	}
	
	public void emiteSom()
	{
		System.out.println("Riiiiinch");
	}
	public String getInfo()
	{
		return "Nome do bichinho: " + super.getNome() + "\nIdade: " + super.getIdade();
	}

}
