package swinguno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;  // importar el JFrame - Ventana
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingUno {

    public static void main(String[] args) {
        
        
                
        JFrame ventana; // Declaracion
        ventana = new JFrame("Titulo Ventana");     // Instanciación
        // Permite cerra la ventana cuando se hace click en la X
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setSize(500, 400);  // Especifica el tamaño de la Ventana
        ventana.setLocation(250, 100);  // Especifica la localizacionde la ventana
        
        ImageIcon imagen;   // Crea un objeto que manipula las imagenes
        // obtiene el recurso (home.png) y no instancia al objeto imagen
        //imagen = new ImageIcon(getClass().getResource("home.png"));
        imagen = new ImageIcon("C:\\Users\\sistemas-16\\Desktop\\home.png");
        //imagen = ventana.getClass().getResource("home.png");
        
        // Crenado Objetos
        JPanel panel = new JPanel();    // Crea un panel que contiene los objetos
        
        JButton boton1 = new JButton("Boton Uno", imagen);  // Creo el Boton
        JButton boton2 = new JButton("Boton Dos");  // Creo el Boton
        JButton boton3 = new JButton(imagen);  // Creo el Boton
        JButton boton4 = new JButton("Boton Cuatro");  // Creo el Boton
        JButton boton5 = new JButton("Boton Cinco");  // Creo el Boton
        
        JTextField texto = new JTextField("LPS", 15);
        
        // Dandole vida a los objetos con ActionListener
        // Action: Accion a realizar
        // Listener: Escuchador de los eventos
        boton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cadena = texto.getText();
                cadena = cadena + ", Hola Mundo";
                texto.setText(cadena);
            }
        });
        
        boton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("LPS");
            }
        });
        
        
        // Agregando los objetos al Panel 
        panel.add(texto);
        panel.add(boton1);  // Agregar el boton al panel
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);    
        
        panel.add(new JButton("boton 6"));
        
        ventana.add(panel);     // Agrego el panel a la ventana
        
        ventana.setVisible(true);   // Hace que la venta se pueda ver
        
        
    }
    
}
