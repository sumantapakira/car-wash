package carwash;

public class BreakFixing extends MechanicalService{

	
	public BreakFixing(String serviceCode, String serviceDescription) {
		super();
		this.serviceCode = serviceCode;
		this.serviceDescription = serviceDescription;
	}

	@Override
	public int calculatePrice(Car car) {
		int price;
		switch(car.getCarType()) {
		case "SUV":
			price= 2500;
			break;
		case "SEDAN":
			price= 1500;
			break;
	    case "HACHBACK":
			price= 1000;
			break;
		default:
		 price= 0;
		}
		System.out.println("The price for Service Code : "+this.getServiceCode() + " is : "+price);
		return price;
	}

}
