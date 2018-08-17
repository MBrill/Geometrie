package examples;

import org.apache.log4j.Logger;


import geometry.*;
import geometry.shapes.*;

public class FirstScene {

	private static Logger log = LogManager.getLogger("FirstScene");
	
	public static void main(String[] args) {
		
		log.trace(">> FirstScene.Main");
		
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
		
		log.trace("<< FirstScene.Main");
	}

}
