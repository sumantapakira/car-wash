package carwash;

public class BaseService implements MechanicalService{

	private String serviceCode;
	private String serviceDescription;
	
	@Override
	public int calculatePrice(Car car) {
		switch(car.getCarType()) {
		case "SUV":
			return 5000;
		case "SEDAN":
			return 4000;
	    case "HATCHBACK":
			return 2000;
		default:
		 return 0;
		}
	}

	public BaseService(String serviceCode, String serviceDescription) {
		super();
		this.serviceCode = serviceCode;
		this.serviceDescription = serviceDescription;
	}

	@Override
	public String getServiceCode() {
		return this.serviceCode;
	}

	@Override
	public String getServiceDescription() {
		return this.serviceDescription;
	}
}
