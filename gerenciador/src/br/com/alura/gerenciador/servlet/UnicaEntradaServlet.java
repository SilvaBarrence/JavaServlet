package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");

		if (paramAcao.equals("listaEmpresas")) {

			ListaEmpresas listaAcao = new ListaEmpresas();
			listaAcao.executa(request, response);

		} else if (paramAcao.equals("RemoveEmpresa")) {

			RemoveEmpresa removeAcao = new RemoveEmpresa();
			removeAcao.executa(request, response);

		} else if (paramAcao.equals("MostraEmpresa")) {

			MostraEmpresa mostraAcao = new MostraEmpresa();
			mostraAcao.executa(request, response);

		} else if (paramAcao.equals("AlteraEmpresa")) {

			AlteraEmpresa alteraAcao = new AlteraEmpresa();
			alteraAcao.executa(request, response);
			
		} else if (paramAcao.equals("NovaEmpresa")) {

			NovaEmpresa novaAcao = new NovaEmpresa();
			novaAcao.executa(request, response);
		}
	}

}