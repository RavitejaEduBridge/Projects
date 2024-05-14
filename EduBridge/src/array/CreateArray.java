package array;

import java.util.Scanner;

public class CreateArray {

	public static void main(String[] args) {
		
		//Way 1:
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		String b[]= {"Pearl","C","C++","Asap.Net","Java","Rubby","Scala","Python"};
		
		System.err.println(a[5]);
		System.out.println(b[5]);
		
		//Way 2:
		Scanner sc=new Scanner(System.in);
		int []a1=new int[5];
		
		System.out.println("\n\nEnter Data: ");
		for(int i=0; i<=4; i++) {
			a1[i]=sc.nextInt();
		}
		System.out.println("\nFirst Array: ");
		for(int i=0; i<=4; i++) {
			System.out.println(a1[i]);
		}
		System.out.println("\nReverse Array: ");
		for(int i=a1.length-1; i>=0; i--) {
			System.out.println(a1[i]);
		}
		
	}
}
