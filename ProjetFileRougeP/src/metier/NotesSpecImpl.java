package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NotesSpecImpl implements INotesSpec {

	public void addNotesCiv(Notes p) 
	{
		Connection connection = ConnectionDB.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into notes_eleves_civil (prenom, nom, date_de_naissance,semestre,note_general,francais_nm,mathematiques_nm,anglais_nm,sport_nm"
					+ ",reseaux_et_fluide_nm,maitrise_de_lenergie_nm,geotechnique_nm,materiaux_et_technologie_nm)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, p.getPrenom());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getDdn());
			ps.setInt(4, p.getSemestre());
			ps.setDouble(5, p.getNoteg());
			ps.setDouble(6, p.getNmFra());
			ps.setDouble(7, p.getNmMath());
			ps.setDouble(8, p.getNmAng());
			ps.setDouble(9, p.getNmSpo());
			ps.setDouble(10, p.getNm1());
			ps.setDouble(11, p.getNm2());
			ps.setDouble(12, p.getNm3());
			ps.setDouble(13, p.getNm4());
			ps.executeUpdate();
			ps.close();
		   } 
		
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	public void addNotesEnvi(Notes p) 
	{
		Connection connection = ConnectionDB.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into notes_eleves_envi (prenom, nom, date_de_naissance,semestre,note_general,francais_nm,mathematiques_nm,anglais_nm,sport_nm,"
					+ "droit_environnemental_nm,economie_nm,sociologie_de_lenvironnement_nm,recyclage_nm)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, p.getPrenom());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getDdn());
			ps.setInt(4, p.getSemestre());
			ps.setDouble(5, p.getNoteg());
			ps.setDouble(6, p.getNmFra());
			ps.setDouble(7, p.getNmMath());
			ps.setDouble(8, p.getNmAng());
			ps.setDouble(9, p.getNmSpo());
			ps.setDouble(10, p.getNm1());
			ps.setDouble(11, p.getNm2());
			ps.setDouble(12, p.getNm3());
			ps.setDouble(13, p.getNm4());
			ps.executeUpdate();
			ps.close();
		   } 
		
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	public void addNotesInfo(Notes p) 
	{
		Connection connection = ConnectionDB.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into notes_eleves_info (prenom, nom, date_de_naissance,semestre,note_general,francais_nm,mathematiques_nm,anglais_nm,sport_nm,"
					+ "intelligence_artificielle_nm,reseautique_nm,informatique_industrielle,architecture_de_lordinateur_nm)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, p.getPrenom());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getDdn());
			ps.setInt(4, p.getSemestre());
			ps.setDouble(5, p.getNoteg());
			ps.setDouble(6, p.getNmFra());
			ps.setDouble(7, p.getNmMath());
			ps.setDouble(8, p.getNmAng());
			ps.setDouble(9, p.getNmSpo());
			ps.setDouble(10, p.getNm1());
			ps.setDouble(11, p.getNm2());
			ps.setDouble(12, p.getNm3());
			ps.setDouble(13, p.getNm4());
			ps.executeUpdate();
			ps.close();
		   } 
		
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	public void addNotesTransp(Notes p) 
	{
		Connection connection = ConnectionDB.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into notes_eleves_transport (prenom, nom, date_de_naissance,	semestre,note_general,francais_nm,mathematiques_nm,anglais_nm,sport_nm,"
					+ "environnement_de_la_logistique_nm,supply_chain_management_nm,logistique_amont_aval_nm,business_nm)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, p.getPrenom());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getDdn());
			ps.setInt(4, p.getSemestre());
			ps.setDouble(5, p.getNoteg());
			ps.setDouble(6, p.getNmFra());
			ps.setDouble(7, p.getNmMath());
			ps.setDouble(8, p.getNmAng());
			ps.setDouble(9, p.getNmSpo());
			ps.setDouble(10, p.getNm1());
			ps.setDouble(11, p.getNm2());
			ps.setDouble(12, p.getNm3());
			ps.setDouble(13, p.getNm4());
			ps.executeUpdate();
			ps.close();
		   } 
		
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public Notes getNotesCiv(int id) {
		Connection connection = ConnectionDB.getConnection();
		Notes not = null;
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("select * from notes_eleves_civil where id = ?");
			ps.setInt(1, id);
			ResultSet resultat =ps.executeQuery();
			if(resultat.next()) {
				not = new Notes();
				not.setId(resultat.getInt("id"));
				not.setPrenom(resultat.getString("prenom"));
				not.setNom(resultat.getString("nom"));
				not.setDdn(resultat.getString("date_de_naissance"));
				not.setSemestre(resultat.getInt("semestre"));
				not.setNoteg(resultat.getDouble("note_general"));
				not.setNmFra(resultat.getDouble("francais_nm"));
				not.setNmMath(resultat.getDouble("mathematiques_nm"));
				not.setNmAng(resultat.getDouble("anglais_nm"));
				not.setNmSpo(resultat.getDouble("sport_nm"));
				not.setNm1(resultat.getDouble("reseaux_et_fluide_nm"));
				not.setNm2(resultat.getDouble("maitrise_de_lenergie_nm"));
				not.setNm3(resultat.getDouble("geotechnique_nm"));
				not.setNm4(resultat.getDouble("materiaux_et_technologie_nm"));
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return not;
	}
	
	public Notes getNotesEnvi(int id) {
		Connection connection = ConnectionDB.getConnection();
		Notes not = null;
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("select * from notes_eleves_envi where id = ?");
			ps.setInt(1, id);
			ResultSet resultat =ps.executeQuery();
			if(resultat.next()) {
				not = new Notes();
				not.setPrenom(resultat.getString("prenom"));
				not.setNom(resultat.getString("nom"));
				not.setDdn(resultat.getString("date_de_naissance"));
				not.setSemestre(resultat.getInt("semestre"));
				not.setNoteg(resultat.getDouble("note_general"));
				not.setNmFra(resultat.getDouble("francais_nm"));
				not.setNmMath(resultat.getDouble("mathematiques_nm"));
				not.setNmAng(resultat.getDouble("anglais_nm"));
				not.setNmSpo(resultat.getDouble("sport_nm"));
				not.setNm1(resultat.getDouble("droit_environnemental_nm"));
				not.setNm2(resultat.getDouble("economie_nm"));
				not.setNm3(resultat.getDouble("sociologie_de_lenvironnement_nm"));
				not.setNm4(resultat.getDouble("recyclage_nm"));
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return not;
	}
	
	public Notes getNotesInfo(int id) {
		Connection connection = ConnectionDB.getConnection();
		Notes not = null;
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("select * from notes_eleves_info where id = ?");
			ps.setInt(1, id);
			ResultSet resultat =ps.executeQuery();
			if(resultat.next()) {
				not = new Notes();
				not.setPrenom(resultat.getString("prenom"));
				not.setNom(resultat.getString("nom"));
				not.setDdn(resultat.getString("date_de_naissance"));
				not.setSemestre(resultat.getInt("semestre"));
				not.setNoteg(resultat.getDouble("note_general"));
				not.setNmFra(resultat.getDouble("francais_nm"));
				not.setNmMath(resultat.getDouble("mathematiques_nm"));
				not.setNmAng(resultat.getDouble("anglais_nm"));
				not.setNmSpo(resultat.getDouble("sport_nm"));
				not.setNm1(resultat.getDouble("intelligence_artificielle_nm"));
				not.setNm2(resultat.getDouble("reseautique_nm"));
				not.setNm3(resultat.getDouble("informatique_industrielle"));
				not.setNm4(resultat.getDouble("architecture_de_lordinateur_nm"));
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return not;
	}
	
	public Notes getNotesTransp(int id) {
		Connection connection = ConnectionDB.getConnection();
		Notes not = null;
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("select * from notes_eleves_transport where id = ?");
			ps.setInt(1, id);			
			ResultSet resultat =ps.executeQuery();
			if(resultat.next()) {
				not = new Notes();
				not.setPrenom(resultat.getString("prenom"));
				not.setNom(resultat.getString("nom"));
				not.setDdn(resultat.getString("date_de_naissance"));
				not.setSemestre(resultat.getInt("semestre"));
				not.setNoteg(resultat.getDouble("note_general"));
				not.setNmFra(resultat.getDouble("francais_nm"));
				not.setNmMath(resultat.getDouble("mathematiques_nm"));
				not.setNmAng(resultat.getDouble("anglais_nm"));
				not.setNmSpo(resultat.getDouble("sport_nm"));
				not.setNm1(resultat.getDouble("environnement_de_la_logistique_nm"));
				not.setNm2(resultat.getDouble("supply_chain_management_nm"));
				not.setNm3(resultat.getDouble("logistique_amont_aval_nm"));
				not.setNm4(resultat.getDouble("business_nm"));
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return not;
	}
	
	
	public ArrayList<Notes> getAllECiv(String spec, int semestre) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionDB.getConnection();
		Notes not = null;
		ArrayList<Notes> eleveCiv = new ArrayList<Notes>();
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("select * from notes_eleves_civil where semestre=?");
			ps.setInt(1, semestre);
			ResultSet resultat = ps.executeQuery();
			while (resultat.next()) {
				not = new Notes();
				not.setId(resultat.getInt("id"));
				not.setPrenom(resultat.getString("prenom"));
				not.setNom(resultat.getString("nom"));
				eleveCiv.add(not);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eleveCiv;
	
	}
	
	public ArrayList<Notes> getAllEEnvi(String spec, int semestre) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionDB.getConnection();
		Notes not = null;
		ArrayList<Notes> eleveEnvi = new ArrayList<Notes>();
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("select * from notes_eleves_envi where semestre=?");
			ps.setInt(1, semestre);
			ResultSet resultat = ps.executeQuery();
			while (resultat.next()) {
				not = new Notes();
				not.setId(resultat.getInt("id"));
				not.setPrenom(resultat.getString("prenom"));
				not.setNom(resultat.getString("nom"));
				eleveEnvi.add(not);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eleveEnvi;
	
	}
	public ArrayList<Notes> getAllEInfo(String spec, int semestre) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionDB.getConnection();
		Notes not = null;
		ArrayList<Notes> eleveInfo = new ArrayList<Notes>();
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("select * from notes_eleves_info where semestre=?");
			ps.setInt(1, semestre);
			ResultSet resultat = ps.executeQuery();
			while (resultat.next()) {
				not = new Notes();
				not.setId(resultat.getInt("id"));
				not.setPrenom(resultat.getString("prenom"));
				not.setNom(resultat.getString("nom"));
				eleveInfo.add(not);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eleveInfo;
	
	}
	public ArrayList<Notes> getAllETrans(String spec, int semestre) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionDB.getConnection();
		Notes not = null;
		ArrayList<Notes> eleveTrans = new ArrayList<Notes>();
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("select * from notes_eleves_transport where semestre=?");
			ps.setInt(1, semestre);
			ResultSet resultat = ps.executeQuery();
			while (resultat.next()) {
				not = new Notes();
				not.setId(resultat.getInt("id"));
				not.setPrenom(resultat.getString("prenom"));
				not.setNom(resultat.getString("nom"));
				eleveTrans.add(not);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eleveTrans;
	
	}
	
}
