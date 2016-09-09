package geometry.shapes;

import geometry.Point2D;
import geometry.Shape;

public class Circle extends Shape {
	Point2D midPoint = new Point2D(0.0, 0.0);
	double radius = 1.0;
	
	public Circle() {
		refPoint = new Point2D(midPoint);
	}
	
	public Circle(Point2D midPoint, double radius) {
		super(midPoint);
		this.midPoint = midPoint;
		this.radius = radius;
	}
	
	@Override
        public String toString() {
		return "Kreis\nMittelpunkt " + this.midPoint + " \nRadius " + this.radius+ "\nReferenzpunkt " + this.refPoint;
	}
	
	@Override	
        protected Point2D computeRefPoint() {
    	     return midPoint;
    }

}
