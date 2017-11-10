package SingletonExample;

public class AppTimer {
	static {
		timer = new AppTimer();
	}
	
	private static AppTimer timer;
	private int time = 0;
	
	private AppTimer() {
		Thread runTime = new Thread(new Runnable(){
			@Override
			public void run() {
				while(time<10) {
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					time++;
				}
			}
		});
		runTime.start();
	}

	public static AppTimer getInstance() {
		return timer;
	}
	
	public void printTime() {
		System.out.println(time);
	}
}