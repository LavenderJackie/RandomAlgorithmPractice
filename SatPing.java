import java.util.*;
public class SatPing {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] pings = in.nextLine().split("");
		ArrayList<String> outs = new ArrayList<String>();
		while(pings.length>1) {
			ArrayList<Integer> sats = new ArrayList<Integer>();
			for(int i = 1; i < pings.length; i++) {
				if((pings[i].equals("1") && countFactors(i,sats))||(pings[i].equals("0") && !countFactors(i,sats))) {
					sats.add(i);
				}
			}
			outs.add(satOut(sats));
			pings = in.nextLine().split("");
		}
		for(String s : outs) {
			System.out.println(s);
		}
		in.close();
	}
	public static String satOut(ArrayList<Integer> x) {
		for(int i = 1; i < x.size(); i++) {
			for(int j = i; j > 0; j--) {
				if(x.get(j)<x.get(j-1)) {
					x.add(j-1,x.remove(j));
				}
			}
		}
		String o = "";
		for(Integer i : x) {
			o = o + i + " ";
		}
		return o.trim();
	}
	public static boolean countFactors(int x, ArrayList<Integer> l) {
		int count = 0;
		for(Integer t : l) {
			if(x % t == 0) {
				count++;
			}
		}
		return count%2==0;
	}
}