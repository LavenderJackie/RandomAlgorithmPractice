import java.util.*;
public class Prob21 {
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		String[] cases = new String[Integer.parseInt(in.nextLine())];
		for(int i = 0; i < cases.length; i++) {
			String[] vals = in.nextLine().split(" ");
			Line spyCam = new Line(new Point(Integer.parseInt(vals[0]),Integer.parseInt(vals[1])),
									new Point(Integer.parseInt(vals[2]),Integer.parseInt(vals[3])));
			int walls = Integer.parseInt(vals[4]);
			boolean sect = false;
			for(int j = 0; j < walls; j++) {
				String[] pts = in.nextLine().split(" ");
				Line l = new Line(new Point(Integer.parseInt(pts[0]),Integer.parseInt(pts[1])),
						new Point(Integer.parseInt(pts[2]),Integer.parseInt(pts[3])));
				if(l.intersects(spyCam)) {
					sect = true;
					break;
				}
			}
			cases[i] = sect? "NO": "YES";
		}
		for(String s: cases) {
			System.out.println(s);
		}
		in.close();*/
		System.out.println((new Line(new Point(0,0), new Point(5,5))).intersects(new Line(new Point(4,1), new Point(1,4))));
	}
	
	static class Point {
		final int[] p = new int[2];
		public Point(int xx, int yy) {
			p[0] = xx;
			p[1] = yy;
		}
		public int[] getP() {
			return p;
		}
	}
	static class Line {
		final Point[] p = new Point[2];
		public Line(Point p1, Point p2) {
			p[0] = p1;
			p[1] = p2;
		}
		public boolean isVertical() {
			return p[0].getP()[1] == p[1].getP()[1] ? true : false;
		}
		public double getSlope() {
			return ((double)(p[1].getP()[1] - p[0].getP()[1]))/(p[1].getP()[0] - p[0].getP()[0]);
		}
		public Point[] getPoints() {
			return p;
		}
		public boolean intersects(Line l) {
			if(isVertical() && l.isVertical()) {
				return l.getPoints()[0].getP()[0] == p[0].getP()[0] ? true : false;
			}
			else if(l.isVertical()) {
				
			}
			else if(isVertical()) {
				
			}
			return false;
		}
	}
}
