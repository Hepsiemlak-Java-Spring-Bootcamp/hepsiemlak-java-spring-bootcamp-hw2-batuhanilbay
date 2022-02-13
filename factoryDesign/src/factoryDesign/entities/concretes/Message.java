package factoryDesign.entities.concretes;

import factoryDesign.entities.abstracts.Entity;

public class Message implements Entity{

	
	public Message() {
		
	}
	
	//Mesaj nesnesi oluþturulur ise burasý çalýþacaktýr.
	@Override
	public void success() {
		System.out.println("Mesaj baþarý ile oluþturuldu");
		
	}

	
}
