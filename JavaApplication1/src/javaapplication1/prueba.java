import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class prueba extends JFrame
{
   public prueba()
   {
      super("Ejemplo 1");
      JButton boton = new JButton("Mostrar dialogo");
      boton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               JOptionPane.showMessageDialog(null,
               "Y así­ se ve un cuadro de dialogo de error",
               "Mensaje",JOptionPane.ERROR_MESSAGE);
            }
         }
      );
      getContentPane().add(new JLabel("Asi se ve un Frame"),
         BorderLayout.NORTH);
      getContentPane().add(boton);
      setSize(200,80);
      setVisible(true);
   }
   public static void main(String args[])
   {
      JFrame.setDefaultLookAndFeelDecorated(true);
      JDialog.setDefaultLookAndFeelDecorated(true);
      prueba ventana = new prueba();
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}