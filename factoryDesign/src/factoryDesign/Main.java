package factoryDesign;

import factoryDesign.business.abstracts.AdvertService;
import factoryDesign.business.abstracts.MessageService;
import factoryDesign.business.abstracts.UserService;
import factoryDesign.business.concretes.AdvertManager;
import factoryDesign.business.concretes.CorporateUserManager;
import factoryDesign.business.concretes.IndividualUserManager;
import factoryDesign.business.concretes.MailManager;
import factoryDesign.business.concretes.MessageManager;
import factoryDesign.entities.concretes.User;
import factoryDesign.entities.concretes.Advert;
import factoryDesign.entities.concretes.Message;

public class Main {

	public static void main(String[] args) {
		
		
		User user  = new User();
		Advert advert  = new Advert();
		Message message = new Message();
		
		//Kullan�c�, ilan ve mesaj olu�turulur.
		user.success();
		advert.success();
		message.success();

		
		System.out.println("*************************************");
		
		AdvertService advertService = new AdvertManager();
		
		MessageService smsService   = new MessageManager();
		MessageService mailService  = new MailManager();
		
		UserService individualService = new IndividualUserManager();
		UserService corporateService  = new CorporateUserManager();
		
		
		//�lan� yay�na almak i�in
		advertService.postAdvert();
		//SMS g�nderimi
		smsService.sendMessage();
		//Mail g�nderimi
		mailService.sendMessage();
		//Ki�isel m��teri 
		individualService.getUser();
		//Bireysel m��teri
		corporateService.getUser();
		
		

	}

}
