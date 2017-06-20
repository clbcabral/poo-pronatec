package pronatec;

public class TestadorPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(20, "Fulano de Tal");
		Pessoa pessoa2 = new Pessoa(25, "Cleber");
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa1.getNome());
		pessoa1.setNome("Cristiana");
		System.out.println(pessoa1.getNome());
//		pessoa1.fezAniversario();
//		System.out.println(pessoa1);
//		System.out.println(pessoa1);
		// System.out.println("Nome: " + p.nome + ", Idade: " + p.idade);		
	}
}
