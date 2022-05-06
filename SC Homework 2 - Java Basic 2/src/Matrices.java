package src;
public class Matrices {

	public static void main(String[] args) {
		Matrices aMatrix = new Matrices();

		int[][] matrix1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] matrix2 = new int[][] { { 7, 8 }, { 9, 10 }, { 11, 12 } };

		System.out.println("Print matrix 1:");
		aMatrix.print(matrix1);
		System.out.println("Print matrix 2:");
		aMatrix.print(matrix2);

		if (aMatrix.haveSameDimension(matrix1, matrix1)) {
			System.out.println("Add matrix matrix1 to matrix1:");
			aMatrix.print(aMatrix.add(matrix1, matrix1));
		}

		System.out.println();
		if (aMatrix.haveAllowedDimension(matrix1, matrix2)) {
			System.out.println("Multiply matrix1 and matrix2:");
			aMatrix.print(aMatrix.multiply(matrix1, matrix2));
		}
	}

	public void print(int[][] matrix) {
		for (int[] row : matrix) {
			for (int index : row) {
				System.out.printf("%4d ", index);
			}
			System.out.println();
		}
	}

	public void print(double[][] matrix) {
		for (double[] row : matrix) {
			for (double index : row) {
				System.out.printf("%.2f ", index);
			}
			System.out.println();
		}
	}

	public boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
		if (matrix1.length != matrix2.length) {
			return false;
		}
		for (int index = 0; index < matrix1.length; index++) {
			if (matrix1[index].length == matrix2[index].length) {
				continue;
			}
			return false;
		}
		return true;
	}

	public boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
		if (matrix1.length != matrix2.length) {
			return false;
		}
		for (int i = 0; i < matrix1.length; i++) {
			if (matrix1[i].length == matrix2[i].length) {
				continue;
			}
			return false;
		}
		return true;
	}

	public int[][] add(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[matrix1.length][];
		for (int i = 0; i < result.length; i++) {
			result[i] = matrix1[i].clone();
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] += matrix2[i][j];
			}

		}
		return result;
	}

	public double[][] add(double[][] matrix1, double[][] matrix2) {
		double[][] result = new double[matrix1.length][];
		for (int i = 0; i < result.length; i++) {
			result[i] = matrix1[i].clone();
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] += matrix2[i][j];
			}

		}
		return result;
	}

	public boolean haveAllowedDimension(int[][] matrix1, int[][] matrix2) {
		int maxLengthM1 = 0;
		for (int[] a : matrix1) {
			maxLengthM1 = (maxLengthM1 <= a.length) ? a.length : maxLengthM1;
		}
		for (int[] a : matrix1) {
			if (maxLengthM1 == a.length) {
				continue;
			}
			return false;
		}

		int maxLengthM2 = 0;
		for (int[] b : matrix2) {
			maxLengthM2 = (maxLengthM2 <= b.length) ? b.length : maxLengthM2;
		}
		for (int[] b : matrix2) {
			if (maxLengthM2 == b.length) {
				continue;
			}
			return false;
		}

		return matrix1[0].length == matrix2.length;
	}

	public int[][] multiply(int[][] matrix1, int[][] matrix2) {
		int[][] matrixMul = new int[matrix1.length][matrix2[0].length];
		for (int i = 0; i < matrixMul.length; i++) {
			for (int j = 0; j < matrixMul[i].length; j++) {
				matrixMul[i][j] = 0;
				for (int k = 0; k < matrix1[0].length; k++) {
					matrixMul[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return matrixMul;
	}
}
