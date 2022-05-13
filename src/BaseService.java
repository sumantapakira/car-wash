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

	@Override
	public void setServiceCode(String code) {
		this.serviceCode = code;
	}

	@Override
	public void setServiceDescription(String description) {
		this.serviceDescription = description;
	}

}
