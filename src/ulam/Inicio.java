package ulam;
import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {
        Numero n = new Numero();
        n.capturar();
        JOptionPane.showMessageDialog(null, n.obtener());
    }
    
}
