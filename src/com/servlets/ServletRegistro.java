package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRegistro
 */
@WebServlet("/ServletRegistro")
public class ServletRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistro() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter salida=response.getWriter();
		
		salida.println("<html><body>");
		salida.println("nombre: "+request.getParameter("nombre")+"<br>");
		salida.println("apellido: "+request.getParameter("apellido"));
		salida.print("<br>se ha ejecutado el metodo doGet de ServletRegistro");
		salida.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter salida=response.getWriter();
		salida.println("<html><body>");
		salida.println("nombre: "+request.getParameter("nombre")+"<br>");
		salida.println("apellido: "+request.getParameter("apellido"));
		salida.print("<br>se ha ejecutado el metodo doPost de ServletRegistro");
		salida.println("</body></html>");
	}

}
