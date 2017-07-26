/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _borderlayout;

import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
    LINE_AXIS
        Specifies that components should be laid out in the direction of a line of text as determined by the target container's ComponentOrientation property.
    PAGE_AXIS
        Specifies that components should be laid out in the direction that lines flow across a page as determined by the target container's ComponentOrientation property.    
    X_AXIS
        Specifies that components should be laid out left to right.
    Y_AXIS
        Specifies that components should be laid out top to bottom.
*/

public class PanelBox extends JPanel {
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    
    public PanelBox() {
        
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        
        boton1 = new JButton("Boton 1 - Primero");
        boton2 = new JButton("Boton 2 - Segundo");
        boton3 = new JButton("Boton 3 - Tercero");
        boton4 = new JButton("Boton 4");
        boton5 = new JButton("Boton 5");
        
        
        
        /*boton1.setAlignmentX(Component.RIGHT_ALIGNMENT);
        boton2.setAlignmentX(Component.LEFT_ALIGNMENT);
        boton3.setAlignmentX(Component.CENTER_ALIGNMENT);*/
        
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(boton5);
        
    }
    
}
