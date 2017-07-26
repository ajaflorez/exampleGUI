
package tictactoe;

import java.awt.GridLayout;
import javax.swing.JPanel;

public class PanelTTT extends JPanel{
    XOButton[] boton = new XOButton[9];
    
    public PanelTTT() {
        this.setLayout(new GridLayout(3, 3));
        for(int i=0; i<9; i++) {
            boton[i] = new XOButton();
            
            this.add(boton[i]);
        }
        
    }
}
