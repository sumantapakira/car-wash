package carwash;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCarId("123");
		car.setCarType("SEDAN");
		
		BaseService baseService = new BaseService("BS01", "Basic Servicing");
		EngineProblem engine = new EngineProblem("EP01", "Engine Problem");
		BreakFixing breakFixing = new BreakFixing("BF01", "Break Fixing");
		List<MechanicalService> list = new ArrayList<>();
		
		list.add(baseService);
		list.add(engine);
		list.add(breakFixing);
			
		int  price = CarWashServiceFactory.createCarWashService().getPrice(car, list);
		System.out.println("Total price ## " +price);
	}

}
