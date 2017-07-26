
package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class InterfazCLick extends JFrame implements ActionListener{
    JPanel jpanel1;
    JButton jb1, jb2, jb3, jbP1, jbP2, jbP3;
    JLabel msjlabel = new JLabel("");
    
    public InterfazCLick(){
        JFrame jfM = new JFrame("Eventos en Java");
        jfM.setLayout(null);
        
        
        //Metodos que contienen los paneles
        PanelflowJP();
        
        jbP1 = new JButton("Panel 1");jbP2 = new JButton("Panel 2");jbP3 = new JButton("Panel 3");
                        
        //Coordenadas X1, Y1, X2, Y2 en el Frame
        jpanel1.setBounds(20, 20, 450, 200);        
        jfM.add(jpanel1);
        jfM.setLocation(200, 50);
        jfM.setResizable(true);
        jfM.setVisible(true);
        jfM.setSize(550, 500);
        jfM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//fin constructor
    
    public void PanelflowJP(){
        jpanel1 = new JPanel(new FlowLayout());
        JTextField codigotxt = new JTextField(6);
        
        jb1 = new JButton("Buscar");//jb2 = new JButton("Flow B2");jb3 = new JButton("Flow B3");
        jpanel1.add(new JLabel("Ingrese Codigo: "));
        jpanel1.add(codigotxt);
        jpanel1.add(jb1);
        jpanel1.add(msjlabel);
        
        jb1.addActionListener((ActionListener) this);
        
        jpanel1.setVisible(true);
    }//fin bordJP
    
     public void mouseClicked(MouseEvent evento) {
            if (evento.getSource() == jb1){
                msjlabel.setText("Hizo clic en mi botón");
            }
            /*if (evento.getSource() == labelTitulo){
                 etiqueta1.setText("Hizo clic en el Titulo");
             }*/
    }
     
    public static void main(String[] args){
        InterfazCLick ipanel = new InterfazCLick() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
}
