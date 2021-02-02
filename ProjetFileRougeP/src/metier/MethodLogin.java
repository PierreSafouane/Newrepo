package metier;

import java.security.MessageDigest;

public class MethodLogin {

	
	
	
	
		public Boolean CompareMdp(String mdpN1, String mdpN2) 
		{
			if (mdpN1.equals(mdpN2))
			{
				
				return true;
				
			}
			else 
			{
				return false;
			}
		
			
		}
	
	
	
		public String hashing(String password)throws Exception
		{
			
			
		    MessageDigest md = MessageDigest.getInstance("SHA-256");
		    md.update(password.getBytes());
		    byte byteData[] = md.digest();
		
		    StringBuffer sb = new StringBuffer();
		    for (int i = 0; i < byteData.length; i++) {
		     sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		    }
		     return sb.toString();
		}
		
}
