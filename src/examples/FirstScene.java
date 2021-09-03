package examples;

import geometry.*;
import geometry.shapes.*;

/**
 * Instanziieren von Objekten und einer Szene und Durchlaufen der
 * Szene mit ASCII-Ausgaben auf der Konsole.
 */
public class FirstScene {
	/**
	 * Hauptprogramm, das einige Instanzen erzeugt. 
	 * 
	 * Die Liste wird abschließend auf der Konsole ausgegeben.
	 * 
	 * @param args Argumente für die Anwendung
	 */
	public static void main(String[] args) {
		Scene scene = new Scene();
		Line line = new Line();
		Rectangle box = new Rectangle();
		Triangle triangle = new Triangle();
		Circle circle = new Circle();
		
		
		scene.addObject(line);
		scene.addObject(box);
		scene.addObject(triangle);	
		scene.addObject(circle);	
		
		System.out.println("Die Szene");
		System.out.println(scene);
	}
}
