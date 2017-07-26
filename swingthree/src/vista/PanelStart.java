/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author ADMIN
 */
public class PanelStart extends JPanel{
    JList<String> lstFrutas;
    String[] strFrutas = {"Manzana", "Pera", "Manzana", "Naranaja"};
    
    public PanelStart() {
        this.setLayout(new FlowLayout());
        lstFrutas = new JList<String>(strFrutas);
        lstFrutas.setVisibleRowCount(3);
        lstFrutas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
        
        this.add(new JScrollPane(lstFrutas));
    }    
}
