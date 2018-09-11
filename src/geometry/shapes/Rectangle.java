package geometry.shapes;

import geometry.Point2D;
import geometry.Shape;

public class Rectangle extends Shape {

	private Point2D base = new Point2D(0.0, 0.0);
	
	private double width = 1.0;
	
	private double height = 1.0;
	
	public Rectangle() {
            this.refPoint = this.computeRefPoint();
	}
	
	public Rectangle(Point2D base, double width, double height) {
		this.base = base;
		this.width = width;
		this.height = height;
        this.refPoint = this.computeRefPoint();
	}
	
	public Rectangle(Point2D base, double dimension) {
		this.base = base;
		this.width = dimension;
		this.height = dimension;
        this.refPoint = this.computeRefPoint();
	}
	
	@Override
        public String toString() {
		return "Rechteck\nLinke untere Ecke " + this.base + " , Breite " + this.width + " , Höhe " 
              + this.height + "\n" + "Referenzpunkt " + this.refPoint;
	}
	
	@Override	
        protected Point2D computeRefPoint() {
    	    return new Point2D(base.getX() + 0.5*width, base.getY() + 0.5*height);
        }	
}
