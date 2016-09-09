package geometry;

public class Point2D {
	
	private double x;
	private double y;

	public Point2D() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D(Point2D p) {
		this(p.getX(), p.getY());
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}	
	
	public void change(double newX, double newY) {
		this.x = newX;
		this.y = newY;
	}
	
	public void move(double dX, double dY) {
		this.x += dX;
		this.y += dY;
	}
	
	public double distanceTo(Point2D p) {
		return Math.sqrt( (this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
	}
	
	@Override
        public String toString() {
    	        return "(" + this.x + ", " + this.y + ")";
    }	
}
