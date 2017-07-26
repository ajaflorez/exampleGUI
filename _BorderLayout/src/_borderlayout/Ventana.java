/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _borderlayout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JFrame;

/*
    Several AWT and Swing classes provide layout managers for general use:
        BorderLayout
        BoxLayout
        CardLayout
        FlowLayout
        GridBagLayout
        GridLayout
        GroupLayout
        SpringLayout
*/

public class Ventana extends JFrame {
    
    public Ventana() {
        super("Titulo");
        

        Container panel = this.getContentPane(); 
        
        panel.add(new PanelBorder(),BorderLayout.CENTER);
        panel.add(new PanelBox(),BorderLayout.PAGE_END);
        
        Point punto = new Point(100, 100);
        Dimension medida = new Dimension(500, 300);        
        
        this.setLocation(punto);        
        this.setResizable(true);
        //this.setSize(medida);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        
        this.pack();
        this.setVisible(true);
    }
}
