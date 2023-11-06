package uniandes.dpoo.taller4.presentación;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PJugadas extends JPanel{
	private JLabel lJugadas;
	private JLabel lJugador;
	public PJugadas() {
		this.lJugadas = new JLabel("Jugadas: ");
		this.lJugador = new JLabel("Jugador: ");
		this.setLayout(new GridLayout(1,2,20,20));
		this.add(this.lJugadas);
		this.add(this.lJugador);
	}
	
	public void update(String jugadas) {
		this.lJugadas.setText("Jugadas: " + jugadas);		
	}
	
	public void update2() {
		this.lJugadas.setText("Jugadas: " + 0);		
	}
	
	public void update3(String jugador) {
		this.lJugador .setText("Jugador: " + jugador);		
	}
	


}
