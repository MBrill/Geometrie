package geometry;

/**
 * Basisklasse für die zweidimensionalen geometrische Objekte.
 * 
 * <p>
 * Die Geometrie der Objekte wird mit Hilfe der Klasse {@link geometry.Point2D Point2D}
 * definiert.</p>
 * <p>
 * Jedes geometrische Objekt in unserer Bibliothek hat einen
 * Referenzpunkt. Damit ist das Zentrum gemeint, das wir
 * als arithmetisches Mittel der Punkte des Objekts berechnen 
 * können. Als Default ist dieser Referenzpunkt immer der Ursprung.</p> 
 * <p>
 * Abstände zwischen geometrischen Objekten berechnen wir mit Hilfe
 * des euklidischen Abstands zwischen den Referenzpunkten.</p>
 */
public abstract class Shape {
	
	/** Referenzpunkt */
	public Point2D refPoint;
	
	/**
	 * Objekt mit Referenzpunkt im Default der Klasse Point2D.
	 */
	public Shape() {
		refPoint = new Point2D();
	}
	
	/**
	 * Objekt mit einem Referenzpunkt.
	 * 
	 * @param p Punkt als Referenzpunkt
	 */
	public Shape(Point2D p) {
		refPoint = new Point2D(p);
	}
	
	/**
	 * Abstand zwischen zwei geometrischen Objekten.
	 * <p>
	 * Der Abstand ist definiert als euklidischer Abstand zwischen den Referenzpunkten.
	 * 
	 * @param s geometrisches Objekt, für das der Abstand zur aktuellen Instanz berechnet werden soll
	 * @return Abstand der geometrischen Objekte
	 */
    public double distanceTo(Shape s) {
    	return refPoint.distanceTo(s.refPoint);
    }
	
    /**
     * Funktion, die den Referenzpunkt berechnet.
     */
    protected abstract Point2D computeRefPoint();
}

