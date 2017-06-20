package pronatec;

public class MultiplosConstrutores {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Av Conde da Boa vista");
		endereco.setNumero(15);
		endereco.setCidade("Recife");
		endereco.setComplemento("Apartamento A");
		
		TerceiraPessoa p1 = new TerceiraPessoa("José");
		p1.setEndereco(endereco);
		
		TerceiraPessoa p2 = new TerceiraPessoa("Maria", 40);
		p2.setEndereco(endereco);
		
		TerceiraPessoa p3 = new TerceiraPessoa("Joana", 30, "F", "Brasileira");
		p3.setEndereco(endereco);
		
		TerceiraPessoa p4 = new TerceiraPessoa();
		p4.setEndereco(endereco);
		
		imprime(p4);
	}
	
	public static void imprime(TerceiraPessoa p) {
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
		System.out.println("Sexo: " + p.getSexo());
		System.out.println("Nacionalidade: " + p.getNacionalidade());
	}
}
