package Windo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
    JButton mio;    // Objeto Boton
    JButton boton;  // Objeto Boton
    JPanel panel;   // Objeto panel
    public Frame() {
        this.setTitle("Mosters Game");
        this.setSize(300, 300);
        this.setResizable(false);
        
        mio = new JButton("Salir"); // Instanciando
        boton = new JButton("Cancelar");        // Instanciando
        panel = new JPanel();   // Instanciando
        
        panel.add(mio);     // Agregando el Boton al Panel
        panel.add(boton);   // Agregando el Boton al Panel
        
        this.add(panel);    // Agregando el panel al Frame
        
        
        
    }
    
}
