/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exawin;

import javax.swing.*;
import javax.swing.UIManager.*;

/**
 *
 * @author Usuario
 */
public class ExaWin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
	{   
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    JDialog.setDefaultLookAndFeelDecorated(true);
	    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");            
	}
	catch (Exception e)
	{
	    e.printStackTrace();
        }
        cExaframe Ven = new cExaframe();
        Ven.setVisible(true);
    }
}
