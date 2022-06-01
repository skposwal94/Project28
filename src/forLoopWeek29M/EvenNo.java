package forLoopWeek29M;

public class EvenNo {

	public static void main(String[] args) {

		// program to print even no. between 1 to 100 in reverse order
		
		System.out.println("Even numbers in reverse order");
		
		for (int i=100;i>=1;i--) {
			
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}

}
