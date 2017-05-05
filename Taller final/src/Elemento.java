import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public abstract class Elemento {
	private PImage elmn;
	private int x, y;

	public Elemento(PImage elmn, int x, int y) {
		this.elmn=elmn;
		this.x=x;
		this.y=y;

	}

	public void pintar(PApplet app) {
		
			app.imageMode(PConstants.CENTER);

			app.image(elmn, x, y);
			app.imageMode(PConstants.CORNER);
		

	}

}
