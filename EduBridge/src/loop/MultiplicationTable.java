package loop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print its multiplication table:");
		int num=sc.nextInt();
		
		System.err.println("Multiplication table for num "+num+":");
		
		for(int i=1; i<=20; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
}
