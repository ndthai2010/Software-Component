package src.lab1;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		int sumOdd = 0;
		int sumEven = 0;
		double average;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		
		for(int i = LOWERBOUND; i <= UPPERBOUND; i++) {
			sum += i;
			count++;
			if(i % 2 == 0) {
				sumEven += i;
			}else {
				sumOdd += i;
				}
			}
	
		average = (double) sum / count;
		System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
		System.out.println("The average is " + average);
	}
}
