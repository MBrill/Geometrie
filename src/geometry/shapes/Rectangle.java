package geometry.shapes;

import geometry.Point2D;
import geometry.Shape;

/**
 * Ein Rechteck als zweidimensionales Objekt. 
 * <p>
 * Wir repräsentieren das Rechteck
 * durch den linken unteren Eckpunkt, Höhe und Breite.
 * Der Referenzpunkt ist der Mittelpunkt des Rechtecks, also
 * Eckpunkt + 0.5*(Breite, Höhe).</p>
 */
public class Rectangle extends Shape {

	/** 
	 * Linker unterer Punkt des Rechtecks.
	 * <p>
	 * Defaultwert ist der Ursprung.
	 */
	private Point2D base = new Point2D(0.0, 0.0);
	
	/** 
	 * Breite des Rechtecks.
	 * <p>
	 * Damit ist die Ausdehnung des Rechtecks in x-Richtung gemeint.
	 * <p>
	 * Default-Wert ist 1.0.	 * 
	 */
	private double width = 1.0;
	
	/** 
	 * Höhe des Rechtecks.
	 * 
	 * <p>Damit ist die Ausdehnung des Rechtecks in y-Richtung gemeint.
	 * <p>
	 * Default-Wert ist 1.0.
	 */
	private double height = 1.0;
	
	/**
	 * Ein Rechteck mit linker unterer Ecke im Ursprung.
	 * <p>
	 * Höhe und Breite sind 1 - man könnte das auch ein Quadrat nennen!
	 */
	public Rectangle() {
        this.refPoint = this.computeRefPoint();
	}
	
	/**
	 * Rechteck mit linker unterer Ecke, Breite und Höhe.
	 * 
	 * @param base  Linke untere Ecke des Rechtecks
	 * @param width Breite des Rechtecks in x-Richtung
	 * @param height Höhe des Rechtecks in y-Richtung
	 */
	public Rectangle(Point2D base, double width, double height) {
		this.base = base;
		this.width = width;
		this.height = height;
        this.refPoint = this.computeRefPoint();
	}
	
	/**
	 * Rechteck mit linker unterer Ecke, der ein Quadrat erzeugt.
	 * 
	 * @param base  Linke untere Ecke des Rechtecks
	 * @param dimension Höhe und Breite des Quadrats
	 */
	public Rectangle(Point2D base, double dimension) {
		this.base = base;
		this.width = dimension;
		this.height = dimension;
        this.refPoint = this.computeRefPoint();
	}
	
	/**
	 * Überschreiben der Funktion toString für Konsolenausgaben.
	 * 
	 * @return Ein String, der das Rechteck beschreibt.
	 */
	@Override
    public String toString() {
		return "Rechteck\nLinke untere Ecke " + this.base + " , Breite " + this.width + " , Höhe " 
              + this.height + "\n" + "Referenzpunkt " + this.refPoint;
	}
	
    /**
     * Berechne den Referenzpunkt als Mittelpunkt des Rechtecks.
     * 
     * Der Mittelpunkt ist gegeben durch
     * <pre><font size="-1">
     * {@code
     *   new Point2D(base.getX() + 0.5*width, 
     *               base.getY() + 0.5*height) 
     * }</font>
     * </pre>
     */
	@Override	
    protected Point2D computeRefPoint() {
    	return new Point2D(base.getX() + 0.5*width, base.getY() + 0.5*height);
    }	
}
