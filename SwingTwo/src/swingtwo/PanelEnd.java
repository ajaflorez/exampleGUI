
package swingtwo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelEnd extends JPanel implements ActionListener{
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    
    ImageIcon iconoO; 
    ImageIcon iconoX;
    
    public PanelEnd() {
        this.setLayout(new FlowLayout());
        
        iconoO = new ImageIcon(this.getClass().getResource("O.png"));
        iconoX = new ImageIcon(this.getClass().getResource("X.png"));
        
        
        boton1 = new JButton("Inicio", iconoO);
        boton2 = new JButton("Segundo");
        boton3 = new JButton("Tercero");
        boton4 = new JButton("Cuarto");
        boton5 = new JButton("Quinto");
        boton5.setIcon(iconoX);
        
        boton5.addActionListener(this);
        
        /*boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doClickBoton5(e);
            }
        });*/
        
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(boton5);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {        
        Object objeto = e.getSource();
        
        if(objeto == boton1) {
            
        } else if(objeto == boton2) {
            
        } else if(objeto == boton3) {
            
        } else if(objeto == boton4) {
            
        } else if(objeto == boton5) {
            doClickBoton5(e);
        }
    }
    public void doClickBoton5(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Mensaje de Prueba", "Titulo", JOptionPane.INFORMATION_MESSAGE);
        this.setBackground(Color.red);
    }
    
    
}
