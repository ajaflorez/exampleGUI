package vista;


import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelCenter extends JPanel{
    Border brdCenter;
    Border brdTitulo;
    JLabel lblCenter;
    
    public PanelCenter() {
        this.setLayout(new GridLayout(2, 2));
        brdCenter = BorderFactory.createEtchedBorder();
        brdTitulo = BorderFactory.createTitledBorder(brdCenter, "Principal");
        this.setBorder(brdTitulo);
        
        lblCenter = new JLabel("Color Verder");
        this.add(lblCenter);
        
        
        
    }
}
