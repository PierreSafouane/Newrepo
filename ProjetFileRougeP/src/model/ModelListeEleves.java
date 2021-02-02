package model;

import java.util.ArrayList;

import metier.Notes;

public class ModelListeEleves {
		private String spec;

		public ArrayList<Notes> listeEleves;

		

		public ModelListeEleves(ArrayList<Notes> listeEleves) {
			super();
			this.listeEleves = listeEleves;
		}
		public ModelListeEleves(ArrayList<Notes> listeEleves,String spec) {
			super();
			this.listeEleves = listeEleves;
			this.spec = spec;
		}
		public ArrayList<Notes> getListeEleves() {
			return listeEleves;
		}

		public void getListeEleves( ArrayList<Notes> listeEleves) {
			this.listeEleves = listeEleves;
		}
		public String getSpec() {
			return spec;
		}
		public void setSpec(String spec) {
			this.spec = spec;
		}
		public void setListeEleves(ArrayList<Notes> listeEleves) {
			this.listeEleves = listeEleves;
		}
		
	}
	
	
	
	
	
	
	

