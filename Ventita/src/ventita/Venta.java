/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventita;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Usuario
 */
public class Venta extends JFrame
{
    public Venta()
    {        
        /*addWindowListener( new WindowAdapter()
        { public void windowClosing(WindowEvent e) { System.exit(0); } });*/
        
        setTitle("Ventanita");
        setSize(300, 200);
        setResizable(true);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel mio = new JPanel();
        this.add(mio);  
        
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        
        g.drawOval(100, 100, 100, 50);
        g.fillRect(100, 100, 50, 70);
        
        g.drawLine(20, 60, 200, 60);
    }
    
}

class Mios extends JPanel implements ActionListener
{
    public Mios()
    {
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}