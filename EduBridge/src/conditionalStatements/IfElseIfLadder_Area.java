package conditionalStatements;

import java.util.Scanner;

public class IfElseIfLadder_Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for area of circle.\nEnter 2 for area rectangle.\nEnter 3 for area triangle.\nEnter 4 for area square.");
		int input=sc.nextInt();
		
		if(input==1) {
		System.out.println("Circle: ");
		System.out.println("Enter radius: ");
		float r=sc.nextFloat();
		System.out.println("Area of Circle: "+(3.14*r*r));
		}
		
		else if(input==2) {
		System.out.println("\nRectangle: ");
		System.out.println("Enter length: ");
		float l=sc.nextFloat();
		System.out.println("Enter bredth: ");
		float b=sc.nextFloat();
		System.out.println("Area of rectangle: "+(l*b));
		}
		
		else if(input==3) {
		System.out.println("\nTriangle: ");
		System.out.println("Enter length: ");
		float l1=sc.nextFloat();
		System.out.println("Enter bredth: ");
		float b1=sc.nextFloat();
		System.out.println("Area of triangle: "+(0.5*l1*b1));
		}
		
		else if(input==4) {
		System.out.println("\nSquare: ");
		System.out.println("Enter side: ");
		float side=sc.nextFloat();
		System.out.println("Area of square: "+(side*side));
		}
		
		else {
			System.out.println("Invalid inputs");
		}
	}

}
