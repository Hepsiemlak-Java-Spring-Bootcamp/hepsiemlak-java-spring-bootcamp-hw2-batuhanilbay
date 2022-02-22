package factoryDesign.business.concretes;

import factoryDesign.business.abstracts.AdvertService;

public class AdvertManager implements AdvertService{

	
	//Ýlan için AdvertManager ile birlikte ilan yayýna alýndýðý zaman görülecektir.
	@Override
	public void postAdvert() {
		System.out.println("Ýlan yayýna alýndý.");
		
	}

	
	
}
