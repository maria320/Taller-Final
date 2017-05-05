import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje implements Runnable{
	ArrayList<Elemento> elementos;
	
	public PImage[] fuego1;
	int numFrames = 3; // Número de imagenes en la animación
	int frame = 0;
	
	public Personaje(PApplet app) {
		elementos = new ArrayList<Elemento>();
		fuego1 = new PImage[4];
		
	
			fuego1[0] = app.loadImage("1.png");
			fuego1[1] = app.loadImage("2.png");
			fuego1[2] = app.loadImage("3.png");
			fuego1[3] = app.loadImage("4.png");
		
		

		
	}

	public void pintar(PApplet app) {
		
		frame++;
		
			elementos.get(frame).pintar(app);
		
			
//		for (int i = 0; i < elementos.size(); i++) {
//			
//		}

	}

	public void accionUno(PApplet app) {
		
		for (int i = 0; i < fuego1.length; i++) {
			System.out.println("estas jodida (>///<)"+" "+i);
			elementos.add(new Fuego(fuego1[i], 517,310));
		}
		
		
		

	}

	public void accionDos() {
		System.out.println("estas jodida (>///<)"+" "+frame);
		frame++;
		if (frame == numFrames) {
		frame = 0;
		}
		elementos.add(new Fuego(fuego1[frame], 517,310));
		
	

	}

	public void accionTres() {

	}

	public void accionCuatro() {

	}

	public void accionCinco() {

	}

	public void accionSeis() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	


}
