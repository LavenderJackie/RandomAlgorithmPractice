import java.util.Scanner;
public class Prob3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean[] outs = new boolean[Integer.parseInt(in.nextLine())];
		int i = 0;
		while(i < outs.length) {
			String[] s = in.nextLine().split(" ");
			outs[i++] = Boolean.parseBoolean(s[0]) == Boolean.parseBoolean(s[1]);
		}
		for(boolean s: outs) {
			System.out.println(s);
		}
	}
}