package factoryDesign.business.concretes;

import factoryDesign.business.abstracts.MessageService;

public class MailManager implements MessageService {

	
	//Mail g�nderimi i�in buras� �al��acakt�r.
	@Override
	public void sendMessage() {
		System.out.println("Mail g�nderildi.");
		
	}

	
}
