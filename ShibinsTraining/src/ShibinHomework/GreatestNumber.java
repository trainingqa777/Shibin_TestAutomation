package ShibinHomework;

public class GreatestNumber {

	public static void main(String[] args) {
		GreatestNumber gn = new GreatestNumber();
		gn.GreatNo();
	}
	
	public void GreatNo() {

		int x=6;
		int y = -9;
		int z = 1;
		int a= 0;
		if (x>y) {
			a=x;
		}
		else {
			a=y;
		}
		if (a<z) {
			a=z;
		}
		System.out.println("Largest number is:" +a);
	}
}
