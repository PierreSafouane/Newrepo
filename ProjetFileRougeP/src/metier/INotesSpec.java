package metier;

import java.util.ArrayList;

public interface INotesSpec {

	

	public void addNotesCiv (Notes p) ;

	public void addNotesEnvi (Notes p);
	
	public void addNotesInfo (Notes p);
	
	public void addNotesTransp (Notes p);
	
	public Notes getNotesCiv (int id);
	
	public Notes getNotesEnvi (int id);
	
	public Notes getNotesInfo (int id);
	
	public Notes getNotesTransp (int id);
	
	

	public ArrayList<Notes> getAllECiv(String spec, int semestre);

	public ArrayList<Notes> getAllEEnvi(String spec, int semestre);

		
	public ArrayList<Notes> getAllEInfo(String spec, int semestre);

	public ArrayList<Notes> getAllETrans(String spec, int semestre);

	
}
