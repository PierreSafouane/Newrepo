package model;

import metier.Notes;

public class ModelNote {
	private String spec;
	private Notes notes;
	
	public ModelNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModelNote(Notes notes) {
		super();
		this.notes = notes;
	}
	public ModelNote(Notes notes,String spec) {
		super();
		this.notes = notes;
		this.spec = spec;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		this.notes = notes;
	}
	
	
	
}
