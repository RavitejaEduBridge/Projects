package conditionalStatements;

import java.util.Scanner;

public class PercentageOfMarks {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks below 100.");
		int marks=sc.nextInt();
		
		if(marks>= 80) {
			System.out.println("You got Distinction: ");
			
			}
			
			else if(marks>= 60 && marks<= 79) {
			System.out.println("\nYou got First Class:  ");
			}
			
			else if(marks>= 50 && marks<= 59) {
				System.out.println("\nYou got Second Class:  ");
			}
			
			else if(marks>= 35 && marks<= 49) {
			System.out.println("\nYou got Third Class:   ");
			}
			
			else {
				System.out.println("You didn't get pass marks");
			}
		
		
}
}
