package geometry;

/**
 * Eine Klasse für die Repräsentation von Punkten in der
 * zweidimensionalen Ebene.
 * 
 * <p>
 * Ein Punkt wird mit Hilfe von zwei Koordinaten, genannt x und y,
 * repräsentiert. Dafür wird der Datentyp double verwendet.</p>
 * 
 * <p>
 * Die Klasse heißt Point2D statt einfach Point, um Verwechselungen
 * mit dem built-in Typ Point in Java zu vermeiden!</p>
 */
public class Point2D {
	
	/** x-Koordinate 
	 *  Default ist 0.0.
	 */
	private double x = 0.0;
	/** y-Koordinate 
	 *  Default ist 0.0.
	 */
	private double y = 0.0;
	/** 
	 * Punkt im Ursprung.
	 */
	public Point2D() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	/** 
	 * Punkt in (x, y).
	 * 
	 * @param x die x-Koordinate
	 * @param y die y-Koordinate
	 */
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Kopierkonstruktor als Alternative zu clone().
	 * 
	 * @param p Punkt, der kopiert wird
	 */
	public Point2D(Point2D p) {
		this(p.getX(), p.getY());
	}
	
	/**
	 * Die x-Koordinate abfragen.
	 * 
	 * @return die x-Koordinaten der Instanz
	 */
	public double getX() {
		return x;
	}

	/**
	 * Die y-Koordinate abfragen.
	 * 
	 * @return die y-Koordinaten der Instanz
	 */
	public double getY() {
		return y;
	}	
	
	/**
	 * Den Punkt durch Angabe von neuen Koordinaten
	 * verändern.
	 * 
	 * @param newX die neue x-Koordinate
	 * @param newY die neue y-Koordinate
	 */
	public void change(double newX, double newY) {
		this.x = newX;
		this.y = newY;
	}
	
	/**
	 * Den Punkt durch Angabe von Koordinaten
	 * bewegen.
	 * <p>
	 * Danach liegt in der Instanz ein Punkt mit den Koordinaten (x + dX, y + dY).
	 * 
	 * @param dX die Veränderung in der x-Koordinate
	 * @param dY die Veränderung in der y-Koordinate
	 */
	public void move(double dX, double dY) {
		this.x += dX;
		this.y += dY;
	}
	
	/**
	 * Euklidischer Abstand zwischen der Instanz und einem
	 * weiteren Punkt.
	 * 
	 * @param p Punkt, zu dem der Abstand berechnet wird
	 * @return Euklidischer Abstand
	 */
	public double distanceTo(Point2D p) {
		return Math.sqrt( (this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
	}
	
	/**
	 * Überschreiben der Funktion toString für Konsolenausgaben.
	 * <p>
	 * Für den Punkt wird der String (x, y) ausgegeben. Dabei stehen in x und y
	 * die {@code double}-Werte der Instanz.
	 */
	@Override
    public String toString() {
    	return "(" + this.x + ", " + this.y + ")";
    }	
}