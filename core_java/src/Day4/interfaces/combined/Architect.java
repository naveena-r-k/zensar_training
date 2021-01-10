package Day4.interfaces.combined;

public class Architect extends Human implements Artist, MathGenius{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("architect can draw very well");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("architect is very good in calculation");
	}

	

}
