package src.lab1;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_DENOMINATOR = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		double absDiff;
		
		for(int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
			sumL2R += (double) 1 / denominator;
		}
		
		for(int denominator = MAX_DENOMINATOR; denominator >=1; denominator--) {
			sumR2L += (double) 1 / denominator;
		}
		
		System.out.println("The sum from left - to - right is: " + sumR2L);
		absDiff = Math.abs((sumL2R - sumR2L));
		System.out.println(absDiff);
		
	}
}
