package loop;

import java.util.Scanner;

public class ForLoop_PrintingNumbers {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("\nReverse Numbers");
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter START and END range: ");
		int start=sc.nextInt(), end=sc.nextInt();
		
		for(int i=start; i<=end; i++) {
			System.out.println(i);
		}
	}

}
