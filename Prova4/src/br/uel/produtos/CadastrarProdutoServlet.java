package br.uel.produtos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class CadastrarProdutoServlet
 */
@WebServlet("/cadastrar")
public class CadastrarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		int preco = Integer.parseInt(request.getParameter("preco"));
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));

			Produto produto = new Produto();
			
			produto.setNome(nome);
			produto.setQuantidade(quantidade);
			produto.setPreco(preco);
			
			ProdutoDAO produtoDAO = 
					new ProdutoDAO();
			
			produtoDAO.inserir(produto);			
			
			RequestDispatcher view = 
					request.getRequestDispatcher("cadastrarResposta.jsp");
			
			view.forward(request, response);
    }
    
}
