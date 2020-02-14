import java.util.*;
public class Prob11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] ins = new int[Integer.parseInt(in.nextLine())];
		int i = 0;
		while(i < ins.length) {
			ins[i++] = Integer.parseInt(in.nextLine());
		}
		for(int x : ins) {
			for(int j = 0; j < (int)Math.pow(2, x); j++) {
				String s = "";
				int temp = j;
				for(int k = 0; k < x; k++) {
					s = "" + (temp%2) + s;
					temp/=2;
				}
				System.out.println(s);
			}
		}
		in.close();
	}
}
