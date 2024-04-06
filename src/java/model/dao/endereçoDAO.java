/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.endereço;

/**
 *
 * @author User
 */
public class endereçoDAO {
    public List<endereço> read() {
        List<endereço> dao = new ArrayList();

        try {

            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM  endereço");

            rs = stmt.executeQuery();

            while (rs.next()) {
                endereço e = new endereço();
                e.setId_endereço(rs.getInt("id_endereço"));
                e.setUsuario_id1(rs.getInt("usuario_id1"));
                e.setRua(rs.getString("rua"));
                e.setNumero(rs.getInt("numero"));
                e.setComplemento(rs.getString("complemento"));
                dao.add(e);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao;
    }

}
