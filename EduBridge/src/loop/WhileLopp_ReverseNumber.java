package loop;

import java.util.Scanner;

public class WhileLopp_ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print its reverse: ");
		int num = sc.nextInt();
		
		int rem, rev=0;
		
		while (num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverese: "+rev);
		}

}
