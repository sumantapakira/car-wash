package carwash;

public class EngineProblem implements MechanicalService{
	
	private String serviceCode;
	private String serviceDescription;
	
	
	public EngineProblem(String serviceCode, String serviceDescription) {
		super();
		this.serviceCode = serviceCode;
		this.serviceDescription = serviceDescription;
	}

	@Override
	public int calculatePrice(Car car) {
		switch(car.getCarType()) {
		case "SUV":
			return 5;
		case "SEDAN":
			return 20;
	    case "HACHBACK":
			return 25;
		default:
		 return 0;
		}
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
