package factoryDesign.business.concretes;

import factoryDesign.business.abstracts.UserService;

public class CorporateUserManager implements UserService {

	
	//Kurumsal m��teriler i�in
	@Override
	public void getUser() {
		System.out.println("Kurumsal m��teri ba�ar� ile �a�r�ld�.");
	}

}
