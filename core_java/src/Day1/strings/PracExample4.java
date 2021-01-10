package Day1.strings;

public class PracExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt="Zensar Technologies";
		int options=4;
		switch (options) {
		case 1:
			System.out.println("String:"+txt);
			System.out.println("UpperCase:"+txt.toUpperCase());
			break;
		case 2:
			System.out.println("String:"+txt);
			System.out.println("LowerCase:"+txt.toLowerCase());
			break;
		case 3:
			System.out.println("String:"+txt);
			System.out.println("Get Length:"+txt.length());
			break;
		case 4:
			System.out.println("String:"+txt);
			System.out.println("Replace String:"+txt.replace('s', 'S'));
			break;
		default:
			System.out.println("Invalid options");
		}
	}

}
