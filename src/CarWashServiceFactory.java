package carwash;

public class CarWashServiceFactory {
	
	public static CarWashService createCarWashService() {
		return new CarWashServiceImpl();
	}

}
