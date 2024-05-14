package BasicProgram;

import java.util.Scanner;

public class UserInformation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Full Name: ");
		String name = sc.next();
		
		System.out.println("Age: ");
		int age = sc.nextInt();
		
		System.out.println("BloodGroup: ");
		char bloodGroup = sc.next().charAt(0);
		
		System.out.println("Percentage: ");
		float per = sc.nextFloat();
		
		System.out.println("Salary: ");
		double salary=sc.nextDouble();
		
		System.out.println("Are you working profession");
		boolean ans=sc.nextBoolean();
	}
}