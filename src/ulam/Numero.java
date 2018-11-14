package ulam;
import javax.swing.JOptionPane;

public class Numero {
    int x;
    String s="";
    void capturar()
    {
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
    }
    String obtener()
    {
        s=String.valueOf(x)+"\n";
        while(x!=1)
        {
            if(x%2==0)
            {
                x/=2;
                s=s+x+"\n";
            }
            else
            {
                x=x*3+1;
                s=s+x+"\n";
            }
        }
        return s;
    }
}
