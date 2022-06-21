package classPrograms;

public class laptopMain {

	public static void main(String[] args) {

		// Initializing everything using objects//
		
		Laptop lp1 = new Laptop();
		
		lp1.laptopName = "Dell";
		lp1.ramSize =  16;
		lp1.processorType = "i5";
		
		System.out.println("Laptop name is "+ lp1.laptopName);
		System.out.println("Laptop's rap is "+ lp1.ramSize);
		System.out.println("Laptop's processor is "+ lp1.processorType+ "\n");
		
		// Using method to initialize all variables //
		
		Laptop lp2 = new Laptop();
		lp2.method("HP", 8, "i3");
		System.out.println("Laptop name is "+ lp2.laptopName);
		System.out.println("Laptop's rap is "+ lp2.ramSize);
		System.out.println("Laptop's processor is "+ lp2.processorType+ "\n");
		
		// Using parameterized constructor 
		
		Laptop lp3 = new Laptop("lenevo", 12 , "i7");
			
			System.out.println("Laptop name is "+ lp3.laptopName);
			System.out.println("Laptop's rap is "+ lp3.ramSize);
			System.out.println("Laptop's processor is "+ lp3.processorType);
		}
	
	}


