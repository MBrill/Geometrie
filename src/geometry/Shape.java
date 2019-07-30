/*
 * Logging mit JUL
 */
package geometry;

import java.util.logging.*;

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
	
    /*
     * Vorbereitung des Loggings. Diese Funktion
     * kann in den Konstruktoren der abgeleiteten
     * Klassen aufgerufen werden.
     */
	protected void setupLogging(Logger l, Handler h) {
		l.setLevel(Level.CONFIG);	
		l.setUseParentHandlers(false);		
		h.setLevel(Level.CONFIG);
		l.addHandler(h);
	}
	
    protected abstract Point2D computeRefPoint();
}
