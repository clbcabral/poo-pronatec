package pronatec;

public class TerceiraPessoa {
	private String nome;
	private int idade;
	private String sexo;
	private String nacionalidade;
	private Endereco endereco;
	public TerceiraPessoa() {
	}
	public TerceiraPessoa(String nome) {
		this.nome = nome;
	}
	public TerceiraPessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public TerceiraPessoa(String nome, int idade, String sexo, String nacionalidade) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getSexo() {
		return sexo;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
