package factoryDesign.entities.concretes;

import factoryDesign.entities.abstracts.Entity;

public class Advert implements Entity {

	
	public Advert() {
		
	}
	
	//Ýlan nesnesi oluþturulur ise burasý çalýþacaktýr.
	@Override
	public void success() {
		System.out.println("Ýlan baþarý ile oluþturuldu.");
		
	}

	

}
