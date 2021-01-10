package Day2.methods;

public class TestExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example6 example6=new Example6();
		String[] names= {"John","Derek","SAm","Peter"};
		example6.displayNamesArray(names);

		Example6 example62=new Example6();
		String[] names1=example62.getArrayOfNames();
		for (String x : names) {
			System.out.println(x);
		}
	}


}
