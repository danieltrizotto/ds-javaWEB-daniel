<%@page import="model.bean.Usuarios"%>
<%@page import="model.dao.UsuariosDAO"%>

<%
String usuario = request.getParameter("usuario");
String senha = request.getParameter("senha");
UsuariosDAO dao = new UsuariosDAO();
 Usuarios bean = new Usuarios();


        
if(dao.lerLogin(usuario, senha)){
    

    session.setAttribute("usuario", usuarioEncontrado); 
    response.sendRedirect("jsp/telaCadastro.jsp");

}
%>
