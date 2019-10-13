package basic;

interface Actor {                                                    //Interface Actor
	boolean makeUpRequired = true;
	String address = "chennai";
	void act();
	void dance();
	void sing();
}

public class ActorSivakumar implements Actor {
	
	static String address = "Coimbatore";                        //Static variable address

	public ActorSivakumar(int age, String car) {                 //parameterized constructor
		System.out.println("Actor: SivaKumar");
		System.out.println("Age: "+age);
		System.out.println("Car name: "+car);
		System.out.println("Address: "+address);
	}

	public ActorSivakumar() {
		System.out.println("This is a no argument constructor");   //no argument constructor
	}

	public void act() {
		System.out.println("Sivakumar is goog in Acting");
	}

	public void dance() {
		System.out.println("Sivakumar is a classical, flok dancer");
	}

	public void sing() {
		System.out.println("Sivakumar sings carnatic, hindustani music");
	}

	public void speaking() {
		System.out.println("Sivakumar knows English, French, bengali, Marathi, Tamil languages...");
	}

	public static void main(String[] args) {
		ActorSivakumar as = new ActorSivakumar(65, "Audi Car");      //new keyword creates object for ActorSivaKumar and invokes constructor to initialize the created object
		as.act();                                                    //static binding
		as.dance();
		as.sing();
		//as.speaking();
		System.out.println("Static valued address" +as.address);
		Actor ac = new ActorSivakumar();                            //dynamic binding
		//as.sing();
		as.speaking();
		System.out.println("Interface address" +ac.address);
	}

}
