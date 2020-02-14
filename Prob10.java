import java.util.*;
public class Prob10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] cases = new String[Integer.parseInt(in.nextLine())];
		int i = 0;
		while(i < cases.length) {
			int shift = Integer.parseInt(in.nextLine());
			String[] words = in.nextLine().split(" ");
			cases[i++] = analyze(shift, words);
		}
		for(String s : cases) {
			System.out.println(s);
		}
	}
	public static String analyze(int s, String[] w) {		//what if shift is negative??
		String temp = "";		//a is 97, z is 122
		for(int i = 0; i < w.length; i++) {
			for(int j = 0; j < w[i].length(); j++) {
				char c = w[i].charAt(j);
				for(int k = 0; k < s; k++) {
					c--;
					if(c < 97) {
						c = 122;
					}
				}
				temp+=c;
			}
			temp+=" ";
		}
		return temp.trim();
	}
}
