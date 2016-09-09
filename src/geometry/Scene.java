package geometry;

import java.util.ArrayList;

public class Scene {
	private ArrayList<Shape> scene;
	
	public Scene() {
		scene = new ArrayList<Shape>();
	}
	
	public Scene(Shape o) {
		scene = new ArrayList<Shape>();
		scene.add(o);
	}
	
	public void addObject(Shape o)
	{
		scene.add(o);
	}
	
	@Override
        public String toString() {
		String text ="";
		for (Shape s : scene) {
		     text += s.toString() + "\n";
		}
		return text;
	}
	
	public int getNumberOfobjects() {
		return scene.size();
	}
	
	public boolean isEmpty() {
		return scene.isEmpty();
	}	
}
