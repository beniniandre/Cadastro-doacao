package br.com.Control;

import br.com.Model.Anuncio;
import br.com.Model.DAO;
import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InserirAnuncios extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");

        try {
            HttpSession sessao = request.getSession(true);
            System.out.println("\n SESSÃO: " + sessao);

            if (sessao.isNew()) {
                String incomingURL = request.getRequestURL().toString();
                String URLwithID = response.encodeURL(incomingURL);
                response.setHeader("Custom-newURL", URLwithID);
            }

            String NomeFantasia = request.getParameter("NomeFantasia");
            String RazaoSocial = request.getParameter("RazaoSocial");
            String CNPJ = request.getParameter("CNPJ");
            String Telefone = request.getParameter("Telefone");
            String Email = request.getParameter("Email");
            String Endereco = request.getParameter("Endereco");
            String Descricao = request.getParameter("Descricao");

            //para inserior os dados no formulário no banco
            Anuncio anuncio = new Anuncio(NomeFantasia, RazaoSocial, CNPJ, Telefone, Email, Endereco, Descricao);
            DAO dao = new DAO();
            dao.inserirAnuncios(anuncio);
            String url = "/OK.jsp";
            ServletContext se = getServletContext();
            RequestDispatcher rd = se.getRequestDispatcher(url);
            rd.forward(request, response);
            NomeFantasia = "";
            RazaoSocial = "";
            Telefone = "";
            Email = "";
            Endereco = "";
            Descricao = "";

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            String url = "/Erro.jsp";
            ServletContext se = getServletContext();
            RequestDispatcher rd = se.getRequestDispatcher(url);
            rd.forward(request, response);
        } finally {
            out.close();
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
