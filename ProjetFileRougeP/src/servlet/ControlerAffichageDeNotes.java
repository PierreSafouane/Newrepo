package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.INotesSpec;
import metier.Notes;
import metier.NotesSpecImpl;
import model.ModelListeEleves;
import model.ModelNote;



/**
 * Servlet implementation class ControlerAffichageDeNotes
 */
@WebServlet("/ControlerAffichageDeNotes")
public class ControlerAffichageDeNotes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private INotesSpec methode;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlerAffichageDeNotes() {
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
		ModelListeEleves mole = new ModelListeEleves(null);
		request.getRequestDispatcher("SelectEleves.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String spec =  request.getParameter("spec");
	

		
		
		
		if(request.getParameter("recherche")!=null) {
			
			
			if( spec.equals("notes_eleves_civil")) {
			ModelListeEleves mole = new ModelListeEleves(methode.getAllECiv(request.getParameter("spec"),Integer.parseInt(request.getParameter("semestre"))),spec);
			request.setAttribute("mole", mole);
			request.getRequestDispatcher("SelectEleves.jsp").forward(request, response);
			}
			
			else if( spec.equals("notes_eleves_envi")) {
				ModelListeEleves mole = new ModelListeEleves(methode.getAllEEnvi(request.getParameter("spec"),Integer.parseInt(request.getParameter("semestre"))),spec);
				request.setAttribute("mole", mole);
				request.getRequestDispatcher("SelectEleves.jsp").forward(request, response);
				}
			  
			  
			  
			else if ( spec.equals("notes_eleves_info")) { 
				 
				  ModelListeEleves mole =new ModelListeEleves(methode.getAllEInfo(request.getParameter("spec"),Integer.parseInt(request.getParameter("semestre"))),spec);
				  request.setAttribute("mole",mole);
				  request.getRequestDispatcher("SelectEleves.jsp").forward(request,response);
			  
			  }
			  
			  
			  
			else if ( spec.equals("notes_eleves_transport")) { 
				
			ModelListeEleves mole = new ModelListeEleves(methode.getAllETrans(request.getParameter("spec"),Integer.parseInt(request.getParameter("semestre"))),spec);
		
			  request.setAttribute("mole", mole);
			  request.getRequestDispatcher("SelectEleves.jsp").forward(request,response);
			  
			  }
			 
		}

			if(request.getParameter("send")!=null) { 
				
			String specialite = request.getParameter("spec");
			System.out.println(specialite);
			int idetu =  Integer.parseInt(request.getParameter("choixeleve"));
			
			
			if (specialite.equals("notes_eleves_civil")) {
				ModelNote mn = new ModelNote(methode.getNotesCiv(idetu)); request.setAttribute("mole", mn);
				request.getRequestDispatcher("BulletinEleve.jsp").forward(request,
				response);
				}
			
			
			if( spec.equals("notes_eleves_envi")) {
				ModelNote mn = new ModelNote(methode.getNotesEnvi(idetu)); request.setAttribute("mole", mn);
				request.getRequestDispatcher("BulletinEleve.jsp").forward(request,
				response);
				
				
			}
			if ( spec.equals("notes_eleves_info")) {
				ModelNote mn = new ModelNote(methode.getNotesInfo(idetu)); request.setAttribute("mole", mn);
				request.getRequestDispatcher("BulletinEleve.jsp").forward(request,
				response);
			}
			
			
			if ( spec.equals("notes_eleves_transport")) {
				ModelNote mn = new ModelNote(methode.getNotesTransp(idetu)); request.setAttribute("mole", mn);
				request.getRequestDispatcher("BulletinEleve.jsp").forward(request,
				response);
			}
			}
		
		
		
		
		
		
		
		
		
		
	}


}
