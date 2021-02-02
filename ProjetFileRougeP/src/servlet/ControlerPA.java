package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.INotesSpec;
import metier.MethodeCalcul;
import metier.Notes;
import metier.NotesSpecImpl;

import model.ModelNote;


/**
 * Servlet implementation class ControlerPA
 */
@WebServlet("/ControlerPA")
public class ControlerPA extends HttpServlet {
	private static final long serialVersionUID = 1L;
	INotesSpec methode;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlerPA() {
        super();
        // TODO Auto-generated constructor stub
       
    }
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	 methode = new NotesSpecImpl();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("PaccueilJsp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
		if (request.getParameter("btnspCivil")!=null)
		{	
			Notes no = new Notes(0,null,null,null,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
			ModelNote model = new ModelNote(no);
			request.setAttribute("model", model);
			request.getRequestDispatcher("FormulaireCivil.jsp").forward(request, response);	
		}
		if (request.getParameter("btnspTransport")!=null)
		{
			Notes no = new Notes(0,null,null,null,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
			ModelNote model = new ModelNote(no);
			request.setAttribute("model", model);
			request.getRequestDispatcher("FormulaireTransport.jsp").forward(request, response);
		}
		if (request.getParameter("btnspInfo")!=null) 
		{
			Notes no = new Notes(0,null,null,null,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
			ModelNote model = new ModelNote(no);
			request.setAttribute("model", model);
			request.getRequestDispatcher("FormulaireInformatique.jsp").forward(request, response);
		}
		if (request.getParameter("btnspEnvi")!=null) 
		{
			Notes no = new Notes(0,null,null,null,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
			ModelNote model = new ModelNote(no);
			request.setAttribute("model", model);
			request.getRequestDispatcher("FormulaireEnvironnement.jsp").forward(request, response);
		}
		if (request.getParameter("btnResultat")!=null) 
		{
			
			request.getRequestDispatcher("FormulaireEleves.jsp").forward(request, response);
		}
		
			
			
			
		
	}

}
