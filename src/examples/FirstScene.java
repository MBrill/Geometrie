package examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import geometry.*;
import geometry.shapes.*;

public class FirstScene {

	public static void main(String[] args) {
		
		final Logger log = LoggerFactory.getLogger(FirstScene.class.getName());
		log.info(">> FirstScene.main");
		
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
		
		log.info("<< FirstScene.main");
	}

}
