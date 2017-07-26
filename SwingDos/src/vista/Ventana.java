
package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ventana extends JFrame {

    public Ventana(){
        this.setTitle("Titulito");  // Estableciendo el titulo
        this.setLocation(150, 100); // Establecer la localización
        this.setSize(500, 400);     // Establecer el tamaño
        this.setResizable(true);   // Establecto que no se puede modificar el tamaño        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Utilizar el Contenedor que se comporta como JPanel
        // para obtener el Contenedor se llama el metodo getContentPane()
        Container contenedor = this.getContentPane();
        
        // Creando un JPanel para el titulo de la ventana
        JPanel panelTitulo = new JPanel();
        panelTitulo.add(new JLabel("Titulo de la Frame"));
        
        // JPANELBODY
        // Creando un JPanel para el Contenido o Centro
        // Utlizando Layout:
        // - Flowlayout(): Coloca los objeto en forma secuencial
        // - GridLayout(fila, columna): Coloca los objetos en forma de Grid(Grilla, talla, rejilla)
        // - BorderLayout(): Es igual al Contenedor, se ubica los objeto en PAGE_START, LINE_START, ...
        JPanel panelBody = new JPanel();
        
        JLabel etiqueta = new JLabel("Etiqueta");   // Creando una etiqueta
        JTextField field = new JTextField("LPS", 20);   // Creando un TextField para el ingreso de texto
        String[] items = {"TDA", "LPS", "Base de Datos", "Redes", "IA"};    // Creando un array para mostra en el JComboBOx
        JComboBox<String> curso = new JComboBox(items); // Creando un JComboBox para seleccionar
        JCheckBox check = new JCheckBox("verdad?"); // Creando un CheckBox para marcar
        JButton boton3 = new JButton("Boton tres"); // Creando un boton
        JRadioButton radio1 = new JRadioButton("Primero");  // Creando JRadioButton para seleccionar
        JRadioButton radio2 = new JRadioButton("Segundo");  // Creando JRadioButton para seleccionar
        ButtonGroup radioGrupo = new ButtonGroup(); // Creando un grupo de botones para que radio1 y radio2 trabajo en forma conjunta
        radioGrupo.add(radio1); // agregando el radio1 al radioGrupo
        radioGrupo.add(radio2); // agregando el radio1 al radioGrupo
        
        // Agregando los objetos al panelBody
        /*  // Ejemplo de add para el BorderLayout
        panelBody.add(etiqueta, BorderLayout.PAGE_START);
        panelBody.add(field, BorderLayout.LINE_START);
        panelBody.add(curso, BorderLayout.LINE_END);
        panelBody.add(check, BorderLayout.CENTER);
        panelBody.add(boton3, BorderLayout.PAGE_END);*/
        panelBody.add(etiqueta);
        panelBody.add(field);
        panelBody.add(curso);
        panelBody.add(check);
        panelBody.add(boton3);        
        panelBody.add(radio1);
        panelBody.add(radio2);
        
                        
        // Creando un JPanel para los botones
        JPanel panelBoton = new JPanel();   // Declarando e Instanciando el JPanel
        Border bordeBoton = BorderFactory.createEtchedBorder();  // Crea un borde al JPanel
        panelBoton.setBorder(bordeBoton);    // Establece el border al JPanel
        //Creando un objeto ImageIcon para mostrar una imagen y enlaza con el objeto
        // utilizando this.getClass().getResource("archivo.ext");
        ImageIcon image = new ImageIcon(this.getClass().getResource("home.png"));
        JButton boton4 = new JButton("Inicio", image);  // Crear el boton con imagen
        panelBoton.add(boton4); // agreando el boton al Panel
        panelBoton.add(new JButton("Boton dos"));   // agregando un Boton al JPanel
        
        // Agregar los paneles al contenedor
        contenedor.add(panelTitulo, BorderLayout.PAGE_START);
        contenedor.add(panelBody, BorderLayout.CENTER);
        contenedor.add(panelBoton, BorderLayout.PAGE_END);
                
        
     
        
        this.setVisible(true);
    }
    
    
    
}
