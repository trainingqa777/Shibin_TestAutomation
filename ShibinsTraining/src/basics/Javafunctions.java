package basics;

import java.util.ArrayList;

public class Javafunctions {

	public void ArrayConcept() {
		//ArrayType [] ArrayName = new ArrayType [Size of an Array];
		String[] Cars = new String[5];
		Cars[0] = "BMW";
		Cars[1] = "Toyota";
		Cars[2] = "Honda";
		Cars[3] = "Ford";
		Cars[4] = "Cardillac";

		String[] CarModels = {"Camry","Corolla","Civic","HRV"};
		int length = CarModels.length;
		System.out.println(length);

		CarModels[0] = "XT5";
		String sBMW = CarModels[0];
		System.out.println("First value of the Array is ==> " + sBMW);

		String sHonda = CarModels[length-1];
		System.out.println("Last value of the Array is ==> " + sHonda);
		
		for (int i = 0; i < length; i++) {
			System.out.println(CarModels[i]);
		}
		
		//System.out.println(CarModels[5]);

	}
	
	public void List() {
		//ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Cardillac");
		cars.add("BMW");
		
		cars.set(2, "Opel");
		//System.out.println(cars.get(2));
		
		//System.out.println(cars.size());
		
//		for (int i = 0; i < cars.size(); i++) {
//		      System.out.println(cars.get(i));
//		 }
		
		//Foreach loop
		//for each element in collection
		for(String car : cars) {
			System.out.println(car);
		}
		
		//ArrayConcept();
	}

	public void forLoops() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
	
	public String VerifyTitle() {
		return "VerifyTitle";
		
	}

	public static void main(String[] args) {
		Javafunctions jf = new Javafunctions();
		jf.List();
	}

}
