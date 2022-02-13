package factoryDesign.business.concretes;

import factoryDesign.business.abstracts.MessageService;

public class MessageManager implements MessageService{

	
	//SMS gönderimi için burasý çalýþtýrýlacaktýr.
	@Override
	public void sendMessage() {
		System.out.println("SMS gönderildi.");
		
	}

}
