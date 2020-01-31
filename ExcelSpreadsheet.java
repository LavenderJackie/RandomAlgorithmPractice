import java.util.*;
public class ExcelSpreadsheet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> outs = new ArrayList<String>();
		String thing = in.nextLine();
		while(!thing.equals("R0C0")) {
			int r = Integer.parseInt(thing.substring(1,thing.indexOf("C")));
			int c = Integer.parseInt(thing.substring(thing.indexOf("C")+1));
			outs.add(analyze(c)+r);
			thing = in.nextLine();
		}
		for(String s : outs) {
			System.out.println(s);
		}
		in.close();
	}
	public static String analyze(int c) {
		for(int i = 0; i < 27; i++) {
			for(int j = 0; j < 27; j++) {
				for(int k = 0; k < 27; k++) {
					for(int l = 0; l < 27; l++) {
						for(int m = 0; m < 27; m++) {
							for(int n = 1; n < 27; n++) {
								if(n+26*(m+26*(l+26*(k+26*(j+26*(i))))) == c) {
									return ("" + toC(i) + toC(j) + toC(k) + toC(l) + toC(m) + toC(n)).trim();
								}
							}
						}
					}
				}
			}
		}
		return "";
	}
	public static char toC(int x) {
		if(x == 0) {
			return ' ';
		}
		return (char)(x+64);
	}
}
