package dec10.dec11;

public class Example3 {

	public static void main(String[] args) {
        class Tutorial {
            public String name;

            public Tutorial(String tutorial) {
                name = tutorial;
            }
        }

        Object obj = new Tutorial("Java Quiz");
        Tutorial tutorial = (Tutorial) obj;
        System.out.println(tutorial.name);
    }
}
