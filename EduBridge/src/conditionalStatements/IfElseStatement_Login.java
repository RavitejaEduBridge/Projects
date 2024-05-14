package conditionalStatements;

import java.util.Scanner;

public class IfElseStatement_Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username & Password");
		String un = sc.next(), pwd=sc.next();
		
		if(un.equals("EduBridge") && pwd.equals("Edu@123")) {
			System.out.println("Login Successful.");
		} else {
			System.out.println("Invalid Credentials.");
		}
	}

}
