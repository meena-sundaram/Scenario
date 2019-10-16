package basic;

class Trainer {
	String dept = "CSE", institute = "Payilagam";
	private int salary = 10000;                               //private data Access modifiers

	public int getSalary() {                                  //Encapsulation concepts in order to get the private data in a class getter() is used
		return salary;
	}

	public Trainer(String dept, String institute) {
		this.dept = dept;
		this.institute = institute;
	}

	public void training() {
		System.out.println("Department:" + dept + "\nInstitute:" + institute);
	}
}

class SQLTrainer extends Trainer {                              //single inheritance
	private int salary = 15000;
	public int getSalary() {                                    //Encapsulation concepts in order to get the private data in a class getter() is used
		return salary;                            
	}

	public SQLTrainer(String dept, String institute) {         //constructor 
		super(dept, institute);
		this.dept = dept;
		this.institute = institute;
	}

	public static void main(String[] args) {
		Trainer trainerkumar = new Trainer("Java", "Payilagam");
		System.out.println("Trainer:Kumar");
		trainerkumar.training();
		System.out.println("Salary:" + trainerkumar.getSalary());
		SQLTrainer ram = new SQLTrainer("SQL", "Payilagam");
		System.out.println("Trainer:Ram");
		ram.training();
		System.out.println("Salary:" + ram.getSalary());
	}
}
