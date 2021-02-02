package metier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;



public   class OperationLoginImpl implements  IoperationLogin{

@Override
public boolean getMetierLogin(Login login) 
{
	boolean status = false;
	
	Connection connection = ConnectionDB.getConnection();
	
	PreparedStatement ps;
	try {
		ps = connection.prepareStatement("select * from professeurs where login=? and mot_de_passe=?");
		ps.setString(1, login.getLogin());
		ps.setString(2, login.getMot_de_passe());
		
		ResultSet resultat =ps.executeQuery();
		status = resultat.next();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return status;
	
}

}


	

