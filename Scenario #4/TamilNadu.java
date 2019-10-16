package basic;

abstract class India {                                                        //abstract class india
	abstract void speakLanguage();
	abstract void eat();
	abstract void dress();
	static String capital = "New Delhi";

	public India(String primeMinister) {                                     //parameterized constructor
		System.out.println("Our Prime Minister is " + primeMinister);
	}
}
abstract class SouthIndia extends India{                                   //inherits india class
	
	public SouthIndia(String primeMinister) {
		super(primeMinister);
		
	}
	void cultivate(){
		System.out.println("Rice and Wheat cultivation"); 
	}
	void livingStyle() {
		System.out.println("Average development");
	}
}
public class TamilNadu extends SouthIndia {

	public TamilNadu(String primeMinister) {
		super(primeMinister);
		
	}
	static String capital = "Chennai";                                      //static variable

	void speakLanguage() {                                                 //overriding methods
		System.out.println("tamil,english");
	}

	void eat() {
	System.out.println("hot and spicy foods");
	}

	void dress() {
		System.out.println("Sarees, dhoties");
	}
	void cultivate() {                                                                    //method overridden
		 System.out.println("Rice and Sugar cane is major cultivation in Tamilnadu");
	 }
	 void livingStyle() {
		 System.out.println("Above Average development in Tamilnadu");
	 }
	public static void main(String[] args) {
		System.out.println("India capital is "+India.capital);
		System.out.println("TamilNadu capital is "+TamilNadu.capital);
		SouthIndia si = new TamilNadu("Modi");                         //dynamic binding
		si.cultivate();
		si.livingStyle();
		si.dress();
	}

}
