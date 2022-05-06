package src.lab5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerToWords {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		sc.close();
		System.out.println(toVietnamese(number));
	}

	private static final Map<Integer, String> singleDigits = new HashMap<Integer, String>();

	static {
		singleDigits.put(0, "không");
		singleDigits.put(1, "một");
		singleDigits.put(2, "hai");
		singleDigits.put(3, "ba");
		singleDigits.put(4, "bốn");
		singleDigits.put(5, "năm");
		singleDigits.put(6, "sáu");
		singleDigits.put(7, "bảy");
		singleDigits.put(8, "tám");
		singleDigits.put(9, "chín");
	}

	private static final String handleUnderOneThousand(int number) {
		StringBuilder builder = new StringBuilder();
		int x = number;
		int m = x / 100;
		int r = x % 100;

		if (m > 0) {
			builder.append(singleDigits.get(m)).append(" trăm ");
			x = x % 100;
		}

		if (r > 0 && m > 0) {
			if (x < 10) {
				builder.append("linh ").append(singleDigits.get(x));
			} else if (x == 10) {
				builder.append("mười ").append(singleDigits.get(x));
			} else {
				m = x / 10;
				r = x % 10;
				if (r == 0) {
					builder.append(singleDigits.get(m)).append(" mươi ");
				} else if (r == 1) {
					builder.append(singleDigits.get(m)).append(" mươi ").append("mốt");
				} else {
					builder.append(singleDigits.get(m)).append(" mươi ").append(singleDigits.get(r));
				}
			}
		}
		return builder.toString();
	}

	public static final String toVietnamese(int number) {
		int x = number;
		if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
			throw new IllegalArgumentException(
					"Number has to be <= Integer.MAX_VALUE and >= Integer.MIN_VALUE. number = " + x);
		}

		StringBuilder builder = new StringBuilder();
		if (x == 0) {
			builder.append(singleDigits.get(x));
			return builder.toString();
		}
		boolean billion = false;
		boolean million = false;
		boolean thousand = false;
		if (x < 0) {
			builder.append("âm");
			x *= -1;
		}
		int m = x / 1000000000;
		if (m > 0) {
			billion = true;
			builder.append(handleUnderOneThousand(m)).append("tỷ");
			x = x % 1000000000;
		}
		m = m / 1000000;
		if (m > 0) {
			if (billion) {
				builder.append(" ");
			}
			million = true;
			builder.append(handleUnderOneThousand(m)).append(" triệu");
			x = x % 1000000;
		}
		m = x / 1000;
		if (m > 0) {
			if (billion || million) {
				builder.append(" ");
			}
			thousand = true;
			builder.append(handleUnderOneThousand(m)).append(" nghìn");
			x = x % 1000;
		}
		if (billion || million || thousand && x != 0) {
			builder.append(" ");
		}
		builder.append(handleUnderOneThousand(x));
		return builder.toString();
	}
}
