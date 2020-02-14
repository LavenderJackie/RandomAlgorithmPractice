import java.util.*;
public class Prob1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] outs = new String[Integer.parseInt(in.nextLine())];
		int i = 0;
		while(i < outs.length) {
			outs[i++] = in.nextLine().toLowerCase();
		}
		for(String s: outs) {
			System.out.println(s);
		}
	}
}