/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examplo01;

/**
 *
 * @author Usuario
 */

import javax.swing.*;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Cual es tu nombre");
        JOptionPane.showMessageDialog(null, "SAludos: " + nombre);
    }
}
