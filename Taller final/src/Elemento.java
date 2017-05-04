import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public abstract class Elemento {
	private PImage[] elmn;
	private int x, y;

	public Elemento(PImage elemn, int x, int y) {

	}

	public void pintar(PApplet app) {
		for (int i = 0; i < elmn.length; i++) {
			app.imageMode(PConstants.CENTER);

			app.image(elmn[i], x, y);
			app.imageMode(PConstants.CORNER);
		}

	}

}
