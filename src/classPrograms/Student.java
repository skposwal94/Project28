package classPrograms;

public class Student {
	
	String studentName = "Salinder";
	int marksSubject1;
	int marksSubject2;
	int marksSubject3;
	int marksSubject4;
	int marksSubject5;
	
	double getPercentage() {
		
		return (marksSubject1+marksSubject2+marksSubject3+marksSubject4+marksSubject5)/5;
	}
	

}
