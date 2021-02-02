package fr.formation.afpa.exo.fluxfichier;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class Filter implements FilenameFilter {

	private String extention;
	private String[] list;
	private File file;

	public String getExtention() {
		return extention;
	}

	public void setExtention(String extention) {
		this.extention = extention;
	}

	public String[] getList() {
		return list;
	}

	public void setList(String[] list) {
		this.list = list;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Filter(String extention, String tab[], File file) {
		this.extention = extention;
		this.list = tab;
		this.file = file;
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.toLowerCase().endsWith(extention);
	}

}
