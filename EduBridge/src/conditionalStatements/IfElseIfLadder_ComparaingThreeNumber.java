package conditionalStatements;

import java.util.Scanner;

public class IfElseIfLadder_ComparaingThreeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is greatest.");
		}
		else if(b>a && b>c){
			System.out.println(b+" is greatest.");
		}
		else if(c>a && c>b){
			System.out.println(c+" is greatest.");	
		}
		else {
			System.out.println("More than two numbers should not be same.");
		}
	}
}
