import java.util.*;
public class PuzzleBoard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> outs = new ArrayList<String>();
		String state = in.nextLine();
		while(!state.equals("-1")) {
			String[] nums = state.split(" ");
			int count = 0;
			for(int i = 0; i < nums.length-1; i++) {
				for(int j = i+1; j < nums.length; j++) {
					if(Integer.parseInt(nums[i]) < Integer.parseInt(nums[j]) && Integer.parseInt(nums[j]) != 0) {
						count++;
					}
				}
			}
			if(!nums[nums.length-1].equals("8")) {
				count++;
			}
			if(count%2==0) {
				outs.add("REACHABLE "+count);
			}
			else {
				outs.add("UNREACHABLE "+count);
			}
			state = in.nextLine();
		}
		for(String s : outs) {
			System.out.println(s);
		}
		in.close();
	}
}
