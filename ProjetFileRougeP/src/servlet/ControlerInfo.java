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
@WebServlet("/ControlerInfo")
public class ControlerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private INotesSpec methode;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlerInfo() {
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
		Notes no = new Notes(0,null,null,null,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
		ModelNote model = new ModelNote(no);
		request.setAttribute("model", model);
		request.getRequestDispatcher("FormulaireInformatique.jsp").forward(request, response);
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
			Notes no = new Notes(0,null,null,null,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
			ModelNote model = new ModelNote(no);
			request.setAttribute("model", model);
			request.getRequestDispatcher("FormulaireEleves.jsp").forward(request, response);
		}
		if (request.getParameter("btnResultat")!=null) 
		{
			Notes no = new Notes(0,null,null,null,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
			ModelNote model = new ModelNote(no);
			request.setAttribute("model", model);
			request.getRequestDispatcher("FormulaireEleves.jsp").forward(request, response);
		}
		if (request.getParameter("btnResultat")!=null) 
		{
			
			request.getRequestDispatcher("FormulaireEleves.jsp").forward(request, response);
		}
		
		
		else {
			if(request.getParameter("coeff")!="") {
			MethodeCalcul calcule = new MethodeCalcul();
			double moymatf = calcule.MoyenneMat(Double.parseDouble(request.getParameter("notexf")), Double.parseDouble(request.getParameter("concf")));
			double moymatm = calcule.MoyenneMat(Double.parseDouble(request.getParameter("notexm")), Double.parseDouble(request.getParameter("concm")));
			double moymata = calcule.MoyenneMat(Double.parseDouble(request.getParameter("notexa")), Double.parseDouble(request.getParameter("conca")));
			double moymats = calcule.MoyenneMat(Double.parseDouble(request.getParameter("notexs")), Double.parseDouble(request.getParameter("concs")));
			double moymat1 = calcule.MoyenneMat(Double.parseDouble(request.getParameter("notexmat1")), Double.parseDouble(request.getParameter("concmat1")));
			double moymat2 = calcule.MoyenneMat(Double.parseDouble(request.getParameter("notexmat2")), Double.parseDouble(request.getParameter("concmat2")));
			double moymat3 = calcule.MoyenneMat(Double.parseDouble(request.getParameter("notexmat3")), Double.parseDouble(request.getParameter("concmat3")));
			double moymat4 = calcule.MoyenneMat(Double.parseDouble(request.getParameter("notexmat4")), Double.parseDouble(request.getParameter("concmat4")));
			
			
			double moygen = calcule.MoyenneGene (moymatf, Double.parseDouble(request.getParameter("coeff")), moymatm, Double.parseDouble(request.getParameter("coefm")), 
				moymata, Double.parseDouble(request.getParameter("coefa")), moymats, Double.parseDouble(request.getParameter("coefs")), moymat1, Double.parseDouble(request.getParameter("coefmat1")),
				moymat2, Double.parseDouble(request.getParameter("coefmat2")), moymat3, Double.parseDouble(request.getParameter("coefmat3")), moymat4, Double.parseDouble(request.getParameter("coefmat4")));
			
			
			Notes ecrireNotes = new Notes(0,request.getParameter("prenom"), request.getParameter("nom"), request.getParameter("ddn"),Integer.parseInt( request.getParameter("semestre"))
					, moygen, moymatf, moymatm, moymata, moymats, moymat1, moymat2, moymat3, moymat4);
			methode.addNotesInfo(ecrireNotes);
			
					Notes no = new Notes(0,null,null,null,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
					ModelNote model = new ModelNote(no);

					request.setAttribute("model", model);
					request.getRequestDispatcher("FormulaireInformatique.jsp").forward(request, response);
			}
			else {
				Notes notes = methode.getNotesInfo(Integer.parseInt(request.getParameter("semr")));
				if(notes==null) {
					Notes no = new Notes(0,null,null,null,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
					ModelNote model = new ModelNote(no);

					request.setAttribute("model", model);
					request.getRequestDispatcher("FormulaireInformatique.jsp").forward(request, response);
				}
					
				else {	
				ModelNote modelnote = new ModelNote(notes);
				request.setAttribute("model", modelnote);
				request.getRequestDispatcher("FormulaireInformatique.jsp").forward(request, response);
				}
			}
		}
	}

}
