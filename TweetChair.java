import java.util.*;
public class TweetChair {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		ArrayList<String> handles = new ArrayList<String>();
		handles.add("@vandeldensa");
		while(cases-->0) {
			String[] tweet = in.nextLine().split(" ");
			boolean nta = false;
			for(String s : tweet) {
				if(handles.contains(s)) {
					nta = true;
					break;
				}
			}
			if(nta) {
				for(String s : tweet) {
					if(s.contains("@") && !handles.contains(s)) {
						handles.add(s);
					}
				}
			}
		}
		for(int i = 1; i < handles.size(); i++) {
			for(int j = i; j > 0; j--) {
				if(handles.get(j).compareTo(handles.get(j-1))<0) {
					handles.add(j-1,handles.remove(j));
				}
			}
		}
		for(String s : handles) {
			System.out.println(s);
		}
		in.close();
	}
}