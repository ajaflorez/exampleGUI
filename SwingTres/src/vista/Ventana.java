package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    Container contenedor;
    JPanel panelBoton;
    Color colorDefault;
    JMenuBar menuMain;

    public Ventana(){
        super("Game Mosters");  // igual a colocar setTitle()
        iniciar();
        establecerLayout();
        crearPanelBoton();   
        crearMenu();
        this.setVisible(true);
        //this.repaint();
    }

    public void iniciar() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   // para cerra la ventana
        this.setSize(700, 600); // establece el tamaño        
        this.setLocationRelativeTo(null);   // ubica la ventana al centro
        this.setResizable(false);               
    }    
    public void establecerLayout() {
        // contenedor que por defecto tiene el BorderLayout
        contenedor = this.getContentPane(); // obtiene el contenedor
        colorDefault = contenedor.getBackground();  // obtenido el color de fondo
        contenedor.setBackground(Color.BLACK);    // Cambiando el color de fondo del Contenedor
        
    }
    public void crearPanelBoton() {
        panelBoton = new JPanel(new FlowLayout());
        panelBoton.setBackground(colorDefault);
        panelBoton.add(new JButton("Salir"));
        contenedor.add(panelBoton, BorderLayout.PAGE_END);
    }
    public void crearMenu() {
        menuMain = new JMenuBar();  // Instanciando el JBarMenu
        
        JMenu menuJuego = new JMenu("Juego");   // Creando el Menu juego
                
        JMenuItem itemNuevo = new JMenuItem("Nuevo Juego"); // Creando Item Nuevo
        JMenuItem itemSalir = new JMenuItem("Salir");   // Creando el Item Salir
        
        JMenu menuOpcion = new JMenu("Opciones");   // Cerando el Menu Opciones
        
        JMenuItem itemRapido = new JMenuItem("Rapido"); // Creando el Item Rapido
        JMenuItem itemLento = new JMenuItem("Lento");   // Creando el Item Lento
        
        menuOpcion.add(itemRapido); // Agrego el Item rapido al menu Opciones
        menuOpcion.add(itemLento);  // Agrego el Item lento al menu Opciones
                
        menuJuego.add(itemNuevo);   // Agrego el Item Nuevo al menu Juego
        menuJuego.addSeparator();   // Agrego un separador
        menuJuego.add(menuOpcion);  // Agrego el menu Opciones al menu Juego
        menuJuego.add(itemSalir);   // Agrego el Item Salir al menu Juego
        
        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemLinea = new JMenuItem("Ayuda en Linea");
        
        menuAyuda.add(itemLinea);
        
        menuMain.add(menuJuego);    // // Agrego el menu juego a la JMenuBar menuMain
        menuMain.add(menuAyuda);
        
        this.setJMenuBar(menuMain); // Establesco el menuMain
        
    }

    @Override
    public void paint(Graphics g) { // Utilizar el objeto "g" para dibujar 
        super.paint(g);     // Dibuja los objetos por defecto
        g.setColor(Color.YELLOW);
        g.drawRect(100, 100, 200, 150);
        g.setColor(Color.RED);
        g.drawOval(200, 200, 100, 150);
        g.setColor(Color.WHITE);
        g.drawLine(150, 150, 200, 300);
        
        g.drawString("HOLA CHICOS", 100, 150);
        
        
    }

    
    
    
    
    
}
