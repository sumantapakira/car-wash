package carwash;

public class EngineProblem extends MechanicalService{
	
	
	public EngineProblem(String serviceCode, String serviceDescription) {
		super();
		this.serviceCode = serviceCode;
		this.serviceDescription = serviceDescription;
	}

	@Override
	public int calculatePrice(Car car) {
		int price;
		switch(car.getCarType()) {
		case "SUV":
			price = 10000;
			break;
		case "SEDAN":
			price= 8000;
			break;
	    case "HACHBACK":
			price= 5000;
			break;
		default:
		 price= 0;
		}
		System.out.println("The price for Service Code : "+this.getServiceCode() + " is : "+price);
		return price;
	}

}
