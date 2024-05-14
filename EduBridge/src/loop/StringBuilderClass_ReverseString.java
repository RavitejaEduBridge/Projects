package loop;

import java.util.Scanner;

public class StringBuilderClass_ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data to print its reverse: ");
		String data = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(data);
		sb.reverse();
		
		System.out.println("Raverse String will be => "+sb);
	}
	

}
