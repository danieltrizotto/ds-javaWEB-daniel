/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.UsuariosDAO;
import model.bean.Usuarios;

/**
 *
 * @author User
 */
public class LoginController extends HttpServlet {

    UsuariosDAO dao = new UsuariosDAO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = request.getServletPath();
        if (url.equals("/logar")) {
            System.out.println("passou do url");
            String nextPage = "/WEB-INF/jsp/telaHome.jsp";
            Usuarios user = new Usuarios();
            UsuariosDAO valida = new UsuariosDAO();

            user.setUsuario(request.getParameter("usuario"));
            user.setSenha(request.getParameter("senha"));

            try {
                Usuarios userAutenticado = valida.validaUser(user);
                System.out.println("passou do try");
                System.out.println("user:"+userAutenticado.getUsuario());
                System.out.println("senha:"+userAutenticado.getSenha());
                if (userAutenticado != null && !userAutenticado.getNome().isEmpty()) {
                    System.out.println(" passou do if");
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                    dispatcher.forward(request, response);
                } else {
                    nextPage = "/WEB-INF/jsp/index.jsp";
                    request.setAttribute("errorMessage", "Usuário ou senha inválidos");
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                    dispatcher.forward(request, response);
                    System.out.println("erro login");
                }
            } catch (Exception e) {
                System.out.println("nao passou do if");
                nextPage = "/WEB-INF/jsp/index.jsp";
                request.setAttribute("errorMessage", "poblema com o banco de dados");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);
            }
        } else {
            processRequest(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
