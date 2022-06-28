package packageATM2;

public class MainClassATM {

	public static void main(String[] args) {

		PersonClassATM defaultPerson = new PersonClassATM();    // default variables invoked 
		defaultPerson.setValuesP0();							// assigned variables using method in person class

		System.out.println("Hi user welcome!!!");
		MethodsClassATM.getStarted(defaultPerson);     // calling an class level method 

	}

}
