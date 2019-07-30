/*
 * Logging mit JUL
 */
package geometry.shapes;

import java.util.logging.*;
import geometry.Point2D;
import geometry.Shape;

public class Line extends Shape {

	final private Logger lineLog = Logger.getLogger("Line.class.getName()");
	final private Handler systemOut = new ConsoleHandler();
	
	Point2D begin = new Point2D(0.0, 0.0);
	Point2D end = new Point2D(1.0, 0.0);
	
	public Line() {
		setupLogging(lineLog, systemOut);
        lineLog.info(">> Line()");
        
        this.refPoint = this.computeRefPoint();
        
        lineLog.config("** Linie mit Referenzpunkt" + refPoint);
        lineLog.info("<< Line()");
	}
	
	public Line(Point2D begin, Point2D end) {
		setupLogging(lineLog, systemOut);
		lineLog.info(">> Line(Point2D, Point2D)");
		
		this.begin = begin;
		this.end = end;
        this.refPoint = this.computeRefPoint();
        
        lineLog.config("** Linie mit Referenzpunkt" + refPoint);        
        lineLog.info("<< Line(Point2D, Point2D)");
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
