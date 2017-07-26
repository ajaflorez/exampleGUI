/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exawin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author Usuario
 */
public class cExapanel extends JPanel implements ActionListener
{
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JPasswordField txtPasswd;
    
    private JButton Btnuno;
    private JButton Btndos;
    private JLabel Lbluno;
    private JLabel Lbldos;
    
    public cExapanel()
    {
        txtCodigo = new JTextField(10);
        txtNombre = new JTextField("Ingrese Nombre");
        txtPasswd = new JPasswordField(10);
        
        Btnuno = new JButton("Uno");
        Btndos = new JButton("Dos");
        Lbluno = new JLabel("Etiqueta uno");
        Lbldos = new JLabel("Etiqueta dos");        
        
        add(txtCodigo);
        add(txtNombre);
        add(txtPasswd);
    
        add(Btnuno);
        add(Lbluno);
        add(Btndos);        
        add(Lbldos);
        
        txtCodigo.setToolTipText("Ingrese su texto");
        txtCodigo.setText("Codigo");
        
        txtCodigo.addActionListener(this);
        txtNombre.addActionListener(this);
        txtPasswd.addActionListener(this);
        
        Btnuno.addActionListener(this);
        Btndos.addActionListener(this);
        
        Border borde = BorderFactory.createEtchedBorder();
        Border BrdTitulo = BorderFactory.createTitledBorder(borde, "Titulito");
        setBorder(BrdTitulo);
  

    }
    public void actionPerformed(ActionEvent evt)
    {
        Object Origen = evt.getSource();
        if(Origen ==  txtCodigo)
            JOptionPane.showMessageDialog(null, "Codigo " + evt.getActionCommand());
        else if(Origen == txtNombre)
            JOptionPane.showMessageDialog(null, "Nombre " + evt.getActionCommand());
        else if(Origen == txtPasswd)
            JOptionPane.showMessageDialog(null, "Password " + evt.getActionCommand());
        
        else if(Origen == Btnuno)
        {
            Lbluno.setText("Hizo Click en Uno");
            Lbluno.setVerticalTextPosition(SwingConstants.BOTTOM);
            Lbluno.setHorizontalTextPosition(SwingConstants.RIGHT);
            Btnuno.setEnabled(false);
        }
        else if(evt.getActionCommand().equals("Dos"))
        {
            Lbldos.setText("Hizo Click en el Boton " + Btndos.getText());
            Lbldos.setBackground(Color.red);
            Lbldos.setForeground(Color.BLUE);
            Btnuno.setEnabled(true);
        }
    }        
}