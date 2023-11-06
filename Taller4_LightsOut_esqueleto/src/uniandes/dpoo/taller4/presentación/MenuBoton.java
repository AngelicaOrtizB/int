package uniandes.dpoo.taller4.presentación;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import uniandes.dpoo.taller4.modelo.Tablero;

public class MenuBoton extends JPanel{
	protected static final int TAMANO = 0;
	public PTablero tablero;
	public Principal principal;
	public PJugadas Pjugadas;

	public MenuBoton(PTablero ptablero, Principal principal) {
		this.tablero= ptablero;
		this.principal= principal;
		
		this.setLayout(new BorderLayout());
		
		JPanel pElementos = new JPanel();
		
		pElementos.setLayout(new GridLayout(8,1,55,55));		
		
		this.add(pElementos, BorderLayout.NORTH);
		
		JLabel bLabel= new JLabel(" ");
		
		JButton bNuevo = new JButton("NUEVO");
		
		pElementos.add(bNuevo);
		
		pElementos.add(bLabel);
		
		JButton bReiniciar = new JButton("REINICIAR");
		
		pElementos.add(bReiniciar);
		
		pElementos.add(bLabel);
		
		JButton bTop10 = new JButton("TOP-10");
	
		pElementos.add(bTop10);
		
		pElementos.add(bLabel);
		
		JButton bCambiarJugador = new JButton("CAMBIAR JUGADOR");
	
		pElementos.add(bCambiarJugador);
		
		pElementos.add(bLabel);
		
		bNuevo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				principal.nuevoTablero();;
			}
		});
		
		
		
		bReiniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				principal.reiniciarTablero();
			}
		});
		
		bCambiarJugador.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				abrirVentanaSecundaria();
			}
		});
		

		
	}
	private void abrirVentanaSecundaria() {
		JFrame ventana = new JFrame("CAMBIAR JUGADOR");
        ventana.setSize(200, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textFieldSecundario = new JTextField(15);
        JButton botonAgregarTexto = new JButton("Cambiar jugador");
        JPanel pElementonVS = new JPanel();
        pElementonVS.setLayout(new GridLayout(2,1,20,20));	
        pElementonVS.add(textFieldSecundario);
        pElementonVS.add(botonAgregarTexto);
        ventana.add(pElementonVS);
        ventana.setVisible(true);
        botonAgregarTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textFieldSecundario.getText();
                textFieldSecundario.setText("");
                principal.update3Jugadas(texto);
                ventana.dispose();
            }
        });
        }



	
}
