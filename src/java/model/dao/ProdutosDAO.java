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
import java.util.Base64;
import java.util.List;
import model.bean.Produtos;

/**
 *
 * @author Senai
 */
public class ProdutosDAO {

    public List<Produtos> leitura() {
        ////victor
        List<Produtos> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produtos objProduto = new Produtos();
                objProduto.setId_Produto(rs.getInt("id_produto"));
                objProduto.setNome(rs.getString("nome"));
                objProduto.setValor(rs.getFloat("valor"));
                objProduto.setCategoriaId(rs.getInt("categoria_id"));
                byte[] imageBytes = rs.getBytes("imagem");
                String base64Image = convertToBase64(imageBytes);
                produtos.add(objProduto);
            }
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Leitura de produtos: " + e);
        }
        return produtos;

    }

/////
    public void insertProduto(Produtos objProduto) {
        //victor
        String sql = "INSERT INTO produtos(nome,imagem,valor,categoria_id)values(?,?,?,?)";
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, objProduto.getNome());
            stmt.setBytes(2, objProduto.getImgBlob());
            stmt.setFloat(3, objProduto.getValor());
            stmt.setInt(4, objProduto.getCategoriaId());
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            System.out.println(" cadastro de produto: " + e);
        }
        ////
    }

    public void deletar(Produtos p) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement(
                    "DELETE FROM produtos WHERE id_produto = ?"
            );
            stmt.setInt(1, p.getId_Produto());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
