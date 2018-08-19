package examples;

import geometry.*;
import geometry.shapes.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FirstScene {

    private static final Logger log = LogManager.getLogger();
    
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
