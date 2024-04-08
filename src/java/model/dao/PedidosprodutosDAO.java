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
import model.bean.Pedidos_produtos;

/**
 *
 * @author Senai
 */
public class PedidosprodutosDAO {

    public List<Pedidos_produtos> read() {
        List<Pedidos_produtos> dao = new ArrayList();

        try {

            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM  pedidos_produtos");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Pedidos_produtos p = new Pedidos_produtos();
                p.setId_pedido_produto(rs.getInt("id_pedido_produto"));
                p.setPedido_id(rs.getInt("pedido_id"));
                p.setProduto_id(rs.getInt("produto_id"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setPreco_unitario(rs.getFloat("preço_unitario"));

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
    
    public void criar(Pedidos_produtos p) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("insert into pedido(pedido_id,produto_id,quantidade,preco_unitario) values (?,?,?,?)");
            
           stmt.setInt(1, p.getPedido_id());
           stmt.setInt(2, p.getProduto_id());
           stmt.setInt(3, p.getQuantidade());
           stmt.setFloat(4, p.getPreco_unitario());
    
            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
}
