package geometry;

import java.util.ArrayList;

/**
 * Eine Szene ist eine Ansammlung von geometrischen Objekten.
 * 
 * <p>Hauptzweck der Klasse ist es eine Szene zu erzeugen
 * und zu traversieren. Zur Zeit ist nur eine lineare Liste
 * als Szene implementiert, also keine hierarchischen Beziehungen.</p>
 */
public class Scene {
	
	/**
	 * Als Container für die Szene wird eine ArrayList verwendet.
	 */
	private ArrayList<Shape> scene;
	
	/**
	 * Eine leere Szene erzeugen.
	 */
	public Scene() {
		scene = new ArrayList<Shape>();
	}
	
	/**
	 * Szene erzeugen, die aus einem objekt besteht.
	 * 
	 * @param o geometrisches Objekt, aus dem die Szene besteht.
	 */
	public Scene(Shape o) {
		scene = new ArrayList<Shape>();
		scene.add(o);
	}
	
	/**
	 * Ein Objekt in die Szene aufnehmen.
	 * 
	 * @param o Das Objekt, das aufgenommen werden soll.
	 */
	public void addObject(Shape o)
	{
		scene.add(o);
	}
	
	/**
	 * Überschreiben der Funktion toString für Konsolenausgaben.
	 * <p>
	 * Jedes objekt erzeugt eine neue Zeile in der Ausgabe. Der Text wird
	 * durch die in den Klassen überschriebene Funktion 
	 * {@code toString()}
	 * festgelegt.
	 */
	@Override
    public String toString() {
		String text ="";
		for (Shape s : scene) {
		     text += s.toString() + "\n";
		}
		return text;
	}
	
	/**
	 * Abfragen, wie viele Objekte in der Szene aktuell enthalten sind.
	 * 
	 * @return Anzahl der Objekte in der Szene
	 */
	public int getNumberOfobjects() {
		return scene.size();
	}
	
	/**
	 * Abfragen, ob die Szene Objekte enthält.
	 * 
	 * @return true, falls die Liste leer ist.
	 */
	public boolean isEmpty() {
		return scene.isEmpty();
	}	
}
