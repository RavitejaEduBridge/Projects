package Polymorphism;

public class MethodOverLoading_ComplieTime_Static {

	/*
	 * public void login(String Valun, String Valpwd) {
	 * 
	 * }
	 * 
	 * public void login(String InValun, String InValpwd) {
	 * 
	 * }
	 * 
	 * public void login(String Valun, String InValpwd) {
	 * 
	 * }
	 */

	public int add(int a, int b) {
		System.out.println("Added both int Values is " + (a + b));
		return(a+b);
	}

	public int add(int a, int b, int c) {
		System.out.println("Added 3 int values is " + (a + b + c));
		return(a+b+c);
	}

	public double add(float a, double b) {
		System.out.println("Added float and double values is " + (a + b));
		return(a+b);
	}

	public long add(long a, int b) {
		System.out.println("Added long and int values is " + (a + b));
		return(a+b);
	}

	public double add(long a, double b) {
		System.out.println("Added long and double values is " + (a + b));
		return(a+b);
	}

	public static void main(String[] args) {
		
		//object Creation
		MethodOverLoading_ComplieTime_Static m = new MethodOverLoading_ComplieTime_Static();
		//Calling Methods
		m.add(12, 12);
		m.add(12, 15, 16);
		m.add(12.7f, 89898.78);
		m.add(132232l, 34237.75d);
		m.add(2132434, 123);
		
		/*
		 * System.out.println("Add: "+m.add(12, 12));
		 * System.out.println("Add: "+m.add(12, 15, 16));
		 * System.out.println("Add: "+m.add(12.7f, 89898.78));
		 * System.out.println("Add: "+m.add(132232l, 34237.75d));
		 * System.out.println("Add: "+m.add(2132434, 123));
		 */
	
	}

}
