package uniandes.dpoo.taller4.modelo.presentación;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import uniandes.dpoo.taller4.modelo.Tablero;

public class Principal extends JFrame {
	private MenuBoton Menuboton;
	private PTablero Ptablero;
	private static final int TAMANO=7;
	public static final int TAM_TARJETA = 50;
	private Tablero modelo;
	private PJugadas Pjugadas;
	private MenuNorte Pnorte;
	
	public Principal() {
		

		this.setTitle("LightsOut");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.modelo= new Tablero(TAMANO);
		//boolean[][] board = modelo.darTablero();
		this.Pjugadas= new PJugadas();
		this.Pnorte= new MenuNorte();
		this.Ptablero= new PTablero(TAMANO, modelo, Pjugadas);
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
		this.modelo = new Tablero(TAMANO);
		this.Ptablero = new PTablero(TAMANO, modelo, Pjugadas);
		this.add(Ptablero,BorderLayout.CENTER);
		Pjugadas.update2();
	}
	public void reiniciarTablero() {
		// TODO Auto-generated method stub
		this.remove(this.Ptablero);
		this.modelo.reiniciar();
		this.Ptablero = new PTablero(TAMANO, modelo, Pjugadas);
		this.add(Ptablero,BorderLayout.CENTER);
		Pjugadas.update2();
		
	}
	public void update3Jugadas(String texto) {
		// TODO Auto-generated method stub
		Pjugadas.update3(texto);
	}
	
	
	
	
	
}
