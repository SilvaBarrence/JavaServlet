package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

//@WebServlet(urlPatterns = "/hello")
public class OlaMundoServlet extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException{
		
		PrintWriter out =  res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("Ola mundo, parabens vc escreveu o primeiro servlets");	
		out.print("</body>");
		out.print("</html>");
		
	}
	
}
