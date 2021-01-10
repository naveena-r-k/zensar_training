package Saturday1.Task1;

/*Tania*/

public class College {

	String type;
	   String city;
	   int rank;
	   
	   public void College()
	   {
		   
	   }
	public College(String type, String city, int rank) {
		super();
		this.type = type;
		this.city = city;
		this.rank = rank;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "College [type=" + type + ", city=" + city + ", rank=" + rank + "]";
	}
	   

	   
}
