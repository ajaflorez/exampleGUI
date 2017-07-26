package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    Container panelMain;    // Panel Principal
    Toolkit tool;       // Herramienta principal
    Dimension sizeFrame; 
    Dimension sizeScreen;
    Point locationFrame;
    
    PanelEnd panelEnd;
    PanelCenter panelCenter;
    PanelStart panelStart;
    
    
    public Ventana() {
        super("Title");
        panelMain = this.getContentPane();  // obtiene el panel Principal
        panelMain.setLayout(new BorderLayout());
        
        tool = Toolkit.getDefaultToolkit(); // Obtiene el default Toolkit
        sizeFrame = new Dimension(500, 300);    //Establece el tamaño del Frame
        sizeScreen = tool.getScreenSize();  // Obtiene el tamaño de la Pantalla
        // Establecer el punto x,y para colocar al medio el Frame
        locationFrame = new Point((sizeScreen.width/2) - (sizeFrame.width/2), (sizeScreen.height/2) - (sizeFrame.height/2));
        
        panelEnd = new PanelEnd();  // Instanciando el Panel de los botones
        panelCenter = new PanelCenter();
        panelStart = new PanelStart();                
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(sizeFrame);
        this.setLocation(locationFrame);
        this.setResizable(false);
        
        panelEnd.cmbColor.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cmbTemp = (JComboBox)e.getSource();
                String strColor = (String)cmbTemp.getSelectedItem();
                if(strColor.equals("Azul")) {
                    panelCenter.lblCenter.setText(strColor);
                }
            }
        });        
        
        panelMain.add(panelEnd, BorderLayout.PAGE_END);
        panelMain.add(panelCenter, BorderLayout.CENTER);
        panelMain.add(panelStart, BorderLayout.LINE_START);
        
        
        
        this.setVisible(true);
        
    }

    
    
}
