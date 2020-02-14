import java.util.Scanner;
public class Prob4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] outs = new String[Integer.parseInt(in.nextLine())];
		int i = 0;
		while(i < outs.length) {
			String[] s = in.nextLine().split(" ");
			int speed = Integer.parseInt(s[0]);
			if(s[1].equals("true")) {
				if(speed<=65) {
					outs[i++] = "no ticket";
				}
				else if(speed>=66 && speed<=85) {
					outs[i++] = "small ticket";
				}
				else {
					outs[i++] = "big ticket";
				}
			}
			else {
				if(speed<=60) {
					outs[i++] = "no ticket";
				}
				else if(speed>=61 && speed<=80) {
					outs[i++] = "small ticket";
				}
				else {
					outs[i++] = "big ticket";
				}
			}
		}
		for(String s: outs) {
			System.out.println(s);
		}
	}
}