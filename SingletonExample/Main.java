package SingletonExample;

public class Main {

	public static void main(String[] args) {
		System.out.println("Singleton");
		AppTimer timer = AppTimer.getInstance();
		timer.printTime();
		double sum = 0;
		long max = 1000000000L;
		for (long i=0;i<max;i++) {
			sum = sum + Math.sqrt(i);
			if(i == max/2) {
				timer.printTime();
			}
		}
		timer.printTime();
		System.out.println("fin");
	}
}
