import java.util.*;
public class RPS {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		ArrayList<String> fin = new ArrayList<String>();
		while(cases-->0) {
			String[] plays = in.nextLine().split(" ");
			int r = 0, p = 0, s = 0;
			for(String pl : plays) {
				switch (pl) {
					case "R":
						r++;
						break;
					case "P":
						p++;
						break;
					case "S":
						s++;
						break;
				}
			}
			if(r==1&&p==0) {
				fin.add("ROCK");
			}
			else if(p==1&&s==0) {
				fin.add("PAPER");
			}
			else if(s==1&&r==0) {
				fin.add("SCISSORS");
			}
			else {
				fin.add("NO WINNER");
			}
		}
		for(String f : fin) {
			System.out.println(f);
		}
		in.close();
	}
}
