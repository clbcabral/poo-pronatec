/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pronatec.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pronatec.modelo.Pessoa;

/**
 *
 * @author Cleber
 */
public class PessoaDAO {
    
    public List<Pessoa> listarPessoas() {
        Connection conexao = null;
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            conexao = Banco.criarConexao();
            Statement statement = conexao.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM PESSOA");
            while (results.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(results.getLong("id"));
                pessoa.setNome(results.getString("nome"));
                pessoa.setCpf(results.getString("cpf"));
                pessoa.setEmail(results.getString("email"));
                pessoa.setIdade(results.getInt("idade"));
                pessoas.add(pessoa);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            Banco.fecharConexao(conexao);
        }
        return pessoas;
    }
    
    public void inserirPessoa(Pessoa pessoa) {
    	Connection conexao = null;
        try {
            conexao = Banco.criarConexao();
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO PESSOA (NOME, CPF, EMAIL, IDADE) ");
            sql.append("VALUES (?, ?, ?, ?) ");
            PreparedStatement statement = conexao.prepareStatement(sql.toString());
            statement.setString(1, pessoa.getNome());
            statement.setString(2, pessoa.getCpf());
            statement.setString(3, pessoa.getEmail());
            statement.setInt(4, pessoa.getIdade());
            statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            Banco.fecharConexao(conexao);
        }
    }
    
    public boolean contemPessoa(Pessoa pessoa) {
    	boolean contem = false;
    	Connection conexao = null;
        try {
            conexao = Banco.criarConexao();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT COUNT(*) as total FROM PESSOA ");
            sql.append("WHERE NOME = ? AND CPF = ? AND EMAIL = ? AND IDADE = ?");
            PreparedStatement statement = conexao.prepareStatement(sql.toString());
            statement.setString(1, pessoa.getNome());
            statement.setString(2, pessoa.getCpf());
            statement.setString(3, pessoa.getEmail());
            statement.setInt(4, pessoa.getIdade());
            ResultSet results = statement.executeQuery();
            contem = results.next() && results.getInt("total") > 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            Banco.fecharConexao(conexao);
        }
        return contem;
    }
    
    public void apagarPessoa(String cpf) {
    	Connection conexao = null;
        try {
            conexao = Banco.criarConexao();
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM PESSOA ");
            sql.append("WHERE CPF = ? ");
            PreparedStatement statement = conexao.prepareStatement(sql.toString());
            statement.setString(1, cpf);
            statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            Banco.fecharConexao(conexao);
        }
    }
}
