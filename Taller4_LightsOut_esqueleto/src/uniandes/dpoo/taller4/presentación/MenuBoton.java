package uniandes.dpoo.taller4.presentación;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Top10;

public class MenuBoton extends JPanel{
	public PTablero tablero;
	public Principal principal;
	public PJugadas Pjugadas;
	private Top10 top1;

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
		this.top1= new Top10();
		
		bNuevo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				principal.nuevoTablero();
				abrirVentanaCambiarJugador();
			}
		});
		
		
		
		bReiniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				principal.reiniciarTablero();
			}
		});
		bTop10.addActionListener(new ActionListener() {

			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//actualizarLista();
				JFrame ventana1 = new JFrame("TOP 10 JUGADORES");
				ventana1.setSize(200, 200);
		        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        JPanel pElementonVS = new JPanel();
		        JButton botonAgregarTexto = new JButton("Salir");
		        pElementonVS.setLayout(new GridLayout(2,1,20,20));
		        JList lista = new JList<>();
		        JScrollPane scrollPane = new JScrollPane(lista);
				List<RegistroTop10> lista2=new ArrayList<>();
				 for (RegistroTop10 elemento : top1.darRegistros()) {
					 lista2.add(elemento);
			            
			        }
				 RegistroTop10[] array = lista2.toArray(new RegistroTop10[0]);
				 lista.setListData(array);
				 pElementonVS.add(scrollPane);
				 pElementonVS.add(botonAgregarTexto);
				 ventana1.add(pElementonVS);
		        ventana1.setVisible(true);
		        
		        botonAgregarTexto.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                ventana1.dispose();
		            }
		        });
		        
			}


			
		});
		
		bCambiarJugador.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				abrirVentanaCambiarJugador();
			}
		});
		

		
	}
	private void abrirVentanaCambiarJugador() {
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
