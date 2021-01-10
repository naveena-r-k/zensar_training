package day7.myExample;

public class EgThread extends Thread{

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EgThread thread= new EgThread();
		EgThread thread2= new EgThread();
		
		thread.start();
		thread2.start();
	}

}
