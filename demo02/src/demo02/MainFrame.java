package demo02;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
    public MainFrame() {
        this.setTitle("Demo de JFrame");
        
        // Pantalla completa para juegos
        // Frame sin decoraciones
        this.setUndecorated(true);
        // Pantalla completa
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        // Sale del sistema cuando cierra el Frame
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        // Colocando el contenido del Frame
        this.setContentPane(new MainPanel());
        
        // Muestra el frame
        this.setVisible(true);        
    }
}
