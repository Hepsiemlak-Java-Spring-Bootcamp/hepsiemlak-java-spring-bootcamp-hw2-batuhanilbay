package factoryDesign.entities.concretes;

import factoryDesign.entities.abstracts.Entity;

public class User implements Entity{

	
	public User() {
		
	}
	
	//Kullan�c� nesnesi olu�turulur ise buras� �al��acakt�r.
	@Override
	public void success() {
		System.out.println("Kullan�c� ba�ar� ile olu�turuldu.");
		
	}

}
