package array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		//Create Array
		int a[]=new int[size];
		
		System.out.println("\nEnter Data:");
		for(int i=0; i<=size-1; i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<size; i++) {
			sum=a[i]+sum;
		}
		System.out.println("Sum of first array: "+sum);
		
		System.out.println("--------------------------------------");
				
		System.out.println("Enter size of second array");
		
		int size1 = sc.nextInt();
		
		int b[]=new int[size1];
		
		System.out.println("\nEnter Data:");
				
		for(int i=0; i<=size1-1; i++) {
			b[i]=sc.nextInt();
		}
		int sum1=0;
		for(int i=0; i<size1; i++) {
			sum1=b[i]+sum1;
		}
		System.out.println("Sum of second array "+sum1);
		System.err.println("--------------------------------------");
		System.out.println("Sum of both array's "+(sum+sum1));
	
	}
	
}
