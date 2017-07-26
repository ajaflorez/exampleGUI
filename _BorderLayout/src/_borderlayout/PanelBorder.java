
package _borderlayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
     These areas are specified by the BorderLayout constants:
        PAGE_START
        PAGE_END
        LINE_START
        LINE_END
        CENTER
*/
public class PanelBorder extends JPanel{
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    
    public PanelBorder() {
        super(new BorderLayout());
        boton1 = new JButton("Boton 1 - PAGE_START");
        boton2 = new JButton("Boton 2 - PAGE_END");
        boton3 = new JButton("Boton 3 - LINE_START");
        boton4 = new JButton("Boton 4 - LINE_END");
        boton5 = new JButton("Boton 5 - CENTER");
        
        //this.setLayout(new BorderLayout());
        
        this.add(boton1, BorderLayout.PAGE_START);
        this.add(boton2, BorderLayout.PAGE_END);
        this.add(boton3, BorderLayout.LINE_START);
        this.add(boton4, BorderLayout.LINE_END);
        this.add(boton5, BorderLayout.CENTER);
        
    }
}
