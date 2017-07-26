
package swingtwo;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelCenter extends JPanel implements ActionListener{
    JTextField campo;
    JCheckBox chkItalic;
    JCheckBox chkBold;
    JRadioButton radTime;
    JRadioButton radArial;
    JRadioButton radSerif;
    ButtonGroup btnGroup;
    
    Border borde;
    Border bordeTitulo;
    
    
    public PanelCenter() {
        this.setLayout(new FlowLayout());
        borde = BorderFactory.createEtchedBorder();
        bordeTitulo = BorderFactory.createTitledBorder(borde, "Titulo Borde");
        
        this.setBorder(bordeTitulo);
        
        campo = new JTextField("Mensajito de texto", 15);
        chkItalic = new JCheckBox("Italic");
        chkBold = new JCheckBox("Bold");
        radTime = new JRadioButton("Time New Roman", true);
        radArial = new JRadioButton("Arial", false);
        radSerif = new JRadioButton("San Serif", false);
        
        btnGroup = new ButtonGroup();
        btnGroup.add(radTime);
        btnGroup.add(radArial);
        btnGroup.add(radSerif);
                
        this.add(campo);
        this.add(chkItalic);
        this.add(chkBold);
        this.add(radTime);
        this.add(radArial);
        this.add(radSerif);
        
        chkItalic.addActionListener(this);
        chkBold.addActionListener(this);
        radTime.addActionListener(this);
        radArial.addActionListener(this);
        radSerif.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object objeto = e.getSource();
        Font font = campo.getFont();
        
        String fuente = font.getName();
        int bold = Font.PLAIN;
        int italic = Font.PLAIN;
        
        if(chkItalic.isSelected()) {
            italic = Font.ITALIC;
            borde = BorderFactory.createRaisedBevelBorder();
            this.setBorder(borde);
        }
        else
            italic = Font.PLAIN;
        if(chkBold.isSelected()) {
            bold = Font.BOLD;
            bordeTitulo = BorderFactory.createTitledBorder(borde, "Titulito");
            this.setBorder(bordeTitulo);
        }
        else
            bold = Font.PLAIN;
        
        if(objeto == radTime) {
            fuente = "TimeNewRoman";  
            borde = BorderFactory.createLineBorder(Color.RED);
            this.setBorder(borde);
        } else if(objeto == radArial) {
            fuente = "Arial";
            borde = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GREEN);
            this.setBorder(borde);
        } else if(objeto == radSerif) {
            fuente = "Serif";
            borde = BorderFactory.createLoweredBevelBorder();
            this.setBorder(borde);
        }
        
        campo.setFont(new Font(fuente, italic + bold, 12));
        
        
        
    }
    
}
