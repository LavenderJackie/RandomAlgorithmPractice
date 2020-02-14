import java.util.Scanner;
public class Prob6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] outs = new double[Integer.parseInt(in.nextLine())];
		int i = 0;
		while(i < outs.length) {
			outs[i++] = (Math.round(((40075)+2*Math.PI*(in.nextInt()))*10))/10.;
		}
		for(double s: outs) {
			System.out.println(s);
		}
	}
}