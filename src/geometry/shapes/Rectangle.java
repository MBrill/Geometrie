package geometry.shapes;

import geometry.Point2D;
import geometry.Shape;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rectangle extends Shape {

    private static final Logger rectLog = LogManager.getLogger();
    
	private Point2D base = new Point2D(0.0, 0.0);
	
	private double width = 1.0;
	
	private double height = 1.0;
	
	public Rectangle() {
		rectLog.trace(">> Rectangle()");
        this.refPoint = this.computeRefPoint();
        rectLog.info("** Rechteck mit Referenzpunkt {}", refPoint);
        rectLog.trace("<< Rectangle()");
	}
	
	public Rectangle(Point2D base, double width, double height) {
		rectLog.trace(">> Rectangle(Point2D, double, double)");
		this.base = base;
		this.width = width;
		this.height = height;
        this.refPoint = this.computeRefPoint();
        rectLog.info("** Rechteck mit Referenzpunkt {}", refPoint);
		rectLog.trace("<< Rectangle(Point2D, double, double)");
	}
	
	public Rectangle(Point2D base, double dimension) {
		rectLog.trace(">> Rectangle(Point2D, double)");
		this.base = base;
		this.width = dimension;
		this.height = dimension;
        this.refPoint = this.computeRefPoint();
        rectLog.info("** Rechteck mit Referenzpunkt {}", refPoint);
		rectLog.trace("<< Rectangle(Point2D, double)");
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
