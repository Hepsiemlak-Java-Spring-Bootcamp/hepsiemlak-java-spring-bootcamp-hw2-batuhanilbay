package factoryDesign.entities.concretes;

import factoryDesign.entities.abstracts.Entity;

public class User implements Entity{

	
	public User() {
		
	}
	
	//Kullanýcý nesnesi oluþturulur ise burasý çalýþacaktýr.
	@Override
	public void success() {
		System.out.println("Kullanýcý baþarý ile oluþturuldu.");
		
	}

}
