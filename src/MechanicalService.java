package carwash;

public abstract class MechanicalService {
	public String serviceCode;
	public String serviceDescription;
	
	
	public int calculatePrice(Car car) {
		return 0;
	}
	public String getServiceCode() {
		return this.serviceCode;
	}
	public String getServiceDescription() {
		return this.serviceDescription;
	}

}
