package uniandes.dpoo.taller4.presentación;
import java.awt.BorderLayout;
import javax.swing.JFrame;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Tablero;
import uniandes.dpoo.taller4.modelo.Top10;

public class Principal extends JFrame {
	private MenuBoton Menuboton;
	private PTablero Ptablero;
	private int tamanio=5;
	private Tablero modelo;
	private PJugadas Pjugadas;
	private MenuNorte Pnorte;
	private int dificultad=5;
	private Top10 top1; 
	
	@SuppressWarnings("serial")
	public Principal() {
		this.setTitle("LightsOut");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.modelo= new Tablero(tamanio);
		this.Pjugadas= new PJugadas();
		this.Pnorte= new MenuNorte(this);
		this.Ptablero= new PTablero(tamanio, modelo, Pjugadas, dificultad);
		this.Menuboton= new MenuBoton(Ptablero, this);
		this.add(this.Pnorte,BorderLayout.NORTH);
		this.add(this.Ptablero,BorderLayout.CENTER);
		this.add(this.Menuboton, BorderLayout.EAST);
		this.add(this.Pjugadas,BorderLayout.SOUTH);
		this.setVisible(true);

	
	}
	public static void main(String[] args) {
		new Principal();
	}

	protected void nuevoTablero() {
		this.remove(this.Ptablero);
		this.revalidate(); 
		this.modelo = new Tablero(tamanio);
		this.Ptablero = new PTablero(tamanio, modelo, Pjugadas, dificultad);
		this.add(Ptablero,BorderLayout.CENTER);
		Pjugadas.update2();
	}
	public void reiniciarTablero() {
		// TODO Auto-generated method stub
		this.remove(this.Ptablero);
		this.modelo.reiniciar();
		this.Ptablero = new PTablero(tamanio, modelo, Pjugadas, dificultad);
		this.add(Ptablero,BorderLayout.CENTER);
		Pjugadas.update2();
		
	}
	public void update3Jugadas(String texto) {
		// TODO Auto-generated method stub
		Pjugadas.update3(texto);
	}
	public void cambioTamanio(String valorSeleccionado) {
		// TODO Auto-generated method stub
		if (valorSeleccionado== "5 x 5") {
			tamanio=5;
		}
		else if(valorSeleccionado== "7 x 7") {
			tamanio=7;
		} 
		else if(valorSeleccionado== "10 x 10") {
			tamanio=10;
		} 
		this.remove(this.Ptablero);
		this.revalidate(); 
		this.modelo = new Tablero(tamanio);
		this.Ptablero = new PTablero(tamanio, modelo, Pjugadas, dificultad);
		this.add(Ptablero,BorderLayout.CENTER);
		Pjugadas.update2();
	}
	public void cambioDificultad(String valorSeleccionado) {
		// TODO Auto-generated method stub
		if(valorSeleccionado=="5") {
			dificultad= 5;
			this.remove(this.Ptablero);
			this.revalidate(); 
			this.modelo = new Tablero(tamanio);
			this.Ptablero = new PTablero(tamanio, modelo, Pjugadas, dificultad);
			this.add(Ptablero,BorderLayout.CENTER);
			Pjugadas.update2();
		}
		else if(valorSeleccionado=="10") {
			dificultad= 10;
			this.remove(this.Ptablero);
			this.revalidate(); 
			this.modelo = new Tablero(tamanio);
			this.Ptablero = new PTablero(tamanio, modelo, Pjugadas, dificultad);
			this.add(Ptablero,BorderLayout.CENTER);
			Pjugadas.update2();
		}
		else if(valorSeleccionado=="15") {
			dificultad= 15;
			this.remove(this.Ptablero);
			this.revalidate(); 
			this.modelo = new Tablero(tamanio);
			this.Ptablero = new PTablero(tamanio, modelo, Pjugadas, dificultad);
			this.add(Ptablero,BorderLayout.CENTER);
			Pjugadas.update2();
		}
		
		
		
	}
	
	
	
	
	
	
}
