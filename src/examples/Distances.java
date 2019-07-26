package examples;

import geometry.shapes.*;

public class Distances {
	public static void main(String[] args) {
		Line line = new Line();
		Rectangle box = new Rectangle();
		Circle circle = new Circle();
		
		// Abstände berechnen
		System.out.println("Abstand zwischen Linie und Rechteck (korrekt ist 0.5):");
		System.out.println(line.distanceTo(box));
		System.out.println("Abstand zwischen Kreis und Rechteck (korrekt ist wurzel(2)/2");
		System.out.println(circle.distanceTo(box));		
	}
}
