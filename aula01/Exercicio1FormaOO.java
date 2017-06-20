package pronatec;

import java.util.Scanner;

public class Exercicio1FormaOO {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o seu nome completo:");
		String nomeCompleto = s.nextLine();
		OutraPessoa pessoa = new OutraPessoa(nomeCompleto);
		System.out.println(pessoa.getNomeCompleto());
		System.out.println("Primeiro nome: " + pessoa.getPrimeiroNome());
		System.out.println("Último nome: " + pessoa.getUltimoNome());
	}

}
