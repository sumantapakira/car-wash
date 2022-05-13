package carwash;

import java.util.List;

public class CarWashServiceImpl implements CarWashService{

	@Override
	public int getPrice(Car car, List<MechanicalService> washServices) {
		int price=0;
		for(MechanicalService type: washServices) {
			price = price+ type.calculatePrice(car);
		}
		return price;
	}

}
