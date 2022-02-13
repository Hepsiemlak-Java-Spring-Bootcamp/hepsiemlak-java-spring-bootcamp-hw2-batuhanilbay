package factoryDesign.business.concretes;

import factoryDesign.business.abstracts.MessageService;

public class MailManager implements MessageService {

	
	//Mail gönderimi için burasý çalýþacaktýr.
	@Override
	public void sendMessage() {
		System.out.println("Mail gönderildi.");
		
	}

	
}
