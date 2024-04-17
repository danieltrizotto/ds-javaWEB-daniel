
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import model.bean.Usuarios;



public class UsuariosDAO {
    

    public List<Usuarios> read() {
        List<Usuarios> dao = new ArrayList();

        try {

            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM  usuarios");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuarios u = new Usuarios();
                u.setId_usuario(rs.getInt("id_usuarios"));
                u.setNome(rs.getString("nome"));
                u.setUsuario(rs.getString("usuario"));
                u.setSenha(rs.getString("senha"));
                u.setTelefone(rs.getString("telefone"));
                u.setData_nascimento(rs.getString("data_nascimento"));
                u.setCpf(rs.getString("cpf"));
                dao.add(u);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao;
    }

    public Usuarios validaUser(Usuarios user) {
        Usuarios usuarioValido = new Usuarios();
        try {
            Connection con = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = con.prepareStatement("select * from usuarios where usuario = ? and senha = ?");
            stmt.setString(1, user.getUsuario());
            stmt.setString(2, user.getSenha());
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                usuarioValido.setId_usuario(rs.getInt("id_usuario"));
                usuarioValido.setNome(rs.getString("nome"));
                usuarioValido.setUsuario(rs.getString("usuario"));
            }
            
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            usuarioValido.setId_usuario(0);
            usuarioValido.setNome("");
            usuarioValido.setUsuario("");
        }
        return usuarioValido;
    }
    
     public void inserirUsuario (Usuarios user) {
        try {
            Connection con = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = con.prepareStatement("INSERT INTO usuarios "
                    + "(nome, senha, usuario, telefone, data_nascimento, cpf)"
                    + "VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getSenha());
            stmt.setString(3, user.getUsuario());
            stmt.setString(4, user.getTelefone());
            stmt.setString(5, user.getData_nascimento());
            stmt.setString(6, user.getCpf());
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
