package Com.ThursdayActivityDec15;

public class FibonacciSeries {
	int fibonacciSeries(int n) {
		int num1=0;
		int num2=1;
		
		for(int i=2;i<=10;i++) {
			num1=num2;
			num2=n;
			n=num1+num2;
		}
			
		return n;
	}
}
