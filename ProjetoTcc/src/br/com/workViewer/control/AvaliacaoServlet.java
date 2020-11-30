package br.com.workViewer.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.workViewer.model.dao.AvaliacaoDao;
import br.com.workViewer.model.domain.Avaliacao;

/**
 * Servlet implementation class AvaliacaoServlet
 */
@WebServlet("/AvaliacaoServlet")
public class AvaliacaoServlet extends HttpServlet {
	private AvaliacaoDao avaliacaoDao = new AvaliacaoDao();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvaliacaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setAttribute("avaliacao",avaliacaoDao.getAvaliacao());
			
		} catch (Exception e) {
			request.setAttribute("mensagem","Erro e Banco de Dados: "+e.getMessage());
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/verAvaliacao.jsp");
		dispatcher.forward(request,response);
		
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeAvaliador  = request.getParameter("nomeAvaliador");
		String nomeAvaliado  = request.getParameter("nomeAvaliado");
		String setor  = request.getParameter("setor");
		String feedBack  = request.getParameter("feedBack");
		String pontuacao  = request.getParameter("pontuacao");
		Avaliacao avaliacao = new Avaliacao (0, nomeAvaliador,  nomeAvaliado,  setor, feedBack, pontuacao);
		try {
		avaliacaoDao.salvar(avaliacao);
			request.setAttribute("mensagem","Sua avaliação foi cadastrado com sucesso ");
			request.setAttribute("avaliacao", avaliacaoDao.getAvaliacao());
		} catch (Exception e) {
			request.setAttribute("mensagem","Erro  Banco de Dados: "+e.getMessage());
		}
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("PaginaInicial.html");
		dispatcher.forward(request,response);
	}

		

	}

