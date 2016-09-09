package geometry.shapes;

import geometry.Point2D;
import geometry.Shape;

public class Triangle extends Shape {
	
	private Point2D one = new Point2D(0.0, 0.0);
	private Point2D two = new Point2D(1.0, 0.0);
	private Point2D three = new Point2D(0.5, 1.0);
	
	public Triangle() {
            this.refPoint = this.computeRefPoint();
	}	
	
	public Triangle(Point2D one, Point2D two, Point2D three) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.refPoint = this.computeRefPoint();
	}	
	
	@Override
        public String toString() {
		return "Dreieck\nErste Ecke " + this.one + "\nzweite Ecke " + this.two + 
			",\ndritte Ecke " + this.three + "\n" + "Referenzpunkt " + this.refPoint;
	}
	
	@Override
	protected Point2D computeRefPoint() {
		return new Point2D((one.getX() + two.getX() + three.getX())/3.0, 
				            (one.getY() + two.getY() + three.getY())/3.0);
	}

}
