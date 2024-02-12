package Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import entity.user;
import service.TraitementUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistreServ
 */
@WebServlet("/RegistreServ")
public class RegistreServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistreServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //response.getWriter().append("Served at:").append(request.getContextPath());
		
	
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String prenom =request.getParameter("prenom");
		String nom =request.getParameter("nom");
		String mail =request.getParameter("mail");
		String password =request.getParameter("password");
		user u=new user(prenom,nom,mail,password);
		TraitementUser TU = new TraitementUser();
		
	}

}
