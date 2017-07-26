/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo02;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author joao
 */
public class MainPanel extends JPanel {
    public MainPanel() {
        this.setBackground(Color.red);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }
}
