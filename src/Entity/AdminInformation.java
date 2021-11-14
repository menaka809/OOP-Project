package Entity;

public class AdminInformation {
	
	private String nic;
	private String password;
	public AdminInformation(String nic, String password) {
		super();
		this.nic = nic;
		this.password = password;
	}
	public String getNic() {
		return nic;
	}
	public String getPassword() {
		return password;
	}
	

}
