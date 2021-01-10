package dec10;

public class Example1 {

	public static void main(String[] args) {

	      // returns the Class object associated with this class
	      Example1 cl = new Example1();
	      Class c1Class = cl.getClass();
	      System.out.println("Runtime class:"+cl.getClass());

	      // returns the name of the class
	      String name = c1Class.getName();
	      System.out.println("Class Name = " + name);
	   }
}
