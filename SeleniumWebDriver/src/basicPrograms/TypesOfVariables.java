package basicPrograms;

public class TypesOfVariables {

	//Instance Variable
	String name, email;
	int ID;
	
	//Static Variable 
	static String CN = "Software Testing", IN = "EduBridge Infotech";
	
	public void demo() {
		//Local Variable
		int a = 10;
		System.out.println("\nInt a Value is -> "+a);
	}
	public static void main(String[] args) {
		
		//Object
		TypesOfVariables t = new TypesOfVariables();
		System.out.println("Learners Details: ");
		
		t.ID=101;
		t.name="John";
		t.email="john@gmail.com";
		System.out.println("\nEnrollment ID: "+t.ID+"\nName: "+t.name+"\nEmail: "+t.email+"\nInstitute Name: "+t.IN+"\nCource Name: "+t.CN);
		
		t.ID=102;
		t.name="Anna";
		t.email="anna@yahoo.com";
		System.out.println("\nEnrollment ID: "+t.ID+"\nName: "+t.name+"\nEmail: "+t.email+"\nInstitute Name: "+t.IN+"\nCource Name: "+t.CN);
	
		t.demo();
	}

}
