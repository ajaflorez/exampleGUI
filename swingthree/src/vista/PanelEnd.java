package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelEnd extends JPanel{
    JButton btnUno;
    JComboBox<String> cmbColor; 
    String[] strColors = {"Amarillo", "Rojo", "Azul", "Verder"};
    
    public PanelEnd() {
        this.setLayout(new FlowLayout());
        
        btnUno = new JButton("Boton Uno");        
        cmbColor = new JComboBox<String>(strColors);        
        
        this.add(btnUno);
        this.add(cmbColor);
        
    }

    
}
