package Class2_java8;

public class Counter implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Counter :"+i);
		}
	}
}
