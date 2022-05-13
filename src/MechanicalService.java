package carwash;

public interface MechanicalService {
	
	public int calculatePrice(Car car);
	public void setServiceCode(String code);
	public void setServiceDescription(String description);

}
