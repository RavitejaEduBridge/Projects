package conditionalStatements;

import java.util.Scanner;

public class IfStatement_LicenceProcess {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter Your Age: ");
			int age = sc.nextInt();
			
			//Condition
			if(age>= 18 && age<=60) {
				System.out.println("You are eligible for licence process.");
			}
	}
}
