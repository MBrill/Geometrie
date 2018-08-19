/*
 * Wir könnten verschiedene Versionen dieser Datei erzeugen, da im Text zu diesem
 * Beispiel auch verschiedene Varianten beschrieben werden.
 * 
 * Aktuell ist dies durch Kommentar-Zeichen gelöst.
 */
package examples;

import java.io.IOException;
import java.util.logging.*;

import geometry.*;
import geometry.shapes.*;

public class FirstScene {

	public static void main(String[] args) {
		
		final Logger log = Logger.getLogger(FirstScene.class.getName());
		//final Logger log = Logger.getLogger("");
		
		final Handler systemOut = new ConsoleHandler();
		systemOut.setLevel(Level.CONFIG);
		log.addHandler(systemOut);
		log.setLevel(Level.CONFIG);	
		log.setUseParentHandlers(false);
		
		/*final FileHandler fileTxt;
		final SimpleFormatter formatter = new SimpleFormatter();
		
		try {
			fileTxt = new FileHandler("Logs.txt");
			fileTxt.setFormatter(formatter);
			fileTxt.setLevel(Level.ALL);
			log.addHandler(fileTxt);
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		log.info(">> FirstScene.Main");
		
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

		log.info(">> FirstScene.Main");
	}
}
