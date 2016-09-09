package geometry;
public abstract class Shape {
	
	public Point2D refPoint;
	
	public Shape() {
		refPoint = new Point2D();
	}
	
	public Shape(Point2D p) {
		refPoint = new Point2D(p);
	}
	
    public double distanceTo(Shape s) {
    	return refPoint.distanceTo(s.refPoint);
    }
	
    protected abstract Point2D computeRefPoint();
}
