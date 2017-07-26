/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exawin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class cExaframe extends JFrame{
    public cExaframe()
    {
        addWindowListener( new WindowAdapter()
        { public void windowClosing(WindowEvent e) { System.exit(0); } });
        
        int iWidth = 400, iHeight = 200;
        Toolkit oTk = Toolkit.getDefaultToolkit();
        Dimension oDi = oTk.getScreenSize();
        setSize(iWidth, iHeight);
        setLocation((oDi.width / 2) - (iWidth / 2), (oDi.height / 2) - (iHeight / 2));
        
        setTitle("Ventanita panel");
        
        cExapanel Lito = new cExapanel();
        Container Cont = getContentPane();
        
        //Cont.setLayout(null);
        //Cont.setLayout(new FlowLayout());
        Cont.setLayout(new BorderLayout());
        
        Cont.add(Lito, "Center");        
        
    }
}
