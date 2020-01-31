import java.util.*;
public class Clock {
	private int sec, min, hr;
	private Scanner stop;
	public Clock() {
		sec = 0;
		min = 0;
		hr = 0;
		stop = new Scanner(System.in);
		start();
	}
	public void start() {
		while(true) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
			sec++;
			if(sec>=60) {
				min++;
				sec = 0;
				if(min>=60) {
					hr++;
					min = 0;
				}
			}
			System.out.println(""+hr+":"+min+":"+sec);
		}
	}
	public static void main(String[] args) {
		Clock clock = new Clock();
	}
}
