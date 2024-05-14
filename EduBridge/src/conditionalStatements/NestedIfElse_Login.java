package conditionalStatements;

import java.util.Scanner;

public class NestedIfElse_Login {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username: ");		
		String un = sc.next();
		
		if(un.equals("EduBridge")) { // Main If
			
			System.out.println("Enter Password: ");
			String pwd = sc.next();
			
			if(pwd.equals("Edu@123")) {
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Invalid Password");	
			}
		}			
		else { // Main Else
			System.out.println("Invalid Username");	
		}
	}
}
