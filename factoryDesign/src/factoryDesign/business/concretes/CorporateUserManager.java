package factoryDesign.business.concretes;

import factoryDesign.business.abstracts.UserService;

public class CorporateUserManager implements UserService {

	
	//Kurumsal müþteriler için
	@Override
	public void getUser() {
		System.out.println("Kurumsal müþteri baþarý ile çaðrýldý.");
	}

}
