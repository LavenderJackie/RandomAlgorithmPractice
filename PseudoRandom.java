import java.util.ArrayList;

public class PseudoRandom {
	static ArrayList<Double> nums = new ArrayList<Double>();
	public static void main(String[] args) {
		nums.add(.60298273402);
		for(int i = 1; i < 100; i++) {
			nums.add(linear(nums.get(i-1)));
		}
		for(Double d : nums) {
			System.out.println(d);
		}
	}
	public static double linear(double last) {
		return 3.5749512391729301*last*(1-last);
	}
}
