/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import javax.swing.JFrame;
/**
 *
 * @author ADMIN
 */
public class Ventana extends JFrame{
    private Panel panel;
    public Ventana() {
                
        this.setTitle("Mi ventana");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 300);        
        this.setResizable(false);        
        
        panel = new Panel();
        this.add(panel);
        
        this.setVisible(true);
    }
}
