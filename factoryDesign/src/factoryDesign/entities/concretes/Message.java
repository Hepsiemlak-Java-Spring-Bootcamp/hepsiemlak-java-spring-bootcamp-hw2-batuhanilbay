package factoryDesign.entities.concretes;

import factoryDesign.entities.abstracts.Entity;

public class Message implements Entity{

	
	public Message() {
		
	}
	
	//Mesaj nesnesi olu�turulur ise buras� �al��acakt�r.
	@Override
	public void success() {
		System.out.println("Mesaj ba�ar� ile olu�turuldu");
		
	}

	
}
