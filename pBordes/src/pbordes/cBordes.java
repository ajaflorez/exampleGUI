/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbordes;

/**
 *
 * @author Usuario
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class cBordes extends JFrame implements ActionListener
{
    private JButton BtnEtched;
    private JButton BtnEmpty;
    private JButton BtnLine;
    private JButton BtnMatte;
    private JButton BtnLoweredBevel;
    private JButton BtnRaisedBevel;
    private JButton BtnCompound;
    private JCheckBox ChkTitulo;
    private Border BrdCentro = null;
    public cBordes()
    {
        addWindowListener( new WindowAdapter()
        { public void windowClosing(WindowEvent e) { System.exit(0); } });
        int iWidth = 700, iHeight = 200;
        Toolkit oTk = Toolkit.getDefaultToolkit();
        Dimension oDi = oTk.getScreenSize();
        setSize(iWidth, iHeight);
        setLocation((oDi.width / 2) - (iWidth / 2), (oDi.height / 2) - (iHeight / 2));
        setTitle("Botones de Estado");
        setResizable(false);
        //-----------------------------------
        JPanel PnlBajo = new JPanel();
        BtnEtched = new JButton("Etched");
        BtnEmpty = new JButton("Empty");
        BtnLine = new JButton("Line");
        BtnMatte = new JButton("Matte");
        BtnLoweredBevel = new JButton("LoweredBevel");
        BtnRaisedBevel = new JButton("RaisedBevel");
        BtnCompound = new JButton("Compound");
        ChkTitulo = new JCheckBox("Titulo");
        PnlBajo.add(BtnEtched);
        PnlBajo.add(BtnEmpty);
        PnlBajo.add(BtnLine);
        PnlBajo.add(BtnMatte);
        PnlBajo.add(BtnLoweredBevel);
        PnlBajo.add(BtnRaisedBevel);
        PnlBajo.add(BtnCompound);
        PnlBajo.add(ChkTitulo);
        
        Border borde = BorderFactory.createEtchedBorder();
        Border BrdBajo = BorderFactory.createTitledBorder(borde, "Tipos de Borde");
        PnlBajo.setBorder(BrdBajo);
        
        Container oCon = getContentPane();
        oCon.setLayout(new BorderLayout());
        oCon.add(PnlBajo, "South");
        
        BtnEtched.addActionListener(this);
        BtnEmpty.addActionListener(this);
        BtnLine.addActionListener(this);
        BtnMatte.addActionListener(this);
        BtnLoweredBevel.addActionListener(this);
        BtnRaisedBevel.addActionListener(this);
        BtnCompound.addActionListener(this);
        ChkTitulo.addActionListener(this);
    }
    public void actionPerformed(ActionEvent evt)
    {
        Object oOrigen = evt.getSource();
        JPanel PnlCentro = new JPanel();
        if(oOrigen == BtnEtched)
        BrdCentro = BorderFactory.createEtchedBorder();
        else if(oOrigen == BtnEmpty)
        BrdCentro = BorderFactory.createEmptyBorder();
        else if(oOrigen == BtnLine)
        BrdCentro = BorderFactory.createLineBorder(Color.RED);
        else if(oOrigen == BtnMatte)
        BrdCentro = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GREEN);
        else if(oOrigen == BtnLoweredBevel)
        BrdCentro = BorderFactory.createLoweredBevelBorder();
        else if(oOrigen == BtnRaisedBevel)
        BrdCentro = BorderFactory.createRaisedBevelBorder();
        else if(oOrigen == BtnCompound)
        BrdCentro = BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),
        BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GREEN));
        if(ChkTitulo.isSelected())
        {
        Border BrdTitulo = BorderFactory.createTitledBorder(BrdCentro, "Titulito");
        PnlCentro.setBorder(BrdTitulo);
        }
        else
        PnlCentro.setBorder(BrdCentro);
        Container oCon = getContentPane();
        oCon.add(PnlCentro, "Center");
        validate();
    }
    public static void main(String[] args)
    {
        cBordes FrmMain = new cBordes();
        FrmMain.setVisible(true);
    }
}