package Inheritance;
import Inheritance.Android.Samsung;
	
	class Android{ //Parent Class 
	public void featureOfAndroid() {
		System.out.println("PlayStore");
		System.out.println("FileManager");
		System.out.println("GBoard");
		System.out.println("External Storage");
		System.out.println("Google Media"); 
		}	
	class Samsung extends Android {	//Child Class 
		public void featureOfSamsung() {
			System.out.println("Quad HD Display");
			System.out.println("Versatile Triple Camera Setup ");
			System.out.println("4000 mah Batery"); 			}
	}
	class Oneplus extends Android {	//Child Class 
		public void featureOfOneplus() {
			System.out.println("Oneplus Account");
			System.out.println("Auqa Touch Display");
			System.out.println("Color OS");
		} 	}
}
	public class HierarchicalInheritance {
		public static void main(String[] args) {
			Android a = new Android();
			a.featureOfAndroid();
			Samsung sm = new Samsung();
			sm.featureOfAndroid();
			sm.featureOfSamsung();
			
			}
}
