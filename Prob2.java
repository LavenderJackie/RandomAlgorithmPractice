import java.util.Scanner;
public class Prob2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] outs = new int[in.nextInt()];
		int i = 0;
		while(i < outs.length) {
			int a = in.nextInt();
			int b = in.nextInt();
			if(a==b) {
				outs[i++] = 4*a;
			}
			else {
				outs[i++] = a+b;
			}
		}
		for(int x : outs) {
			System.out.println(x);
		}
	}
}