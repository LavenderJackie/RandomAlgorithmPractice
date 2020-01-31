
public class Sorting {
	public static void main(String[] args) {
		int[] s = {8,2,3,5,1,9,16,4};
		selertion(s);
		/*for(int x: s) {
			System.out.println(x);
		}*/
		
	}
	public static void selection(int[] x) {
		for(int i = 0; i<x.length; i++) {
			int minDex = i;
			for(int j = i+1; j<x.length; j++) {
				if(x[j]<x[minDex]) {
					minDex = j;
				}
			}
			int temp = x[i];
			x[i] = x[minDex];
			x[minDex] = temp;
		}
	}
	public static void insertion(int[] x) {
		for(int i = 1; i<x.length; i++) {
			for(int j = i; j>0; j--) {
				if(x[j-1]>x[j]) {
					int temp = x[j];
					x[j] = x[j-1];
					x[j-1] = temp;
				}
			}
		}
	}
	public static void selertion(int[] x) {
		for(int i = 0; i<x.length; i++) {
			for(int j = i+1; j<x.length; j++) {
				if(x[j]<x[i]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
					for(int a : x) {
						System.out.print(a);
					}
					System.out.println();
				}
			}
		}
	}
}
