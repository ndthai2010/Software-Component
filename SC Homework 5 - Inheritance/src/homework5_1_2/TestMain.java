package src.homework5_1_2;

public class TestMain {

	public static void main(String args[]) {
		Person person = new Person("A", "Hanoi");
		System.out.println(person);
		
		Person student = new Student("B", "TPHCM", "Java", 2021, 100);
		System.out.println(student);
		
		Staff staff = new Staff("C", "Da Nang", "DHQGHN", 1000);
		System.out.println(staff);
		
		Person staff1 = new Staff("C", "123 HN", "b", 1550);
		System.out.println(staff1);
	}
}
