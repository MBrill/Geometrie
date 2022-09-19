/*
 * Logging mit JUL
 */
package geometry.shapes;

import java.util.logging.*;
import geometry.Point2D;
import geometry.Shape;

public class Rectangle extends Shape {

	final private Logger rectLog = Logger.getLogger(Rectangle.class.getName());
	final private Handler systemOut = new ConsoleHandler();
	
	private Point2D base = new Point2D(0.0, 0.0);	
	private double width = 1.0;	
	private double height = 1.0;
	
	public Rectangle() {
		setupLogging(rectLog, systemOut);
		rectLog.info(">> Rectangle()");
        
		this.refPoint = this.computeRefPoint();
		
		rectLog.config("** Rechteck mit Referenzpunkt" + refPoint);
		rectLog.info("<< Rectangle()");		
	}
	
	public Rectangle(Point2D base, double width, double height) {
		setupLogging(rectLog, systemOut);
		rectLog.info(">> Rectangle(Point2D, double, double)");
		
		this.base = base;
		this.width = width;
		this.height = height;
        this.refPoint = this.computeRefPoint();
        
		rectLog.config("** Rechteck mit Referenzpunkt" + refPoint);
		rectLog.info("<< Rectangle(Point2D, double, double)");	        
	}
	
	public Rectangle(Point2D base, double dimension) {
		setupLogging(rectLog, systemOut);
		rectLog.info(">> Rectangle(Point2D, double)");
		
		this.base = base;
		this.width = dimension;
		this.height = dimension;
        this.refPoint = this.computeRefPoint();
        
		rectLog.config("** Rechteck mit Referenzpunkt" + refPoint);
		rectLog.info("<< Rectangle(Point2D, double)");	        
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
