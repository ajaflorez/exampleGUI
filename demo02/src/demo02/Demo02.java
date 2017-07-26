package demo02;

import javax.swing.SwingUtilities;

public class Demo02 {

    public static void main(String[] args) {
        
        // Invocando al metodo invokeLater de la clase SwingUtilities
        // para ejecutar el hilo principal
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });        
    }    
}
