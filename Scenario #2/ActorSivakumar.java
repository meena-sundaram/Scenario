package basic;

interface Actor {                                                 //Interface
	boolean makeUpRequired = true;
	String address = "chennai";
	void act();
	void dance();
	void sing();
}

public class ActorSivakumar implements Actor {
	
	static String address = "Coimbatore";                        //Static variable

	public ActorSivakumar(int age, String car) {
		System.out.println("Actor: SivaKumar");
		System.out.println("Age: "+age);
		System.out.println("Car name: "+car);
		System.out.println("Address: "+address);
	}

	public ActorSivakumar() {
	
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
		ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
		as.act();
		as.dance();
		as.sing();
		//as.speaking();
		System.out.println("Static valued address" +as.address);
		Actor ac = new ActorSivakumar();
		//as.sing();
		as.speaking();
		System.out.println("Interface address" +ac.address);
	}

}
