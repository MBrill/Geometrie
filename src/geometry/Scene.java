package geometry;

import java.util.ArrayList;

/**
 * Eine Szene ist eine Ansammlung von geometrischen Objekten.
 * 
 * Hauptzweck der Klasse ist eine Szene zu erzeugen
 * und zu traversieren. Zur Zeit ist nur eine lineare Liste
 * als Szene implementiert, also keine hierarchischen Beziehungen.</p>
 */

/**
 * \todo Die lineare Liste kann durch einen Baum oder einen anderen Container
 * ersetzt werden. Mit einem Baum werden hierarchische Beziehungen möglich,
 * also Gruppierungen von Objekten, die gemeinsam behandelt werden können.
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
	 * \param o geometrisches Objekt, aus dem die Szene besteht.
	 */
	public Scene(Shape o) {
		scene = new ArrayList<Shape>();
		scene.add(o);
	}
	
	/**
	 * Ein Objekt in die Szene aufnehmen.
	 * 
	 * \param o Das Objekt, das aufgenommen werden soll.
	 */
	public void addObject(Shape o)
	{
		scene.add(o);
	}
	
	/**
	 * �berschreiben der Funktion toString für Konsolenausgaben.
	 * <p>
	 * Jedes objekt erzeugt eine neue Zeile in der Ausgabe. Der Text wird
	 * durch die in den Klassen überschriebene Funktion 
	 * \code
	 *   toString()
	 * \endcode
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
	 */
	public int getNumberOfobjects() {
		return scene.size();
	}
	
	/**
	 * Abfragen, ob die Szene Objekte enthält.
	 * 
	 * \return true, falls die Liste leer ist.
	 */
	public boolean isEmpty() {
		return scene.isEmpty();
	}	
}
