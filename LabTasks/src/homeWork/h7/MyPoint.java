package homeWork.h7;

public class MyPoint {
	private int x=0;
	private int y=0;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int[] getXY() {
		int[] xy = new int[2];
		xy[0] = x;
		xy[1] = y;
		return xy;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
	public double distance(int x, int y) {
		double dist;
		dist=Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
		return dist;
	}
	public double distance(MyPoint another) {
		double dist;
		dist=Math.sqrt(Math.pow((another.x-x),2)+Math.pow((another.y-y),2));
		return dist;
	}
	public double distance() {
		double dist;
		dist=Math.sqrt(Math.pow((x-0),2)+Math.pow((y-0),2));
		return dist;
	}
}
