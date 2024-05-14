package Inheritance;

class Parent {
	
	public void square(int x) {
		
		System.out.println("Sqaure: "+Math.pow(x, 2));
	}
}

class ChildClass1 extends Parent{
	
	public void cube(int x) {
		System.out.println("Cube "+Math.pow(x, 3));
	}
}


class ChildClass2 extends ChildClass1{
	
	public void SimpleIntrest(float p, float r, float t) {
		System.out.println("Simple Intrest "+(p*r*t)/100);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		ChildClass2 cc2 = new ChildClass2();
		
		cc2.square(15);
		cc2.cube(30);
		cc2.SimpleIntrest(50000, 7.7f, 2);
	}

}
