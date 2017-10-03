/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pronatec.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cleber
 */
public class Banco {

    public static Connection criarConexao() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:banco.sqlite");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static void fecharConexao(Connection conexao) {
        try {
            if (conexao != null) {
                conexao.close();
            }
        } catch (Exception e) {}
    }
}
