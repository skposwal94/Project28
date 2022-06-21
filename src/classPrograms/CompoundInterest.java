package classPrograms;

public class CompoundInterest {
	
	double principalAmount;
	double interestRate;
	double timeInYears;
	
	double interestearned(double principalAmount,double interestRate,double timeInYears ) {
				
		
		double TotalAmount = principalAmount*
				((Math.pow((1 + interestRate/1200), (12*timeInYears))));
		
		return (TotalAmount - principalAmount);
	}

}
