package Day3.beans;

public class RegistrationForm {

	private String name;
	private String address;
	private int mobNum;
	private String emailId;
	
	public RegistrationForm() {
		
	}

	
	public RegistrationForm(String name, String address, int mobNum, String emailId) {
		super();
		this.name = name;
		this.address = address;
		this.mobNum = mobNum;
		this.emailId = emailId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobNum() {
		return mobNum;
	}
	public void setMobNum(int mobNum) {
		this.mobNum = mobNum;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "RegistrationForm [name=" + name + ", address=" + address + ", mobNum=" + mobNum + ", emailId=" + emailId
				+ "]";
	}
	
	
	

}
