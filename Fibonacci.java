import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] f = new int[n];
		if(n==2 || n==1) {
			System.out.println(1);
		}
		else {
			f[0] = 1;
			f[1] = 1;
			for(int i = 2; i<n; i++) {
				f[i] = f[i-1]+f[i-2];
			}
			System.out.println(f[n-1]);
		}
		in.close();
	}
}