package pronatec;

import java.util.Scanner;

public class Exercicio1FormaProcedural {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o seu nome completo:");
		String nomeCompleto = s.nextLine();
		System.out.println(nomeCompleto);
		String[] partes = nomeCompleto.split(" ");
		String primeroNome = partes[0];
		String ultimoNome = partes[partes.length - 1];
		System.out.println("Primeiro nome: " + primeroNome);
		System.out.println("Último nome: " + ultimoNome);
	}

}
