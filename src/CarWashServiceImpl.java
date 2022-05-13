package carwash;

import java.util.List;

public class CarWashServiceImpl implements CarWashService{

	@Override
	public int getPrice(Car car, List<Wash> washServices) {
		int price=0;
		for(Wash type: washServices) {
			price = price+ type.calculatePrice(car);
		}
		return price;
	}

}
