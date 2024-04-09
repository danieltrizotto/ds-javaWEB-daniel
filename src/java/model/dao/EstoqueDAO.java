/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Estoque;

/**
 *
 * @author Senai
 */
public class EstoqueDAO {

    public List<Estoque> read() {
        List<Estoque> dao = new ArrayList();

        try {

            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM  estoque");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Estoque e = new Estoque();
                e.setId_estoque(rs.getInt("id_estoque"));
                e.setProduto_id2(rs.getInt("produto_id2"));
                e.setQuantidade_estoque(rs.getInt("quantidade_estoque"));

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

    public void update(Estoque es) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("update estoque set produto_id2 = ?, quantidade_estoque=? where  id_estoque = ? ");
            stmt.setInt(1, es.getProduto_id2());
            stmt.setInt(2, es.getQuantidade_estoque());
            stmt.setInt(3, es.getId_estoque());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
