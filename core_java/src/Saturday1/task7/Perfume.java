package Saturday1.task7;
/*Nazneen*/
public class Perfume {

	 private String perfumeName;
	   private String brand;
	   private double net_Content;
	   private int price;
	   
	   Perfume()
	   {
		   
	   }

	public Perfume(String perfumeName, String brand, double net_Content, int price) {
		super();
		this.perfumeName = perfumeName;
		this.brand = brand;
		this.net_Content = net_Content;
		this.price = price;
	}

	public String getPerfumeName() {
		return perfumeName;
	}

	public void setPerfumeName(String perfumeName) {
		this.perfumeName = perfumeName;
	}

	public String getbrand() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public double getNet_Content() {
		return net_Content;
	}

	public void setNet_Content(double net_Content) {
		this.net_Content = net_Content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BeanPerfume [perfumeName=" + perfumeName + ", brand=" + brand + ", net_Content=" + net_Content + ", price="
				+ price + "]";
	}
}
