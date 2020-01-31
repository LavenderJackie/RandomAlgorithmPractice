import java.util.*;
public class Pathfinding {
	static final String[][] maze = {{"#","#","#","#","#","#","#","#","#","#"},
									{"#"," "," "," "," "," "," "," ","s","#"},
									{"#","#","#","#","#"," ","#","#","#","#"},
									{"#"," "," "," "," "," "," "," "," ","#"},
									{"#"," ","#","#","#"," ","#","#","#","#"},
									{"#"," ","#"," "," "," "," "," "," ","#"},
									{"#"," ","#"," ","#","#","#"," ","#","#"},
									{"#"," ","#"," ","#","e","#"," ","#","#"},
									{"#"," ","#"," ","#"," "," "," ","#","#"},
									{"#","#","#","#","#","#","#","#","#","#"}};
	
	public static void main(String[] args) {
		//System.out.println(findPath(findSaE()[0], findSaE()[1], 0));
		//MEGA OVERFLOW
		System.out.println(findPath(findSaE()[0], findSaE()[1],0));
	}
	
	public static void tick() {
		try {
			Thread.sleep(300);
		} catch(Exception e) {}
	}
	
	public static void show() {
		for(String[] ar : maze) {
			for(String s : ar) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
	
	public static Point[] findSaE() {
		Point[] set = new Point[2];
		for(int i = 0; i < maze.length; i++) {
			for(int j = 0; j < maze[i].length; j++) {
				if(maze[i][j].equals("s")) {
					set[0] = new Point(i,j);
				}
				if(maze[i][j].equals("e")) {
					set[1] = new Point(i,j);
				}
			}
		}
		return set;
	}
	
	public static boolean validMove(Point p) {
		return !maze[p.get()[0]][p.get()[1]].equals("#");
	}
	
	public static int cost(Point x, Point y) {
		return Math.abs(x.get()[0]-y.get()[0]) + Math.abs(x.get()[1]-y.get()[1]);
	}
	
	public static int findPath(Point c, Point e, int s) {
		if(c.equals(e)) {
			return s;
		}
		for(int i = -1; i < 2; i++) {
			for(int j = -1; j < 2; j++) {
				if(Math.abs(j+i)==1) {
					
				}
			}
		}
		return 0;
	}
	/*public static int findPath(Point c, Point e, int s) {
		if(c.equals(e)) {
			return s;
		}
		int smol = Integer.MAX_VALUE;
		if(validMove(new Point(c.get()[0]+1,c.get()[1]))) {
			int t = findPath(new Point(c.get()[0]+1,c.get()[1]), e, s+1);
			smol = smol > t ? t : smol;
		}
		if(validMove(new Point(c.get()[0]-1,c.get()[1]))) {
			int t = findPath(new Point(c.get()[0]-1,c.get()[1]), e, s+1);
			smol = smol > t ? t : smol;
		}
		if(validMove(new Point(c.get()[0],c.get()[1]+1))) {
			int t = findPath(new Point(c.get()[0],c.get()[1]+1), e, s+1);
			smol = smol > t ? t : smol;
		}
		if(validMove(new Point(c.get()[0]+1,c.get()[1]-1))) {
			int t = findPath(new Point(c.get()[0],c.get()[1]-1), e, s+1);
			smol = smol > t ? t : smol;
		}
		return smol;
	}*/
	
	private static class Point{
		int[] set = new int[2];
		public Point(int x, int y) {
			set[0] = y;
			set[1] = x;
		}
		public int[] get() {
			return set;
		}
	}
}
