/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pronatec;

import java.util.List;
import java.util.Scanner;
import pronatec.bd.PessoaDAO;
import pronatec.modelo.Pessoa;

/**
 *
 * @author Cleber
 */
public class Aplicacao {

    public static void main(String[] args) {
        int opcao = -1;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Listar Pessoas\n2 - Inserir uma Pessoa\n3 - Apagar uma Pessoa\n0 - Sair");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 1:
                    listarPessoas();
                    break;
                case 2:
                    inserirPessoa(leitor);
                    break;
                case 3:
                	apagarPessoa(leitor);
                    break;
            }
        } while (opcao != 0);
        leitor.close();
        System.out.println("Finalizado com sucesso!");
    }
    
    private static void listarPessoas() {
        System.out.println("Listando as Pessoas");
        PessoaDAO pessoaDAO = new PessoaDAO();
        List<Pessoa> pessoas = pessoaDAO.listarPessoas();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
    
    private static void inserirPessoa(Scanner leitor) {
    	Pessoa pessoa = new Pessoa();
    	System.out.print("Informe o Nome da pessoa: ");
        pessoa.setNome(leitor.nextLine());
        System.out.print("Informe o CPF da pessoa: ");
        pessoa.setCpf(leitor.nextLine());
        System.out.print("Informe o E-mail da pessoa: ");
        pessoa.setEmail(leitor.nextLine());
        System.out.print("Informe a Idade da pessoa: ");
        pessoa.setIdade(leitor.nextInt());
        leitor.nextLine();
        PessoaDAO pessoaDAO = new PessoaDAO();
        if (!pessoaDAO.contemPessoa(pessoa)) {
        	pessoaDAO.inserirPessoa(pessoa);
        	System.out.println("Pessoa inserida com sucesso!");
        } else {
        	System.out.println("Opa, já existe uma pessoa cadastrada com estes dados!");
        }
    }
    
    private static void apagarPessoa(Scanner leitor) {
    	System.out.print("Informe o CPF da pessoa que deseja apagar: ");
        String cpf = leitor.nextLine();
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.apagarPessoa(cpf);
        System.out.println("Apagado!");
    }
}
