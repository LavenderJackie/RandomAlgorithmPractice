import java.util.*;
public class TrumpTweets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tweets = in.nextInt();
		int days = in.nextInt();
		double avg = Math.round((10.*tweets)/days);		//mostly correct, make sure it can round up...
		avg = ((int)avg)/10.;
		System.out.println("The Average Number of Tweets is "+ avg +" per Day!");
		in.close();
	}
}