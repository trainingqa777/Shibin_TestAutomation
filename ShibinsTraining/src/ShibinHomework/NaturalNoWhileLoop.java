package ShibinHomework;

import basics.Javafunctions;

public class NaturalNoWhileLoop {

	public static void main(String[] args) {
		
		
		NaturalNoWhileLoop nn = new NaturalNoWhileLoop();
//		nn.NaturalNo();
//		nn.DesNatNo();
//			
//		nn.MultiTable(4);
//			
//		boolean p=nn.PrimeNumber(13);
//		System.out.println(p);
		int x = nn.addition(10, 20);
		System.out.println(x);
		
		Javafunctions jf = new Javafunctions();
		jf.List();
	}
	public void NaturalNo() {
		int i = 1;
		System.out.println("First 10 natural numbers is");
		while (i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public void DesNatNo () {
		int i = 10;
		System.out.println("First 10 natural numbers in descending order is");
		do {
			System.out.println(i);
			i--;
		}
		while(i>=1);
	}
	
	public void MultiTable(int n) {
		System.out.println(" ");
		System.out.println("Multiplication table for "+ n);
		for (int i = 1; i <=10; i++) {
			  System.out.println(i+" x " + n +" = "+i*n);
			}
	}
	public boolean PrimeNumber(int n) {
		boolean flag=true; 
		for (int i =(n-1); i>=2; i--){
			if (n%i==0) {
				System.out.println("The number "+n+" is not prime number");
				flag = false;
				break;
			}
		}
		
			if (flag==true) {
				System.out.println("The number "+n+" is prime number");
			}
			
		return flag;	
	}
	
	public int addition(int x, int y) {
		int sum = x+y;
		return sum;
	}
}
		
	

