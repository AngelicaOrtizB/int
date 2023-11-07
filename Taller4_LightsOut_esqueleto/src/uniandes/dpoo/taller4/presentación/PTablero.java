package uniandes.dpoo.taller4.presentación;
import uniandes.dpoo.taller4.modelo.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class PTablero extends JPanel implements MouseListener {
	public Tablero tablero;
	public PJugadas pjugadas;
	public int ultima_fila;
	public int ultima_columna;
	public int dimension;
	public int dificultad;
	
	public PTablero( int dimension, Tablero tablero, PJugadas pjugadas, int dificultad) {

       
		this.dimension = dimension;
		this.tablero = tablero;
		this.pjugadas= pjugadas;
		this.dificultad= dificultad;
		this.addMouseListener(this);
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		boolean matriz[][] = tablero.darTablero();
		tablero.desordenar(dificultad);
		for(int j = 0; j < dimension; j++) {
			for(int i = 0; i < dimension; i++) {
				if(matriz[i][j]==true) {
					g2d.setColor(new Color(20,20,20));
					g2d.fillRect(((this.getWidth()/dimension)*i), ((this.getHeight()/dimension)*j), (this.getWidth()/dimension)-1,(this.getHeight()/dimension)-1);
				}
				else {
					g2d.setColor(new Color(255,255,0));
					g2d.fillRect(((this.getWidth()/dimension)*i), ((this.getHeight()/dimension)*j), (this.getWidth()/dimension)-1,(this.getHeight()/dimension)-1);
				}
			}
		}
		
	}
	private int[] convertirCoordenadasACasilla(int x, int y)
	{
		int ladoTablero = this.dimension; 
		int altoPanelTablero = getHeight();
		int anchoPanelTablero = getWidth();
		int altoCasilla = altoPanelTablero / ladoTablero;
		int anchoCasilla = anchoPanelTablero / ladoTablero;
		int fila = (int) (y / altoCasilla);
		int columna = (int) (x / anchoCasilla);
		return new int[] { fila, columna };
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int click_x = e.getX();
		int click_y = e.getY();
		int[] casilla = convertirCoordenadasACasilla(click_x, click_y);
		tablero.jugar(casilla[0], casilla[1]);
		this.ultima_fila = casilla[0];
		this.ultima_columna = casilla[1];
		repaint();
		pjugadas.update(this.tablero.darJugadas()+"");
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void cambiarTamanio(String tamanio) {
		
	}
	
	
	

}



