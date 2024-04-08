/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Senai
 */
public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/mercadoWeb";
     private static final String USUARIO = "root";
      private static final String SENHA = "";
      //VICTOR
       private static final String driver = "com.mysql.cj.jdbc.Driver";

    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    //
}
