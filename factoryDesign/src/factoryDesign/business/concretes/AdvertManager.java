package factoryDesign.business.concretes;

import factoryDesign.business.abstracts.AdvertService;

public class AdvertManager implements AdvertService{

	
	//�lan i�in AdvertManager ile birlikte ilan yay�na al�nd��� zaman g�r�lecektir.
	@Override
	public void postAdvert() {
		System.out.println("�lan yay�na al�nd�.");
		
	}

	
	
}
