package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class InterfazPanel extends JFrame implements ActionListener{ //Listener de Eventos
    JPanel jpanel1,jpanel2,jpanel3, jpanel4;
    JButton jb1, jb2, jb3, jbP1, jbP2, jbP3;
    
    public InterfazPanel(){
        JFrame jfM = new JFrame("Paneles en Java");
        jfM.setLayout(null);
        
        //Metodos que contienen los paneles
        gridJP(); bordJP(); flowJP();
        
        jbP1 = new JButton("Panel 1");jbP2 = new JButton("Panel 2");jbP3 = new JButton("Panel 3");
                    
        jpanel4 = new JPanel(new FlowLayout()); //filas columnas
        
        //Coordenadas X1, Y1, X2, Y2 en el Frame
        jpanel1.setBounds(20, 20, 200, 200);
        jpanel2.setBounds(240, 10, 400, 250);
        jpanel3.setBounds(10, 270, 400, 430);
        jpanel4.setBounds(20, 310, 300, 340);
        
        jfM.add(jpanel1);jfM.add(jpanel2);jfM.add(jpanel3);jfM.add(jpanel4);
        //jfM.add(jbP1);jfM.add(jbP2);jfM.add(jbP3);
        //numero de filas, columnas, espacio entre filas y columnas
        jpanel4.add(jbP1);jpanel4.add(jbP2);jpanel4.add(jbP3);

        jbP1.addActionListener(this);jbP2.addActionListener(this);jbP3.addActionListener(this);
        
        jfM.setLocation(100, 50);
        jfM.setResizable(true);
        jfM.setVisible(true);
        jfM.setSize(750, 600);
        jfM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jpanel4.setVisible(true);
    }//fin constructor
    
    public void gridJP(){
        jpanel1 = new JPanel(new GridLayout(3,1,5,7)); 
        //numero de filas, columnas, espacio entre filas y columnas
        jb1 = new JButton("Grid B1");jb2 = new JButton("Grid B2");jb3 = new JButton("Grid B3");
        
        jpanel1.add(jb1);jpanel1.add(jb2);jpanel1.add(jb3);
        
        jb1.addActionListener(this);jb2.addActionListener(this);jb3.addActionListener(this);
        
        jpanel1.setVisible(true);
    }//fingridJP
    
    public void bordJP(){
        jpanel2 = new JPanel(new BorderLayout(2,3)); //espacio regiones horizontal y vertical
        jb1 = new JButton("Bord B1");jb2 = new JButton("Bord B2");jb3 = new JButton("Bord B3");
        
        jpanel2.add(jb1,BorderLayout.NORTH);
        jpanel2.add(jb2,BorderLayout.WEST);
        jpanel2.add(jb3,BorderLayout.CENTER);
        
        jb1.addActionListener(this);jb2.addActionListener(this);jb3.addActionListener(this);
        
        jpanel2.setVisible(true);
    }//fin bordJP
    
    public void flowJP(){
        jpanel3 = new JPanel(new FlowLayout());
        jb1 = new JButton("Flow B1");jb2 = new JButton("Flow B2");jb3 = new JButton("Flow B3");
        
        jpanel3.add(jb1);jpanel3.add(jb2);jpanel3.add(jb3);
        
        jb1.addActionListener(this);jb2.addActionListener(this);jb3.addActionListener(this);
        
        jpanel3.setVisible(true);
    }//fin bordJP
    public static void main(String[] args){
        InterfazPanel ipanel = new InterfazPanel() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
}// fin InterfazPanel

