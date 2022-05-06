package src.homework3_2_2;
public class AuthorAgain {

	private String name;
	private char gender;
	private String email;

	public AuthorAgain(String name, String email, char gender) {
		this.name = name;
		this.gender = gender;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AuthorAgain [name=" + name + ", gender=" + gender + ", email=" + email + "]";
	}
}
