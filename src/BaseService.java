package carwash;

public class BaseService extends MechanicalService{

	@Override
	public int calculatePrice(Car car) {
		int price;
		
		switch(car.getCarType()) {
		case "SUV":
			price= 5000;
			break;
		case "SEDAN":
			price= 4000;
			break;
	    case "HATCHBACK":
			price= 2000;
			break;
		default:
		 price= 0;
		}
		System.out.println("The price for Service Code : "+this.getServiceCode() + " is : "+price);
		return price;
	}

	public BaseService(String serviceCode, String serviceDescription) {
		super();
		this.serviceCode = serviceCode;
		this.serviceDescription = serviceDescription;
	}

}
