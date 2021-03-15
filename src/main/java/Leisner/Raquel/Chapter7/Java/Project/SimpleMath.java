package Leisner.Raquel.Chapter7.Java.Project;

public class SimpleMath {
	double divide(double numerator, double denominator) throws ArithmeticException{
		if(denominator==0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		double result = numerator / denominator;
		return result;
	}
}
