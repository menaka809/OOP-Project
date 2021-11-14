package Entity;

public class SellerUserInformation {
	
	private String firstName;
	private String lastName;
	private String nic;
	private String	email;
	private String phone;
	private String address;
	private String postalCode;
	private String company_Name;
	private String  company_Address;
	private String company_Mobile;
	private String	password;
	public SellerUserInformation(String firstName, String lastName, String nic, String email, String phone,
			String address, String postalCode, String company_Name, String company_Address, String company_Mobile,
			String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nic = nic;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.postalCode = postalCode;
		this.company_Name = company_Name;
		this.company_Address = company_Address;
		this.company_Mobile = company_Mobile;
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
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public String getCompany_Address() {
		return company_Address;
	}
	public String getCompany_Mobile() {
		return company_Mobile;
	}
	public String getPassword() {
		return password;
	}


}
