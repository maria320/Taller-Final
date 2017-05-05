import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	Personaje pers;

	public Logica(PApplet app) {
		pers = new Personaje(app);

	}

	public void pintar(PApplet app) {
		pers.pintar(app);

	}

	public void key(PApplet app) {

		switch (app.key) {
		case '1':

			pers.accionUno(app);

			break;
		case '2':
			pers.accionDos();
			break;

		case '3':

			break;

		}

	}

}
