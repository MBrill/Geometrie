package geometry.shapes;

import geometry.Point2D;
import geometry.Shape;

/**
 * Ein Dreieck als zweidimensionales Objekt. 
 * <p>
 * Wir repräsentieren das Dreieck
 * durch seine drei Eckpunkte. Der Referenzpunkt ist
 * der Schwerpunkt des Dreiecks, gegeben durch die
 * Konvexkombination mit 1/3 als Koeffizient.</p>
 */
public class Triangle extends Shape {
	
	/** 
	 * Erster Punkt.
	 * 
	 * Default ist der Ursprung.
	 */
	private Point2D one = new Point2D(0.0, 0.0);
	/** 
	 * Zweiter Punkt.
	 * 
	 * Default ist der Punkt (1,0).
	 */
	private Point2D two = new Point2D(1.0, 0.0);
	/** 
	 * Dritter Punkt.
	 * 
	 * Default ist der Punkt (0.5, 1).
	 */
	private Point2D three = new Point2D(0.5, 1.0);
	
	/**
	 * Ein Dreieck mit den Punkten (0,0), (1,0) und (0.5,1).
	 */
	public Triangle() {
        this.refPoint = this.computeRefPoint();
	}	
	
	/**
	 * Dreieck mit drei angegebenenEckpunkten
	 * 
	 * @param one Erster Punkt
	 * @param two Zweiter Punkt
	 * @param three Dritter Punkt
	 */
	public Triangle(Point2D one, Point2D two, Point2D three) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.refPoint = this.computeRefPoint();
	}	
	
	/**
	 * Überschreiben der Funktion toString für Konsolenausgaben.
	 * 
	 * @return Ein String, der das Dreieck beschreibt.
	 */
	@Override
    public String toString() {
		return "Dreieck\nErste Ecke " + this.one + "\nzweite Ecke " + this.two + 
			",\ndritte Ecke " + this.three + "\n" + "Referenzpunkt " + this.refPoint;
	}
	
	/**
	 * Der Referenzpunkt wird als Konvexkombination der drei
	 * Eckpunkte berechnet.
	 * 
	 * Als Koeffizienten der Konvexkombination wird für jeden Eckpunkt 
	 * 1/3 verwendet:
     * <pre>
     * {@code
     *   new Point2D((one.getX() + two.getX() + three.getX())/3.0, 
				     (one.getY() + two.getY() + three.getY())/3.0); 
     * }
     * </pre>
	 */
	@Override
	protected Point2D computeRefPoint() {
		return new Point2D((one.getX() + two.getX() + three.getX())/3.0, 
				            (one.getY() + two.getY() + three.getY())/3.0);
	}
}
