package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.IProf;
import metier.IoperationLogin;
import metier.Login;
import metier.MethodLogin;
import metier.OperationLoginImpl;
import metier.Professeur;
import metier.ProfesseursImpl;

import model.ModelProf;



/**
 * Servlet implementation class ControlLogin
 */
@WebServlet("/ControlLogin")
public class ControlLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IoperationLogin login;
	 private IProf creationProf;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	login = new OperationLoginImpl();
    	creationProf = new ProfesseursImpl();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("flogin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MethodLogin mtdLog = new MethodLogin();
		String username = request.getParameter("Identifiant");
		String passw = request.getParameter("mdp");
		
		
		
	String passwN= null;
	
	try {
		passwN = mtdLog.hashing(passw);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Login lo =new Login(username,passwN);
		
	if(request.getParameter("entree") != null) {
		
			if(login.getMetierLogin(lo)) 
			{
				
				request.getRequestDispatcher("PaccueilJsp.jsp").forward(request, response);
				
			}
			
			else
			{
				request.getRequestDispatcher("flogin.jsp").forward(request, response);
			}
		}
		if(request.getParameter("inscription") != null) {
			
			request.getRequestDispatcher("CreationProf.jsp").forward(request, response);
			
		
		}
		else {
			
			
			
			if ( mtdLog.CompareMdp(request.getParameter("mdpN1"),request.getParameter("mdpN2"))==true) {
				
				String hashMDP =  request.getParameter("mdpN1");
				
				String password = null;
				try {
					password = mtdLog.hashing(hashMDP);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Professeur prof = new Professeur(request.getParameter("nvIdentifiant"), password,request.getParameter("nvPrenom"),
				request.getParameter("nvNom"),request.getParameter("nvDdn"),request.getParameter("nvIdentifiant"));
				
				creationProf.addProfesseur(prof);
				Professeur pr = new Professeur(null,null,null,null,null,null);
				ModelProf model = new ModelProf(pr);
				request.setAttribute("model", model);
				request.getRequestDispatcher("CreationProf.jsp").forward(request, response);
				
			
			}
			else 
			{
				request.getRequestDispatcher("CreationProf.jsp").forward(request, response);
			}
		
			
			
		}
	}

}
