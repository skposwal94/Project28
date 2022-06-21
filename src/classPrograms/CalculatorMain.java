package classPrograms;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		
		c1.addition(5,7);
		System.out.println("Sum of two number is "+c1.addition(5,7));
		
		c1.Subtraction(12, 7);
		System.out.println("Sub. of two number is "+c1.Subtraction(12, 7));
		
		c1.Multiplication(5,7);
		System.out.println("Multi. of two number is "+c1.Multiplication(5,7));
		
		c1.Division(35,7);
		System.out.println("Div. of two number is "+c1.Division(35,7));
		
	}

}
