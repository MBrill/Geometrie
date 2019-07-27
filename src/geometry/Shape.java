package geometry;

/**
 * Basisklasse für die zweidimensionalen geometrische Objekte.
 * 
 * Die Geometrie der Objekte wird mit Hilfe der Klasse {@link geometry.Point2D Point2D}
 * definiert.
 * 
 * Jedes geometrische Objekt in unserer Bibliothek hat einen
 * Referenzpunkt. Damit ist immer das Zentrum gemeint, das wir
 * als arithmetisches Mittel der Punkte des Objekts berechnen 
 * können. Als Default ist dieser Referenzpunkt immer der Ursprung.
 * 
 * Abstände zwischen geometrischen Objekten berechnen wir mit Hilfe
 * des euklidischen Abstands zwischen den Referenzpunkten.
 */
/**
 * \todo Nicht nur für die Klasse Line, sondern auch für alle anderen
 * instanziierbaren Shapes Grafiken erstellen und in die Dokumentation
 * aufnehmen.
 */
public abstract class Shape {
	
	/** 
	 * Referenzpunkt 
	 */
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
	 * \param[in] p Punkt als Referenzpunkt
	 */
	public Shape(Point2D p) {
		refPoint = new Point2D(p);
	}
	
	/**
	 * Abstand zwischen zwei geometrischen Objekten.
	 * 
	 * Der Abstand ist definiert als euklidischer Abstand zwischen den Referenzpunkten.
	 * 
	 * @param[in] s geometrisches Objekt, für das der Abstand zur aktuellen Instanz berechnet werden soll
	 * @return Abstand der geometrischen Objekte
	 */
    public double distanceTo(Shape s) {
    	return refPoint.distanceTo(s.refPoint);
    }
	
    /**
     * Funktion, die den Referenzpunkt berechnet.
     */
    protected abstract Point2D computeRefPoint();
    
    /**
     * \mainpage
     * Zweidimensionale geometrische Objekte
     * 
     * \image html g2dlogo.jpg "Das Projekt-Logo"
     * 
     * Dies ist die Hauptseite der mit Doxygen erzeugten HTML-Dokumentation. In dieser
     * Version wurden Kommentare im Javadoc-Style verwendet.
     * 
     * Dieser Text befindet sich in der Datei Shape.java.
     */

    /** 
     * \example FirstScene.java
     *
     * Dieses Beispiel zeigt exemplarisch, wie die verschiedenen
     * Objekte instanziiert und in eine Instanz
     * der Klasse Scene aufgenommen werden.
     * Anschliessend geben wir die Szene auf der Konsole
     * aus. Dabei wird die Szene intern durchlaufen
     * und alle enthaltenen Objekte, in der Reihenfolge,
     * in der sie hinzugefügt wurden, werden ausgegeben.
     */   
}

