package src.homework4_1_5;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(2012, 2, 28);
		System.out.println(date1);
		System.out.println(date1.nextDay());
		System.out.println(date1.nextDay());
		System.out.println(date1.nextMonth());
		System.out.println(date1.nextYear());

		MyDate date2 = new MyDate(2012, 1, 2);
		System.out.println(date2);
		System.out.println(date2.previousDay());
		System.out.println(date2.previousDay());
		System.out.println(date2.previousMonth());
		System.out.println(date2.previousYear());

		MyDate date3 = new MyDate(2012, 2, 29);
		System.out.println(date3);
		System.out.println(date3.previousYear());
	}

}
