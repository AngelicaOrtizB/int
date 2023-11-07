package uniandes.dpoo.taller4.presentación;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MenuNorte extends JPanel  {
private JComboBox<String> opciones;
	
	private JLabel titTamanio, titDifi;
	
	private JRadioButton facil,medio,dificil;
	
	private ButtonGroup bg;
	
    public MenuNorte(Principal principal) {
    	
    	this.setLayout(new BorderLayout());
		JPanel superior = new JPanel();
		superior.setLayout(new GridLayout(1, 1 , 1, 1));
		this.add(superior, BorderLayout.NORTH);
    	
		titTamanio = new JLabel ("Tamaño: ");
		superior.add(titTamanio, BorderLayout.LINE_START);
		JComboBox opciones=new JComboBox<String>();
        opciones.setBounds(1,1,1,1);
        
        superior.add(opciones, BorderLayout.AFTER_LAST_LINE);
        opciones.addItem("5 x 5");
        opciones.addItem("7 x 7");
        opciones.addItem("10 x 10");
        opciones.addActionListener(opciones);
        
        titDifi = new JLabel ("Dificultad: ");
		superior.add(titDifi, BorderLayout.LINE_START);
        
		ButtonGroup bg=new ButtonGroup();
		facil=new JRadioButton("Facil");
        facil.setBounds(10,20,100,30);
        bg.add(facil);
        superior.add(facil);
        medio=new JRadioButton("Medio");
        medio.setBounds(10,70,100,30);
        bg.add(medio);
        superior.add(medio);
        
        dificil=new JRadioButton("Dificil");
        dificil.setBounds(10,120,100,30);       
        bg.add(dificil);
        superior.add(dificil);
        
        opciones.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String valorSeleccionado = (String) opciones.getSelectedItem();
				principal.cambioTamanio(valorSeleccionado);
		        
			}
        });
        
          facil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (facil.isSelected()) {
                    String valorSeleccionado = "5";
                    principal.cambioDificultad(valorSeleccionado);
                }
            }
        });

        medio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (medio.isSelected()) {
                    String valorSeleccionado = "10";
                    principal.cambioDificultad(valorSeleccionado);
                }
            }
        });

        dificil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dificil.isSelected()) {
                    String valorSeleccionado = "15";
                    principal.cambioDificultad(valorSeleccionado);
                }
            }
        });
        
        
    }
    

	

}

