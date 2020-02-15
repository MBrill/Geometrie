package examples;

import geometry.shapes.*;

/**
 * Instanziieren einer Linie und eines Rechtecks
 * und Berechnung des Abstands.
 */
public class Distances {
	public static void main(String[] args) {
		Line line = new Line();
		Rectangle box = new Rectangle();
		
		System.out.println("Abstand zwischen Linie und Rechteck (korrekt ist 0.5):");
		System.out.println(line.distanceTo(box));
	}
}
