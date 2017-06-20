package pronatec;

public class OutraPessoa {
	private String nomeCompleto;
	private String[] nomeFatiado;
	public OutraPessoa(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
		this.nomeFatiado = nomeCompleto.split(" ");
	}
	public String getPrimeiroNome() {
		return nomeFatiado[0];
	}
	public String getUltimoNome() {
		return nomeFatiado[nomeFatiado.length - 1];
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
}
