package conditionalStatements;

import java.util.Scanner;

public class IfElseStatement_LicenseProcess {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		//True condition
		if(age>= 18 && age<=60) {
			System.out.println("You are eligible for licence process.");
		}
		else //False condition
			{
			System.err.println("You are not eligible for licence process.");
		}
		
	}
		
}
