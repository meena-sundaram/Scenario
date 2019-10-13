package basic;

abstract class SmartPhone {                                   // Abstract Class SmartPhone

	abstract int call(int seconds);
	abstract void sendMessage();
	abstract void receiveCall();
	void browse() {
		System.out.println("SmartPhone browsing");
	}

	public SmartPhone() {
		System.out.println("Smartphone under development");
	}
}

abstract class FactoryDemo extends SmartPhone {               // Abstract class SmartPhone extends Abstract class SmartPhone as its parent
	
	abstract void verifyFingerPrint();
	abstract void providePattern();
	void browse() {                                           // Method overriding
		System.out.println("Factory Demo browsing");
	}

	boolean isOriginalPiece = false;
	static int price = 0;
}

public class Samsung extends FactoryDemo {
	
	static int price = 5000;
	@Override                                                 //method overridden
	void verifyFingerPrint() {
		System.out.println("verifyFingerPrint: yes");
	}

	@Override
	void providePattern() {
		System.out.println("providePattern: yes");
	}

	@Override
	int call(int seconds) {                                 //Method Argument
		return 0;
	}

	@Override
	void sendMessage() {
		System.out.println("can send message: yes");
	}

	@Override
	void receiveCall() {
		System.out.println(super.price);
	}

	public static void main(String[] args) {
		Samsung sam = new Samsung();           
		/*
		 * Flow starts from class Samsung creats constructor then Samsung class
		 * extends FactoryDemo class there is no constractor so javac creats
		 * default constructor for that class extends SmartPhone there's an
		 * constructor it as print statement and that will be printed.
		 */
		sam.verifyFingerPrint();
		sam.call(2);
		sam.sendMessage();
		sam.browse();                                             // method overridden by child class
		System.out.println("Price of a mobile: " + sam.price);
	}

}
