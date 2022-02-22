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
		
		//Kullanýcý, ilan ve mesaj oluþturulur.
		user.success();
		advert.success();
		message.success();

		
		System.out.println("*************************************");
		
		AdvertService advertService = new AdvertManager();
		
		MessageService smsService   = new MessageManager();
		MessageService mailService  = new MailManager();
		
		UserService individualService = new IndividualUserManager();
		UserService corporateService  = new CorporateUserManager();
		
		
		//Ýlaný yayýna almak için
		advertService.postAdvert();
		//SMS gönderimi
		smsService.sendMessage();
		//Mail gönderimi
		mailService.sendMessage();
		//Kiþisel müþteri 
		individualService.getUser();
		//Bireysel müþteri
		corporateService.getUser();
		
		

	}

}
