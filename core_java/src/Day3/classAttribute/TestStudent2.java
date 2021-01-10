package Day3.classAttribute;
import Day3.beans.*;

public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student= new Student(101, "Gracia", "BTech");
		
		Student student2= new Student(102, "David", "Phd");
		
		Student student3= new Student(501, "Molly", "BPhram");
		
		Student student4= new Student(701, "Sam", "MA");
	
		Student[] arrayOfStudent= {student,student2,student3,student4};
		
		TestStudent2 testStudent=new TestStudent2();
		testStudent.displayAllStudent(arrayOfStudent);
		
	}
	
	public void displayAllStudent(Student[] arrayOfStudent) {
		for (Student student : arrayOfStudent) {
			System.out.println(student);
		}
	}
	
}
