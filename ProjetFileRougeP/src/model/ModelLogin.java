package model;

import metier.Login;

public class ModelLogin {
	private Login  login;

	public ModelLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModelLogin(Login login) {
		super();
		this.login = login;
	}

	public Login getMetierLogin() {
		return login;
	}

	public void getMetierLogin(Login login) {
		this.login = login;
	}
	
}