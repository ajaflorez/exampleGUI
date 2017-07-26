import javax.swing.*;

public class EjemploVentana{

public static void main(String[] args){
    Ventana ven = new Ventana();
    ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ven.show();
}
}//fin EjemploVentana

class Ventana extends JFrame{
public Ventana(){
    super("Primer Form");
    setSize(350,250); //Largo, Ancho
  }
}
