import java.util.*; 
public class PythagoreanTripleFinder { 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("type two integers separated by a \",\"");
		System.out.println("ex: 6,2");
		try {
			finder(in.nextLine());
		}
		catch(Exception e) {
			System.out.println("WHAT HAVE YOU DONE!!!!!!\nYOU RUINED EVERYTHING!!!");
		}
		in.close();
	}
	public static void finder(String nums) {
		int u = Integer.parseInt(nums.substring(0,nums.indexOf(",")));
		int v = Integer.parseInt(nums.substring(nums.indexOf(",")+1));
		System.out.println("("+(int)(Math.abs(Math.pow(u,2)-Math.pow(v, 2)))+","+(2*u*v)+","+(int)(Math.pow(u,2)+Math.pow(v, 2))+")");
	}
}
