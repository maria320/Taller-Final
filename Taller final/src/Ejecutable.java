import processing.core.PApplet;

public class Ejecutable extends PApplet{
Logica log;
	public static void main(String[] args) {
		PApplet.main("Ejecutable");

	}

	public void settings() {
		size(1200, 700);

	}

	public void setup() {
		log=new Logica();

	}

	public void draw() {
		
	}

	public void keyPressed() {
		log.key(this);

		
	}

}
