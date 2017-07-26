
package frame;

import javax.swing.JOptionPane;

public class FillInBlank {
    String[] ans;
    String[] textoOpcion = {"Primero", "Segundo", "Tercero", "Cuarto"};
    int indexResult;

    public FillInBlank() {
        ans = new String[11];
        
        /*
        messageType
            Defines the style of the message. The Look and Feel manager may lay out the dialog differently depending on this value, and will often provide a default icon. The possible values are:
            ERROR_MESSAGE
            INFORMATION_MESSAGE
            WARNING_MESSAGE
            QUESTION_MESSAGE
            PLAIN_MESSAGE
        */
        
        /*
        optionType
            Defines the set of option buttons that appear at the bottom of the dialog box:
            DEFAULT_OPTION
            YES_NO_OPTION
            YES_NO_CANCEL_OPTION
            OK_CANCEL_OPTION
        */
        
        // Mostrar Messages
        // showMessageDialog(Component parentComponent, Object message, String title, int messageType)        
        JOptionPane.showMessageDialog(null, "texto a mostrar", "Texto Titulo",JOptionPane.INFORMATION_MESSAGE);
        
        // showOptionDialog(Component parentComponent, Object message, String title, int optionType, 
        //          int messageType, Icon icon, Object[] options, Object initialValue)
        indexResult = JOptionPane.showOptionDialog(null, "Texto mensaje", "Texto Titulo", 0, JOptionPane.QUESTION_MESSAGE, null, textoOpcion, "Segundo");
        ans[0] = textoOpcion[indexResult];
        
        //  showInputDialog(Component parentComponent, Object message, String title, int messageType)
        ans[1] = JOptionPane.showInputDialog(null, "Ingrese el dato", "Titulo de Input", JOptionPane.QUESTION_MESSAGE);
        
        // showConfirmDialog(Component parentComponent, Object message, String title, int optionType)
        int i = JOptionPane.showConfirmDialog(null, "Are you sure", "Titulo Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    
}
