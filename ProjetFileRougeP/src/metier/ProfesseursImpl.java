package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfesseursImpl implements  IProf {

	@Override
	public void addProfesseur(Professeur p) {
		// TODO Auto-generated method stub

		Connection connection = ConnectionDB.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into professeurs (login,mot_de_passe, prenom,nom,date_de_naissance,email)"
					+ "values (?,?,?,?,?,?)");
			ps.setString(1, p.getLogin());
			ps.setString(2, p.getMot_de_passe());
			ps.setString(3, p.getPrenom());
			ps.setString(4, p.getNom());
			ps.setString(5, p.getDate_de_naissance());
			ps.setString(6, p.getEmail());
			
			ps.executeUpdate();
			ps.close();
		
		  } 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public Professeur getNotesCiv(String login, String mdp) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
}
