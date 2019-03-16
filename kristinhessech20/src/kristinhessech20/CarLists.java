package kristinhessech20;

import java.util.*;
public class CarLists {
  public static void main(String[] args) {
	
		//Car car = new Car("Jeep", "Patriot", 20000);
				
		ArrayList<Car> obj = new ArrayList<>();
		Car car = new Car("Jeep", "Patriot", 20000);
		//obj.add(car);
		obj.add(new Car("Chevrolet", "Cavalier", 13000));
		obj.add(new Car("Dodge", "Ram", 42000));
		obj.add(new Car("Ford", "Explorer", 28750));
		obj.add(new Car("Chevrolet", "Tahoe", 38715));
		obj.add(new Car("Ford", "Focus", 11000));
		obj.add(new Car("Nissan", "Rogue", 35328));
		
		
	
		/*Collections.addAll(obj, car);
		System.out.println(obj);*/
		Collection<String> collection = new ArrayList<String>();
		//Collection<String> collection = new Collection();
		Collections.addAll(obj, car);
		Iterator<Car> it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Car pricey = Collections.max(obj, new CarComparator());
		System.out.println("Most expensive car");
		System.out.println(pricey);
		
		//System.out.println(obj);
		//LinkedList<Object> gurus = new LinkedList<>();
		LinkedList<Object> Car = new LinkedList<Object>();
		ListIterator<Object> iter = Car.listIterator(Car.size());
		
		/*Iterator<Object> iter = gurus.iterator();
		for(Object ob : gurus) {
			System.out.println(ob);
		}*/
		
		/*System.out.println("\nGurus and Giants and numbers iterated");		*/		
		/*Iterator<Object> iter1 = gurus.iterator();*/
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//print(max(obj));
		
		
		
	
  }
  		
  		

private static char[] max(ArrayList<Car> obj) {
	// TODO Auto-generated method stub
	return null;
}



{
		/*while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}*/
		/*while ( iter.hasPrevious() )  {
            System.out.println( iter.previous() );
        }*/
		//obj.add("Dodge", "Dart", 6000); 
		
		
		//LinkedList<Object> car = new LinkedList<>();
		
		//car.sort((ob1, ob2)) -> ob1.
		
		
		
		
	}
}
	/*public static <E extends Comparable<E>> E max(E o1, E o2) {
		if (o1.compareTo(o2) > 0) 
			return o1;
		else
			return o2;
	}
	}*/
	
	




	
		
		

	

	
	
	
		
		

	
	

