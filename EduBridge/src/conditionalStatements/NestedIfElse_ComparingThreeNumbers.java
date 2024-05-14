package conditionalStatements;

import java.util.Scanner;

public class NestedIfElse_ComparingThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three numbers");
		int a = sc.nextInt(), b=sc.nextInt(), c= sc.nextInt();
		
		if(a>b) {
				System.out.println(a+" is the greatest number");			
			}
			else if (b>c) {
				System.out.println(b+" is the greatest number");		
			} 	
		else{
				System.out.println(c+" is the greatest number");
		}
	}
}
