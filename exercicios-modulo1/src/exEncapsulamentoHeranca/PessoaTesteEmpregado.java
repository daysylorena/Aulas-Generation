package exEncapsulamentoHeranca;

public class PessoaTesteEmpregado {
	public static void main(String[] args) 
	{
		Empregado emp1 = new Empregado("Aurora","Ladeira Abaixo,1001","3224-4000","02/07/1968",'F',603,3200,8.5);
		System.out.println("Nome: "+emp1.getNome());
		System.out.println("Endereço: "+emp1.getEndereco());
		System.out.println("Telefone: "+emp1.getTelefone());
		System.out.println("Data de nascimento: "+emp1.getDataDeNascimento());
		System.out.println("Gênero: "+emp1.getGenero());
		System.out.printf("Salário: R$ %.2f",emp1.calcularSalario(emp1.getSalario()));
		
		
	}

}
