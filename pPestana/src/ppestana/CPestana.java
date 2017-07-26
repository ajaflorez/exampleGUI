/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppestana;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class CPestana extends JFrame implements ActionListener
{
private JTabbedPane TPestana;
private JButton CDMensagem1;
private JButton CDMensagem2;
private JButton CDMensagem3;
private JButton CDConfirmacion1;
private JButton CDConfirmacion2;
private JButton CDConfirmacion3;
private JButton CDConfirmacion4;
private JLabel LabelConfirmacion;
private JButton CDOpcion1;
private JLabel LabelOpcion;
private JButton CDEntrada1;
private JButton CDEntrada2;
private JButton CDEntrada3;
private JLabel LabelEntrada;
private JButton CDArchivo1;
private JLabel LabelArchivo1;
private JLabel LabelArchivo2;
private JButton CDColor1;
private JLabel LabelColor;
public CPestana()
{
addWindowListener(new WindowAdapter()
{public void windowClosing(WindowEvent e){System.exit(0);}});
setSize(450,150);
setLocation(300,200);
setTitle("Pestañas y Cajas de dialogos ");
Container P = getContentPane();
TPestana = new JTabbedPane();
JPanel PCxDlgMensagem = new JPanel();
CDMensagem1 = new JButton("Mensaje 1");
CDMensagem2 = new JButton("Mensaje 2");
CDMensagem3 = new JButton("Mensaje 3");
PCxDlgMensagem.add(CDMensagem1);
PCxDlgMensagem.add(CDMensagem2);
PCxDlgMensagem.add(CDMensagem3);
JPanel PCxDlgConfirmacao = new JPanel();
CDConfirmacion1 = new JButton("Confirmación 1");
CDConfirmacion2 = new JButton("Confirmación 2");
CDConfirmacion3 = new JButton("Confirmación 3");
CDConfirmacion4 = new JButton("Confirmación 4");
LabelConfirmacion = new JLabel("Retorno:");
PCxDlgConfirmacao.add(CDConfirmacion1);
PCxDlgConfirmacao.add(CDConfirmacion2);
PCxDlgConfirmacao.add(CDConfirmacion3);
PCxDlgConfirmacao.add(CDConfirmacion4);
PCxDlgConfirmacao.add(LabelConfirmacion);
JPanel PCxDlgOpcao = new JPanel();
CDOpcion1 = new JButton("Opción 1");
LabelOpcion = new JLabel("Retorno:");
PCxDlgOpcao.add(CDOpcion1);
PCxDlgOpcao.add(LabelOpcion);
JPanel PCxDlgEntrada = new JPanel();
CDEntrada1 = new JButton("Entrada 1");
CDEntrada2 = new JButton("Entrada 2");
CDEntrada3 = new JButton("Entrada 3");
LabelEntrada = new JLabel("Retorno:");
PCxDlgEntrada.add(CDEntrada1);
PCxDlgEntrada.add(CDEntrada2);
PCxDlgEntrada.add(CDEntrada3);
PCxDlgEntrada.add(LabelEntrada);
JPanel PCxDlgArquivo = new JPanel();
CDArchivo1 = new JButton("Archivo 1");
LabelArchivo1 = new JLabel("Retorno:");
LabelArchivo2 = new JLabel("Seleción:");
PCxDlgArquivo.add(CDArchivo1);
PCxDlgArquivo.add(LabelArchivo1);
PCxDlgArquivo.add(LabelArchivo2);
JPanel PCxDlgCor = new JPanel();
CDColor1 = new JButton("Color 1");
LabelColor = new JLabel("Retorno:");
PCxDlgCor.add(CDColor1);
PCxDlgCor.add(LabelColor);
TPestana.addTab("Mensaje",PCxDlgMensagem);
TPestana.addTab("Confirmacion",PCxDlgConfirmacao);
TPestana.addTab("Opción",PCxDlgOpcao);
TPestana.addTab("Entrada",PCxDlgEntrada);
TPestana.addTab("Archivo",PCxDlgArquivo);
TPestana.addTab("Color",PCxDlgCor);
P.add(TPestana);
CDMensagem1.addActionListener(this);
CDMensagem2.addActionListener(this);
CDMensagem3.addActionListener(this);
CDConfirmacion1.addActionListener(this);
CDConfirmacion2.addActionListener(this);
CDConfirmacion3.addActionListener(this);
CDConfirmacion4.addActionListener(this);
CDOpcion1.addActionListener(this);
CDEntrada1.addActionListener(this);
CDEntrada2.addActionListener(this);
CDEntrada3.addActionListener(this);
CDArchivo1.addActionListener(this);
CDColor1.addActionListener(this);
}
public void actionPerformed(ActionEvent evt)
{
Object origem = evt.getSource();
int retorno = 0;
String valorRet = null;
Icon icone = new ImageIcon("LogoSun.gif");
if (origem == CDMensagem1)
JOptionPane.showMessageDialog(null, "Esta es una Caja de diálogo de Mensaje");
else if (origem == CDMensagem2)
JOptionPane.showMessageDialog(null, "Esta es una Caja de diálogo de Mensaje",
"Mensajito", JOptionPane.WARNING_MESSAGE);
else if (origem == CDMensagem3)
JOptionPane.showMessageDialog(null, "Esta es una Caja de diálogo de Mensaje",
"Mensajitos", JOptionPane.WARNING_MESSAGE, icone);
else if (origem == CDConfirmacion1)
{
retorno = JOptionPane.showConfirmDialog(null,"Confirma Operación?");
LabelConfirmacion.setText("Retorno: " + retorno);
}
else if (origem == CDConfirmacion2)
{
retorno = JOptionPane.showConfirmDialog(null,"Confirma Operación?",
"Confirmación", JOptionPane.YES_NO_OPTION);
LabelConfirmacion.setText("Retorno: " + retorno);
}
else if (origem == CDConfirmacion3)
{
retorno = JOptionPane.showConfirmDialog(null,"Confirma Operación?",
"Confirmación", JOptionPane.YES_NO_OPTION,
JOptionPane.WARNING_MESSAGE);
LabelConfirmacion.setText("Retorno: " + retorno);
}
else if (origem == CDConfirmacion4)
{
retorno = JOptionPane.showConfirmDialog(null,"Confirma Operación?",
"Confirmação", JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE, icone);
LabelConfirmacion.setText("Retorno: " + retorno);
}
else if (origem == CDOpcion1)
{
Object[] opciones = { "OK", "Cancelar", "Probar" };
retorno = JOptionPane.showOptionDialog(null,
"Esta es una Caja de diálogo de Opción",
"Opción",JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null,
opciones, opciones[0]);
LabelOpcion.setText("Retorno: " + retorno);
}
else if (origem == CDEntrada1)
{
valorRet = JOptionPane.showInputDialog(null, "Digite un valor");
LabelEntrada.setText("Retorno: " + valorRet);
}
else if (origem == CDEntrada2)
{
valorRet = JOptionPane.showInputDialog(null, "Digite um valor",
"Entrada", JOptionPane.QUESTION_MESSAGE);
LabelEntrada.setText("Retorno: " + valorRet);
}
else if (origem == CDEntrada3)
{
Object[] valores= {"Manzanas","Peras","Naranjas","Uvas"};
Object valorSelec = JOptionPane.showInputDialog(null, "Escoja una opción",
"Entrada", JOptionPane.INFORMATION_MESSAGE, null, valores, valores[0]);
LabelEntrada.setText("Retorno: " + valorSelec.toString());
}
else if (origem == CDArchivo1)
{
JFileChooser abreArchivo = new JFileChooser();
abreArchivo.setCurrentDirectory(new File("."));
abreArchivo.setSelectedFile(new File("CPestana.java"));
retorno = abreArchivo.showOpenDialog(this);
LabelArchivo1.setText("Retorno: " + retorno);
if (retorno == JFileChooser.APPROVE_OPTION)
{
File arquivoSelec = abreArchivo.getSelectedFile();
LabelArchivo2.setText("Selección: " + arquivoSelec.getName());
}
else
LabelArchivo2.setText("Selección: Ningún Archivo");
}
else if (origem == CDColor1)
{
JColorChooser abreColor = new JColorChooser();
Color c = abreColor.showDialog(this, "Escoja un color", Color.black);
LabelColor.setForeground(c);
LabelColor.setText("Retorno: " + c.toString());
}
}
public static void main (String[] args)
{
CPestana fr = new CPestana();
fr.setVisible(true);
}
}