
package frame;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Panel extends JPanel{
    public JButton boton;
    public JTextField field;
    public JTextArea area;
    public JLabel label;
    public JComboBox combo;
    
    public Panel() {
        boton = new JButton("Hola");
        field = new JTextField("Test Field", 20);
        area = new JTextArea("Como estas \n Chocherita", 5, 30);
        label = new JLabel("Nombres: ");
        String[] texto = {"primero", "segundo", "tercero"};
        combo = new JComboBox(texto);
        
        
        
        
        this.add(boton);
        this.add(field);
        this.add(area);
        this.add(label);
        this.add(combo);
        
    }
    
}
