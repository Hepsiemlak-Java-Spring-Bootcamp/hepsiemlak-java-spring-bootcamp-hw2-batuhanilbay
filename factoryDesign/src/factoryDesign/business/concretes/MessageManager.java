package factoryDesign.business.concretes;

import factoryDesign.business.abstracts.MessageService;

public class MessageManager implements MessageService{

	
	//SMS g�nderimi i�in buras� �al��t�r�lacakt�r.
	@Override
	public void sendMessage() {
		System.out.println("SMS g�nderildi.");
		
	}

}
