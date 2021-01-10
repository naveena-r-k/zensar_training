package Day3.myExample;

public class CompanyInfo {

	private int id;
	private String name;
	
	public CompanyInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CompanyInfo [id=" + id + ", name=" + name + "]";
	}
	
	
}
