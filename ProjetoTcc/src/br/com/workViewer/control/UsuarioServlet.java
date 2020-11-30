package br.com.workViewer.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.workViewer.model.dao.UsuarioDao;
import br.com.workViewer.model.domain.Usuario;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private UsuarioDao usuarioDao = new UsuarioDao();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setAttribute("usuario",usuarioDao.getUsuario());
			
		} catch (Exception e) {
			request.setAttribute("mensagem","Erro e Banco de Dados: "+e.getMessage());
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/usuario.jsp");
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome  = request.getParameter("nome");
		String cpf  = request.getParameter("cpf");
		String telefone  = request.getParameter("telefone");
		String dataNascimento  = request.getParameter("dataNascimento");
		String email  = request.getParameter("email");
		String senha  = request.getParameter("senha");
		Usuario usuario = new Usuario (0, nome,  cpf,  telefone, dataNascimento, email, senha);
		try {
		   usuarioDao.salvar(usuario);
			request.setAttribute("mensagem","Usuario cadastrado com sucesso ");
			request.setAttribute("usuario", usuarioDao.getUsuario());
		} catch (Exception e) {
			request.setAttribute("mensagem","Erro  Banco de Dados: "+e.getMessage());
		}
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/usuario.jsp");
		dispatcher.forward(request,response);
		
	}
	

}
