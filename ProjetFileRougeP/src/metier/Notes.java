package metier;

public class Notes {
private String prenom;
private String nom;
private String ddn;
private int semestre;
private double noteg;
private double nmFra;
private double nmMath;
private double nmAng;
private double nmSpo;
private double nm1;
private double nm2;
private double nm3;
private double nm4;
private	int 	id; 
	public Notes() {
	super();	
	
	}
		public Notes (int id,String prenom, String nom, String ddn,int semestre,double noteg,double nmFra, double nmMath, double nmAng, double nmSpo, double nm1, double nm2, double nm3,double nm4)
{
			this.id=id;
			this.prenom=prenom;
			this.nom=nom;
			this.ddn=ddn;
			this.semestre=semestre;
			this.noteg=noteg;
			this.nmFra=nmFra;
			this.nmMath=nmMath;
			this.nmAng=nmAng;
			this.nmSpo=nmSpo;
			this.nm1=nm1;
			this.nm2=nm2;
			this.nm3=nm3;
			this.nm4=nm4;
}
		public Notes (int id,String prenom, String nom) {
			
			this.id=id;
			this.prenom=prenom;
			this.nom=nom;
			
			
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getDdn() {
			return ddn;
		}

		public void setDdn(String ddn) {
			this.ddn = ddn;
		}

		public int getSemestre() {
			return semestre;
		}

		public void setSemestre(int semestre) {
			this.semestre = semestre;
		}

		public double getNoteg() {
			return noteg;
		}

		public void setNoteg(double noteg) {
			this.noteg = noteg;
		}

		public double getNmFra() {
			return nmFra;
		}

		public void setNmFra(double nmFra) {
			this.nmFra = nmFra;
		}

		public double getNmMath() {
			return nmMath;
		}

		public void setNmMath(double nmMath) {
			this.nmMath = nmMath;
		}

		public double getNmAng() {
			return nmAng;
		}

		public void setNmAng(double nmAng) {
			this.nmAng = nmAng;
		}

		public double getNmSpo() {
			return nmSpo;
		}

		public void setNmSpo(double nmSpo) {
			this.nmSpo = nmSpo;
		}

		public double getNm1() {
			return nm1;
		}

		public void setNm1(double nm1) {
			this.nm1 = nm1;
		}

		public double getNm2() {
			return nm2;
		}

		public void setNm2(double nm2) {
			this.nm2 = nm2;
		}

		public double getNm3() {
			return nm3;
		}

		public void setNm3(double nm3) {
			this.nm3 = nm3;
		}

		public double getNm4() {
			return nm4;
		}

		public void setNm4(double nm4) {
			this.nm4 = nm4;
		}

	
		
		
		
}
