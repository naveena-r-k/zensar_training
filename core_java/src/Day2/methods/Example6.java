package Day2.methods;

public class Example6{
	
	public void displayNamesArray(String[] names) {
		for (String x : names) {
			System.out.println(x);
		}
	}
	
	public String[] getArrayOfNames() {
		String[] names= {"John","Derek","SAm","Peter"};
		return names;
	}
}