package pronatec;

public class Pessoa {
	private String nome;
	private int idade;
	public Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}
	public void fezAniversario() {
		idade += 1;
	}
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade;
	}
}
