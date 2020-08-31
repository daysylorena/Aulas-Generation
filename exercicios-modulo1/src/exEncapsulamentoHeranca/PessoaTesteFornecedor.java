package exEncapsulamentoHeranca;

public class PessoaTesteFornecedor {
	public static void main(String[] args) 
	{
		Fornecedor fornec1 = new Fornecedor("Eugenia","Rua dos Abacateiros,42","(11)6574-3248","15/07/1988",'F',2600.65,1900.05);
		System.out.println("Nome: "+fornec1.getNome());
		System.out.println("Endereço: "+fornec1.getEndereco());
		System.out.println("Telefone: "+fornec1.getTelefone());
		System.out.println("Data de Nascimento: "+fornec1.getDataDeNascimento());
		System.out.println("Gênero: "+fornec1.getGenero());
		System.out.println("Saldo: "+fornec1.obterSaldo(fornec1.getSaldo()));
	}

}
