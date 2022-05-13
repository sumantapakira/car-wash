package carwash;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCarId("123");
		car.setCarType("SEDAN");
		
		AdvancedWash advanced = new AdvancedWash();
		BaseWash1 base = new BaseWash1();
		MoreAdvancedWash moreAdvance = new MoreAdvancedWash();
		List<Wash> list = new ArrayList<>();
		
		list.add(base);
		list.add(advanced);
		list.add(moreAdvance);
			
		int  price = CarWashServiceFactory.createCarWashService().getPrice(car, list);
		System.out.println(price);
	}

}
