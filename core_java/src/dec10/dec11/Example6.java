package dec10.dec11;

public class Example6 {

	public static void main(String args[]) {
        String str = (String) returnStringAsArray()[-1 + 1 * 2];
        System.out.println(str);
    }

    public static Object[] returnStringAsArray() {
        return new String[] { "Java", "Quiz" };
    }
}
