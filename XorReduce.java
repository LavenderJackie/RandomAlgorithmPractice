import java.util.*;
public class XorReduce {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		ArrayList<Boolean> outs = new ArrayList<Boolean>();
		while(cases != 0) {
			boolean[] vals = new boolean[cases];
			int i = 0;
			while(i < cases) {
				vals[i] = getVal(vals, in.nextLine().split(" "));
				i++;
			}
			outs.add(vals[Integer.parseInt(in.nextLine())]);
			cases = Integer.parseInt(in.nextLine());
		}
		for(Boolean b : outs) {
			if(b) {
				System.out.println("T");
			}
			else {
				System.out.println("F");
			}
		}
		in.close();
	}
	public static boolean getVal(boolean[] val, String[] ins) {
		boolean a = true;
		boolean b = true;
		try {
			a = val[Integer.parseInt(ins[1])];
		}
		catch(Exception e) {
			switch(ins[1]) {
				case "T":
					a = true;
					break;
				case "F":
					a = false;
					break;
			}
		}
		try {
			b = val[Integer.parseInt(ins[2])];
		}
		catch(Exception e) {
			switch(ins[2]) {
				case "T":
					b = true;
					break;
				case "F":
					b = false;
					break;
			}
		}
		return a!=b;
	}
}