package carwash;

import java.util.List;

public interface CarWashService {

	int getPrice(Car car, List<Wash> washServices);
}
