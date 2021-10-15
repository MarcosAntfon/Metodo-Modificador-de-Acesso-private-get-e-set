package TestPrivateSeteGet;

import DominioPrivateSeteGet.Pessoa;

public class PessoaTest01 {

	public static void main(String[] args) {

	Pessoa pessoa = new Pessoa();
//  pessoa.nome = "Marcos";
	
	pessoa.setNome("Marcos");
	pessoa.setIdade(35);

//	pessoa.imprime();
	System.out.println(pessoa.getNome());
	System.out.println(pessoa.getIdade());
	
	
	}

}
