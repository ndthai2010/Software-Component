package src.homework4_1_1;
public class MyComplex {

	private double real;
	private double imag;

	public MyComplex() {
		real = 0.0;
		imag = 0.0;
	}

	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		return "(" + real + "+" + imag + "i" + ")";
	}

	public boolean isReal() {
		if (imag == 0) {
			return true;
		} 
		return false;
	}

	public boolean isImaginary() {
		if (real == 0 && imag != 0) {
			return true;
		}
		return false;
	}

	public boolean equals(double real, double imag) {
		if (this.real == real && this.imag == imag) {
			return true;
		}
		return false;
	}

	public boolean equals(MyComplex another) {
		if (this.real == another.real && this.imag == another.imag) {
			return true;
		}
		return false;	
	}

	public double magnitude() {
		return Math.sqrt(real * real + imag * imag);
	}

	public MyComplex addInto(MyComplex right) {
		this.real = real + right.getReal();
		this.imag = imag + right.getImag();
		return this;
	}

	public MyComplex addNew(MyComplex right) {
		return new MyComplex(real + right.getReal(), imag + right.getImag());
	}

	public double argument() {
		return Math.atan2(real, imag);
	}

	public MyComplex subtract(MyComplex right) {
		this.real = real - right.getReal();
		this.imag = imag - right.getImag();
		return this;
	}

	public MyComplex subtractNew(MyComplex right) {
		return new MyComplex(real - right.getReal(), imag - right.getImag());
	}

	public MyComplex multiply(MyComplex right) {
		this.real = real * right.getReal() - imag * right.getImag();
		this.imag = real * right.getImag() + imag * right.getReal();
		return this;
	}

	public MyComplex divide(MyComplex right) {
		double imagn = Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2);
		MyComplex newRight = multiply(new MyComplex(right.getReal(), -right.getImag()));
		this.real = (double) (newRight.getReal() / imagn);
		this.imag = (double) (newRight.getImag() / imagn);
		return this;
	}

	public MyComplex conjugate() {
		imag = -imag;
		return this;
	}

}
