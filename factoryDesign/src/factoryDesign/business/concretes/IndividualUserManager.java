package factoryDesign.business.concretes;

import factoryDesign.business.abstracts.UserService;

public class IndividualUserManager implements UserService{

	
	//Bireysel müþteriler için 
	@Override
	public void getUser() {
		System.out.println("Bireysel müþteri baþarý çaðrýldý.");
		
	}

}
