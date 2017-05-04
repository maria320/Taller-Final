import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	Personaje pers;

	public Logica() {
		pers=new Personaje();

	}

	public void pintar() {

	}

	public void key(PApplet app) {

		switch (app.key) {
		case '1':
			
			pers.accionUno();


			break;
		case '2':

			break;

		case '3':

			break;

		}

	}

}
