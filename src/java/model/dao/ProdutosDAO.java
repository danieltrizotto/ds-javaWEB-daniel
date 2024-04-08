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
import model.bean.Produtos;

/**
 *
 * @author Senai
 */
public class ProdutosDAO {

    public List<Produtos> read() {
        List<Produtos> dao = new ArrayList();

        try {

            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM  produtos");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos p = new Produtos();
                p.setId_produto(rs.getInt("id_produto"));
                p.setCategoria_id(rs.getInt("categoria_id"));
                p.setNome(rs.getString("nome"));
                p.setImagem(rs.getBytes("imagem"));
                p.setValor(rs.getFloat("valor"));
                dao.add(p);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao;
    }

    public void criar(Produtos p) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("insert into pedido(categoria_id,nome,imagem,valor) values (?,?,?,?)");

            stmt.setInt(1, p.getCategoria_id());
            stmt.setString(2, p.getNome());
            stmt.setBytes(3, p.getImagem());
            stmt.setFloat(4, p.getValor());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
