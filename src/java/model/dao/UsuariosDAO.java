
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
                u.setData_nascimento(rs.getDate("data_nascimento"));
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

    public boolean lerLogin(String usuario, String senha) {
        boolean check = false;
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("select * from usuarios where usuario = ? and senha = ? ;");

            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
              
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return check;
    }

    public void criar(Usuarios u) {
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("insert into usuarios(nome,senha,usuario,telefone,data_nascimento,cpf) values (?,?,?,?,?,?)");
            
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getUsuario());
            stmt.setString(4, u.getTelefone());
            stmt.setDate(5, (Date) u.getData_nascimento());
            stmt.executeUpdate();
            
           

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        

    }

}
