package oops;

import java.util.Scanner;

public class HowToCreateMethod_VOID {

	public void add(int a, int b) {
		System.out.println("Add: "+(a+b));
	}
	
	public void sub (int a, int b) {
		System.out.println("Sub: "+(a-b));
	}
	
	public static void main(String[] args) {
		//Object Creation
		HowToCreateMethod_VOID method= new HowToCreateMethod_VOID();
		
		//Calling Methods
		method.add(123, 456);
		method.sub(456, 123);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter two numbers");
		int num1 = sc.nextInt(); int num2 = sc.nextInt();
		
		method.add(num1, num2);
		method.sub(num1, num2);
	}

}
