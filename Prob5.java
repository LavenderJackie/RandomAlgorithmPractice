import java.util.Scanner;
public class Prob5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean[] outs = new boolean[Integer.parseInt(in.nextLine())];
		int i = 0;
		while(i < outs.length) {
			String[] nums = in.nextLine().split(" ");
			if(Integer.parseInt(nums[0])>=(Integer.parseInt(nums[2])-5*Integer.parseInt(nums[1])) && Integer.parseInt(nums[0])>=Integer.parseInt(nums[2])%5) {
				outs[i++] = true;
			}
			else {
				outs[i++] = false;
			}
		}
		for(boolean s: outs) {
			System.out.println(s);
		}
	}
}