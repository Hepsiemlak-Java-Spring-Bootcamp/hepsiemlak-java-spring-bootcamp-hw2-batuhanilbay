package factoryDesign.entities.concretes;

import factoryDesign.entities.abstracts.Entity;

public class Advert implements Entity {

	
	public Advert() {
		
	}
	
	//�lan nesnesi olu�turulur ise buras� �al��acakt�r.
	@Override
	public void success() {
		System.out.println("�lan ba�ar� ile olu�turuldu.");
		
	}

	

}
