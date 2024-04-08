/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Pedido;


/**
 *
 * @author Senai
 */
public class PedidoDAO {
    
    public List<Pedido> read() {
        List<Pedido> dao = new ArrayList();
        
        try {
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM  pedido");
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Pedido p = new Pedido();
                p.setId_pedido(rs.getInt("id_pedido"));
                p.setUsuario_id2(rs.getInt("usuario_id2"));
                p.setEndereço_id(rs.getInt("endereço_id2"));
                p.setStatus_pagamento(rs.getString("status_pagamento"));
                p.setMetodo_pagamento(rs.getString("metodo_pagamento"));
                p.setValor_total(rs.getFloat("valor_total"));
                p.setData_hora(rs.getDate("data_hora"));
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
    
    public void criar(Pedido p) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("insert into pedido(usuario_id2,endereço_id2,status_pagamento,metodo_pagamento,valor_total,data_hora) values (?,?,?,?,?,?)");
            
           stmt.setInt(1, p.getUsuario_id2());
           stmt.setInt(2, p.getEndereço_id());
           stmt.setString(3, p.getStatus_pagamento());
           stmt.setString(4, p.getMetodo_pagamento());
           stmt.setFloat(5, p.getValor_total());
           stmt.setDate(6, p.getData_hora());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
