/*
 * Logging mit JUL
 */
package examples;

import java.util.logging.*;

import geometry.*;
import geometry.shapes.*;

public class FirstScene 
{
	public static void main(String[] args) {
		
		final Logger log = Logger.getLogger(FirstScene.class.getName());		
		final Handler systemOut = new ConsoleHandler();
		
		systemOut.setLevel(Level.CONFIG);
		log.addHandler(systemOut);
		log.setLevel(Level.CONFIG);	
		log.setUseParentHandlers(false);
		
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

		log.info("<< FirstScene.Main");
	}
}
