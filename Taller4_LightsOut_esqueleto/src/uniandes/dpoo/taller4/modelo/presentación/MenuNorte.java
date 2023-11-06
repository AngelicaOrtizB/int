package uniandes.dpoo.taller4.modelo.presentación;
import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;
public class MenuNorte extends JPanel implements ItemListener {
private JComboBox<String> opciones;
	
	private JLabel titTamanio, titDifi;
	
	private JRadioButton facil,medio,dificil;
	
	private ButtonGroup bg;
	
    public MenuNorte() {
    	
    	this.setLayout(new BorderLayout());
		JPanel superior = new JPanel();
		superior.setLayout(new GridLayout(1, 1 , 1, 1));
		this.add(superior, BorderLayout.NORTH);
    	
		titTamanio = new JLabel ("Tamaño: ");
		superior.add(titTamanio, BorderLayout.LINE_START);
        opciones=new JComboBox<String>();
        opciones.setBounds(1,1,1,1);
        
        superior.add(opciones, BorderLayout.AFTER_LAST_LINE);
        opciones.addItem("5 x 5");
        opciones.addItem("7 x 7");
        opciones.addItem("10 x 10");
        opciones.addItemListener(this);
        
        titDifi = new JLabel ("Dificultad: ");
		superior.add(titDifi, BorderLayout.LINE_START);
        
        bg=new ButtonGroup();
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
    }
    

    public void itemStateChanged(ItemEvent e){
        if (e.getSource()==opciones) {
            String seleccionado=(String)opciones.getSelectedItem();
            //setTitle(seleccionado);
        }else if (e.getSource() == facil) {
            // Handle radio1 selection
        } else if (e.getSource() == medio) {
            // Handle radio2 selection
        } else if (e.getSource() == dificil) {
            // Handle radio3 selection
        }
    }
    

	

}

