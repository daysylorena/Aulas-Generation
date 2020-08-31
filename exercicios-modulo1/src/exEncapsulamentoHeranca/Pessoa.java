package exEncapsulamentoHeranca;
/*Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
op��es de construtores (m�todos) conforme sua percep��o. Atributos: String nome; String endere�o; String telefone;*/
public class Pessoa 
{
	private String nome;
	private String endereco;
	private String telefone;
	private String dataDeNascimento;
	private char genero;
	
	public Pessoa(String nome,String endereco,String telefone, String dataDeNascimento, char genero) //construtor
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataDeNascimento = dataDeNascimento;
		this.genero = genero;
	}
	
	void acordar () {
		System.out.println(nome+" acordou ");
	}
	void andar() 
	{
		System.out.println(nome+" est� andando...");
	}
	

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}


	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
