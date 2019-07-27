package geometry.shapes;

import geometry.Point2D;
import geometry.Shape;

/**
 * Ein Kreis als zweidimensionales Objekt. 
 * 
 * <p>Wir repräsentieren den Kreis
 * durch den Mittelpunkt und den Radius. Als Referenzpunkt verwenden wir den Mittelpunkt.</p>
 */
public class Circle extends Shape {
	/** 
	 * Anfangspunkt der Linie.
	 * <p>
	 * Default ist der Ursprung
	 */
	Point2D midPoint = new Point2D(0.0, 0.0);
	/**
	 * Radius.
	 * <p>
	 * Default ist Radius 1
	 */
	double radius = 1.0;
	
	/**
	 * Ein Kreis mit Mittelpunkt im Ursprung und Radius 1.
	 */
	public Circle() {
		refPoint = new Point2D(midPoint);
	}
	
	/**
	 * Ein Kreis mit Mittelpunkt und Radius.
	 * Der Referenzpunkt ist der übergebene Mittelpunkt.
	 * 
	 * @param midPoint Mittelpunkt
	 * @param radius   Radius
	 */
	public Circle(Point2D midPoint, double radius) {
		
		/* 
		 * Wir können ausnahmsweise den Konstruktor der Basisklasse
		 * verwenden, da wir den Referenzpunkt nicht berechnen müssen.
		 */
		super(midPoint);
		this.midPoint = midPoint;
		this.radius = radius;
	}
	
	/**
	 * Überschreiben der Funktion toString für Konsolenausgaben.
	 * 
	 * @return Ein String, der den Kreis beschreibt.
	 */
	@Override
    public String toString() {
		return "Kreis\nMittelpunkt " + this.midPoint + " \nRadius " + this.radius+ "\nReferenzpunkt " + this.refPoint;
	}
	
    /**
     * Der Referenzpunkt ist durch den Mittelpunkt gegeben.
     * Deshalb ist in dieser Klasse keine Berechnung nötig.
     * 
     * @return Der Mittelpunkt als Referenzpunkt
     */
	@Override	
    protected Point2D computeRefPoint() {
    	return midPoint;
    }

}
