import java.util.*;
public class SnakeSim {
	static int ticks = 0;
	static final int boardSize = 10;
	public static void main(String[] args) {
		int headx = 0;
		int heady = 0;
		int score = 1;
		boolean crash = false;
		ArrayList<Point> tail = new ArrayList<Point>();
		while(!crash) {
			int	goalx = (int)(Math.random()*boardSize);
			int goaly = (int)(Math.random()*boardSize);
			while(inTail(new Point(goaly, goalx), new Point(heady, headx), tail)) {
				goalx = (int)(Math.random()*boardSize);
				goaly = (int)(Math.random()*boardSize);
			}
			int dy = simpleDs(goaly - heady, goalx - headx)[0];
			int dx = simpleDs(goaly - heady, goalx - headx)[1];
			while(headx != goalx && heady != goaly) {		//move snake to goal
				for(int j = 0; j < Math.abs(dy); j++) {
					tail.add(new Point(heady, headx));
					if(tail.size()>=score) {
						tail.remove(0);
					}
					heady += (int)(dy/(Math.abs(dy)));
					tick();
					for(Point p : tail) {
						if(p.getP()[1] == headx && p.getP()[0] == heady){
							crash = true;
							break;
						}
					}
					if(crash) {
						break;
					}
					show(headx, heady, tail, goalx, goaly);
					
				}
				if(crash) {
					break;
				}
				for(int j = 0; j < Math.abs(dx); j++) {
					tail.add(new Point(heady, headx));
					if(tail.size()>=score) {
						tail.remove(0);
					}
					headx += (int)(dx/(Math.abs(dx)));
					tick();
					for(Point p : tail) {
						if(p.getP()[1] == headx && p.getP()[0] == heady){
							crash = true;
							break;
						}
					}
					if(crash) {
						break;
					}
					show(headx, heady, tail, goalx, goaly);
				}
			}
			if(crash) {
				show(headx, heady, tail, goalx, goaly);
				System.out.println("CRASH!!!");
				System.out.println("SCORE: "+score);
				System.out.println("TICKS: "+ticks);
			}
			score++;
		}
	}
	public static int[] simpleDs(int y, int x) {
		for(int i = 1; i < Math.min(y, x); i++) {
			if(y%i == 0 && x%i == 0) {
				y/=i;
				x/=i;
			}
		}
		int[] o = {y,x};
		return o;
	}
	public static void tick() {		//pulses used for outputs
		try {
			Thread.sleep(100);
		}catch(Exception e) {}
		ticks++;
	}
	public static boolean inTail(Point p, Point h, ArrayList<Point> t) {		//checks if goal is in the tail
		boolean ret = false;
		for(Point po : t) {
			ret = po.equals(p) ? true: ret;
		}
		ret = p.equals(h)? true : ret;
		return ret;
	}
	public static void show(int hx, int hy, ArrayList<Point> t, int gx, int gy) {	//visualize in output
		char[][] graph = new char[boardSize][boardSize];
		for(Point p : t) {
			graph[p.getP()[0]][p.getP()[1]] = 't';
		}
		graph[gy][gx] = 'g';
		graph[hy][hx] = 'h';
		System.out.println();
		for(int i = 0; i < boardSize; i++) {
			for(int j = 0; j < boardSize; j++) {
				graph[i][j] = (graph[i][j] != 'h' && graph[i][j] != 't' && graph[i][j] != 'g')?'~':graph[i][j];
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
	}
	private static class Point{				//couldnt make an arraylist of Integer[]s
		private int[] pair = new int[2];
		public Point(int x, int y) {
			pair[0] = x;
			pair[1] = y;
		}
		public int[] getP() {
			return pair;
		}
	}
}