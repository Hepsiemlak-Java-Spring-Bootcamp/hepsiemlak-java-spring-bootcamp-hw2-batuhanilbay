package factoryDesign.business.concretes;

import factoryDesign.business.abstracts.UserService;

public class IndividualUserManager implements UserService{

	
	//Bireysel m��teriler i�in 
	@Override
	public void getUser() {
		System.out.println("Bireysel m��teri ba�ar� �a�r�ld�.");
		
	}

}
