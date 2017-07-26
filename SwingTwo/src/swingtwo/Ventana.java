package swingtwo;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    PanelCenter panelCenter;
    PanelEnd panelEnd;
    public Ventana() {
        super("Swing two");        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                
        Container mainPanel = this.getContentPane();
        
        panelCenter = new PanelCenter();
        panelEnd = new PanelEnd();
        
        mainPanel.add(panelCenter, BorderLayout.CENTER);
        mainPanel.add(panelEnd, BorderLayout.PAGE_END);
        
        this.pack();
        this.setVisible(true);
        
    }
}
