package amusemntParkPackage;

public class AmusementMain {

	public static void main(String[] args) {

		Person p1 = new Person();
		AmusementParkRide r1 = new AmusementParkRide();
		
		p1.height = 120;
		p1.weight = 14;
		
		r1.eligibilitycheck(p1.height, p1.weight);
		
	}

}
