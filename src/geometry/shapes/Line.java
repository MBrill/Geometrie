package geometry.shapes;

import geometry.Point2D;
import geometry.Shape;

/**
 * Eine Linie als zweidimensionales Objekt. 
 * 
 * <p>Wir repräsentieren die Linie
 * durch Anfangs- und Endpunkt. Als Referenzpunkt verwenden wir den Mittelpunkt
 * der Linie.</p>
 * 
 * <p>Die folgende Abbildung zeigt die drei Punkte und die Linie:</p>
 * 
 * <p><img src="doc-files/lineDok.jpg"></p>
 */
public class Line extends Shape {

	/** 
	 * Anfangspunkt der Linie.
	 * <p>
	 * Defaultwert ist der Ursprung.
	 */
	Point2D begin = new Point2D(0.0, 0.0);
	/**
	 * Endpunkt der Linie.
	 * <p>
	 * Defaultwert ist der Punkt (1,0).
	 */
	Point2D end = new Point2D(1.0, 0.0);
	
	/**
	 * Eine Linie mit Anfangspunkt (0,0) und End-Punkt (1,0).
	 */
	public Line() {
        this.refPoint = this.computeRefPoint();
	}
	
	/**
	 * Eine Linie mit Anfangs- und Endpunkt.
	 * 
	 * @param begin Startpunkt der Linie
	 * @param end   Endpunkt der Linie
	 */
	public Line(Point2D begin, Point2D end) {
		this.begin = begin;
		this.end = end;
        this.refPoint = this.computeRefPoint();
	}
	
	   
	/**
	 * Überschreiben der Funktion toString für Konsolenausgaben.
	 * 
	 * @return Ein String, der die Linie beschreibt.
	 */
	@Override
    public String toString() {
		return "Linie\nAnfangspunkt " + this.begin + " \nEndpunkt " + this.end+ "\nReferenzpunkt " + this.refPoint;
	}
	
    /**
     * Berechne den Referenzpunkt aus Anfangs- und Endpunkt.
     * 
     * Der Referenzpunkt ist durch den Mittelpunkt der Linie, also das
     * arithmetische Mittel von Anfangs- und Endpunkt gegeben.
     */
	@Override	
    protected Point2D computeRefPoint() {
    	return new Point2D(0.5*(begin.getX()+end.getX()), 0.5*(begin.getY()+end.getY()));
    }
    
}
