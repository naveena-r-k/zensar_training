package beans;

public class Student {

	private int rollNum;
	private String name;
	private String course;
	private int duration;
	private int age;
	
	public Student() {
		
	}
	
	public Student(int rollNum, String name, String course, int duration, int age) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.course = course;
		this.duration = duration;
		this.age = age;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", course=" + course + ", duration=" + duration
				+ ", age=" + age + "]";
	}
	
	
}
