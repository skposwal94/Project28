package classPrograms;

public class StudentMain {

	public static void main(String[] args) {

		
		Student s1 = new Student();
		
		s1.studentName = "Salinder";
		s1.marksSubject1 = 80;
		s1.marksSubject2 = 82;
		s1.marksSubject3 = 84;
		s1.marksSubject4 = 86;
		s1.marksSubject5 = 88;
		
		s1.getPercentage();
		System.out.println("The percentage of "+ s1.studentName+" is "+s1.getPercentage()+ " %");
	}

}
