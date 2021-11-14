package Entity;

public class AccountantInformation {
	
	private String firstName;
	private String lastName;
	private String nic;
	private String	email;
	private String password;
	public AccountantInformation(String firstName, String lastName, String nic, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nic = nic;
		this.email = email;
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getNic() {
		return nic;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}

	
}
