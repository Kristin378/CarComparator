package kristinhessech20;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
	
	public int compare(Car ob1, Car ob2) {
		
		if(ob1.getPrice() > ob2.getPrice()) {
			return 1;
		}
		else if(ob1.getPrice() < ob2.getPrice()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

		
		
}				
	
	
	



