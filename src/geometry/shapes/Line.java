package geometry.shapes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import examples.FirstScene;
import geometry.Point2D;
import geometry.Shape;

public class Line extends Shape {
	
	final Logger lineLog = LoggerFactory.getLogger(Line.class.getName());

	Point2D begin = new Point2D(0.0, 0.0);
	Point2D end = new Point2D(1.0, 0.0);
	
	public Line() {
	       lineLog.trace(">> Line()");
           this.refPoint = this.computeRefPoint();
           lineLog.info("** Linie mit Referenzpunkt {}", refPoint);
           lineLog.trace("<< Line()");
	}
	
	public Line(Point2D begin, Point2D end) {
	    lineLog.trace(">> Line(Point2D, Point2D)");
		this.begin = begin;
		this.end = end;
        this.refPoint = this.computeRefPoint();
        lineLog.info("** Linie mit Referenzpunkt {}", refPoint);
	    lineLog.trace("<< Line(Point2D, Point2D)");
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
