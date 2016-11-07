package br.com.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String BANCODEDADOS = "sistemalp3";
    private static final String URL = "jdbc:mysql://localhost/" + BANCODEDADOS;
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    public static Connection getConnection() throws SQLException{
        try{
            Class.forName(DRIVER);
            System.out.println(" ++ Conectando com o banco de dados");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
            System.out.println(c.getMessage());
            throw new SQLException(c.getMessage());
        }
    }

    static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
