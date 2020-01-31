import java.util.*;
public class InputSplitting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		String[][] splits = new String[cases][3];
		while(cases-->0) {
			splits[cases] = in.nextLine().split(" ");
		}
		for(String[] s: splits) {
			for(String p: s) {
				System.out.print(p);
			}
			System.out.println();
		}
		in.close();
	}
}