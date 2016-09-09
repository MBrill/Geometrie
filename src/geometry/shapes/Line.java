package geometry.shapes;

import geometry.Point2D;
import geometry.Shape;

public class Line extends Shape {

	Point2D begin = new Point2D(0.0, 0.0);
	Point2D end = new Point2D(1.0, 0.0);
	
	public Line() {
           this.refPoint = this.computeRefPoint();
	}
	
	public Line(Point2D begin, Point2D end) {
		this.begin = begin;
		this.end = end;
        this.refPoint = this.computeRefPoint();
	}
	
	   
	@Override
        public String toString() {
		return "Linie\nAnfangspunkt " + this.begin + " \nEndpunkt " + this.end+ "\nReferenzpunkt " + this.refPoint;
	}
	
	@Override	
        protected Point2D computeRefPoint() {
    	    return new Point2D(0.5*(begin.getX()+end.getX()), 0.5*(begin.getY()+end.getY()));
        }
    
}
