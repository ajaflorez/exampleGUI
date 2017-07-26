
package tictactoe;

import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JFrame;

public class TicTacToe extends JFrame{
    public PanelTTT panel;
    
    public TicTacToe() {        
        super("TicTacToe");
        
        panel = new PanelTTT();
        this.setSize(400, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       this.setLayout(new BorderLayout());
       this.add(panel,"North");
        
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(10, 10, 100, 100);
    }
    
}
