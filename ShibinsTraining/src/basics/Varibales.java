package basics;

public class Varibales {

	
	
	public static void main(String[] args) {
		//Variable Declaration
		int number;
		//Initialization 
		number = 20;
		
		int num2 = 40;
		String name = "Shibin";
		boolean value = true;
		char letter = 'a';
		double percentage = 11.2;
		
		Varibales v = new Varibales();
		v.swap();
		
		
	}
	
	public void swap() {
		int x = 10;
		int y = 20;
		//swap
		int z = x;
		x=y;
		y=z;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
