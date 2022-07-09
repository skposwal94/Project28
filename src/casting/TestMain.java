package casting;

public class TestMain {

	public static void main(String[] args) {
		
		parent object = new childClass();
		
//		object.testmethod();
		
		childClass c = (childClass)object;
		c.testmethod();
		((childClass) object).testmethod();
		
		
		double d = 5.5;
		int c1 = (int) d;
		System.out.println(c1);

	}

}
