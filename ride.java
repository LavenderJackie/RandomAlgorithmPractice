/* 
 * ID: jjellen1
 * LANG: JAVA
 * TASK: ride
 */
import java.util.*;
import java.io.*;
public class ride{
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner in = new Scanner(new File("ride.in"));
		FileWriter outsie = new FileWriter("ride.out");
		int[] outs = new int[2];
		for(int i = 0; i < 2; i++) {
			outs[i] = valueOf(in.nextLine());
		}
		if(outs[0]==outs[1]) {
			outsie.write("GO");
		}
		else {
			System.out.println("STAY");
		}
		in.close();
		outsie.close();
	}
	public static int valueOf(String s) {
		int fin = 1;
		for(int i = 0; i < s.length(); i++) {
			fin = fin *(int)(s.charAt(i)-64);
		}
		return fin%47;
	}
}
