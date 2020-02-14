import java.util.*;
public class Enig {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tests = Integer.parseInt(in.nextLine());
		int[] reflect = {3,6,8,0,5,4,1,9,2,7};
		while(tests-->0) {
			ArrayList<Integer> left = new ArrayList<Integer>();
			ArrayList<Integer> mid = new ArrayList<Integer>();
            ArrayList<Integer> right = new ArrayList<Integer>();
            fillList(left, Integer.parseInt(in.next()));
            int shift = Integer.parseInt(in.next());
            while(shift-->0){
               shiftList(left);
            }
            fillList(mid, Integer.parseInt(in.next()));
            shift = Integer.parseInt(in.next());
            while(shift-->0){
               shiftList(mid);
            }
            fillList(right, Integer.parseInt(in.next()));
            shift = Integer.parseInt(in.next());
            while(shift-->0){
               shiftList(right);
            }
            String orig = in.next();
            ArrayList<Integer> fin = new ArrayList<Integer>();
            for(int i=1; i<=orig.length(); i++){
               fin.add(left.indexOf(mid.indexOf(right.indexOf(reflect[right.get(mid.get(left.get(Integer.parseInt(orig.substring(i-1,i)))))]))));
               shiftList(right);
               if(i%10==0){
                  shiftList(mid);
               }
               if(i%100==0){
                  shiftList(left);
               }
            }
            for(Integer f: fin){
               System.out.print(f);
            }
            System.out.println();

		}
	}
	public static void fillList(ArrayList<Integer> x, int rotor){
		if(rotor==1){
	        x.addAll(Arrays.asList(1,3,6,0,5,4,8,7,9,2));
	    }
	    else if(rotor==2){
	        x.addAll(Arrays.asList(0,3,5,2,6,9,1,4,8,7));
	    }
	    else if(rotor==3){
	        x.addAll(Arrays.asList(5,9,1,7,3,8,0,2,4,6));
	    }
	    else{
	    	x.addAll(Arrays.asList(1,6,5,2,9,0,7,4,3,8));
	    }
	}
	public static void shiftList(ArrayList<Integer> x){
		x.add(0,x.remove(x.size()-1));
	    int i=-1;
	    while(i++<x.size()-1){
	    	x.set(i,(x.get(i)+1)%10);
	    }
	}
}