package Polymorphism;

class WhatsApp1_1{
	
	public void chat() {
		System.out.println("Chatting-Text");
		System.out.println("Chatting-Emojis");
		System.out.println("Change the background");
	}
	
	public void status() {
		System.out.println("Caption");
	}
	
	public void contact() {
		System.out.println("\nContact List");
	}
}

class WhatsApp1_2 extends WhatsApp1_1{
	
	public void chat() {
		System.out.println("Chatting-Text");
		System.out.println("Chatting-Emojis");
		System.out.println("Change-Gif");
		System.out.println("Change-Stickers");
		System.out.println("Change the background");
		System.out.println("Payment");
		System.out.println("Audio-Video Call");
		System.out.println("Share Documents");
	}
	
	public void status() {
		System.out.println("\nCaption");
		System.out.println("Video");
		System.out.println("Location");
		System.out.println("Links");
		System.out.println("Rich Text");
	}
	
}

public class MethodOverRidding_RunTime_Dynamic {
	
	public static void main(String[] args) {
		//Object Creation
		WhatsApp1_2 w = new WhatsApp1_2();
		w.chat();
		w.status();
		w.contact();
	}
}
