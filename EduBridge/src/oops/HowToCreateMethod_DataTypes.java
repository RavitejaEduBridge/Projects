package oops;

public class HowToCreateMethod_DataTypes {

	public int div(int x, int y) {
		return (x/y);
	}
	
	public int mul(int x, int y) {
		return(x*y);
	}
	
	public static void main(String[] args) {
		
		//Object Creation
		HowToCreateMethod_VOID oldMethod = new HowToCreateMethod_VOID();
		
		//Method Calling
		oldMethod.add(19, 77);		
		oldMethod.sub(120, 90);
		
		//Object Creation
		HowToCreateMethod_DataTypes newMethod= new HowToCreateMethod_DataTypes();
		
		//Method Calling
		System.out.println("Div: "+newMethod.div(11, 5));
		System.out.println("Mul: "+newMethod.mul(12, 90));

	}
}
