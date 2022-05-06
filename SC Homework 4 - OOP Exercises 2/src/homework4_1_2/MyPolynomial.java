package src.homework4_1_2;
public class MyPolynomial {

	private double[] coeffs;

	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}

	public int getDegree() {
		return coeffs.length - 1;
	}

	public String toString() {
		String ret = coeffs[coeffs.length - 1] + "*x^" + (coeffs.length - 1) + "";
		for (int i = coeffs.length - 2; i >= 0; i--) {
			if (i != 0) {
				ret += " + " + coeffs[i] + "*x^" + i;
			} else {
				ret += " + " + coeffs[i];
			}
		}
		return ret;
	}

	public double evaluate(double x) {
		double sum = 0.0;
		double item = 1.0;
		for (int i = 0; i < coeffs.length; i++) {
			item *= (i == 0 ? 1.0 : x);
			sum += item * coeffs[i];
		}
		return sum;
	}

	public MyPolynomial add(MyPolynomial right) {
		MyPolynomial result = this;
		if (result.getDegree() < right.getDegree()) {
			result = right;
			right = this;
		}
		double[] resultCoeffs = result.coeffs;
		double[] rightCoeffs = right.coeffs;
		for (int i = 0; i < resultCoeffs.length; i++) {
			if (i > rightCoeffs.length - 1) {
				continue;
			}
			resultCoeffs[i] += rightCoeffs[i];
		}
		return new MyPolynomial(resultCoeffs);
	}

	public MyPolynomial multiply(MyPolynomial right) {
		double[] resultCoeffs = new double[this.getDegree() + right.getDegree() + 1];
		double[] rightCoeffs = right.coeffs;
		for (int i = 0; i < resultCoeffs.length; i++) {
			double num = 0.0;
			for (int j = 0; j <= i; j++) {
				if (j > coeffs.length - 1) {
					continue;
				}
				if (i - j > rightCoeffs.length - 1) {
					continue;
				}
				num += coeffs[j] * rightCoeffs[i - j];
			}
			resultCoeffs[i] = num;
		}
		return new MyPolynomial(resultCoeffs);
	}

}
