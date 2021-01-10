package day9.mcq;

public class Example1 {

	int a;
	int b;
	
	public void f() {
		a=0;
		b=0;
		int[] c= {0};
		g(b,c);
		System.out.println("a:"+a+" b:"+b+" c:"+c[0]);
	}
	
	public void g(int b, int[] c) {
		a=1;
		b=1;
		c[0]=1;
		System.out.println("a:"+a+"b:"+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj= new Example1();
		obj.f();
	}

}
