package metier;

public class MethodeCalcul {
	
	
	public double MoyenneMat (double notex, double conc) {
		return (notex+conc)/2;
	}
	public double MoyenneGene (double moyf, double coeff, double moym, double coefm, double moya, double coefa, double moys, double coefs, double moy1, double coef1, double moy2, double coef2, double moy3, double coef3, double moy4, double coef4) {
		return ((moyf*coeff)+(moym*coefm)+(moya*coefa)+(moys*coefs)+(moy1*coef1)+(moy2*coef2)+(moy3*coef3)+(moy4*coef4))/(coeff+coefm+coefa+coefs+coef1+coef2+coef3+coef4);
	}
}
