import javax.swing.*;
import java.lang.Math;
public class JuegoApuestas {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Preciona 'OK' para jugar");

        int numero = (int) Math.floor(Math.random()*(6-1+1)+1);

        switch (numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "Todos ponen 100 en la bolsa");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Ganas la mitad del dinero de la bolsa");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Pones 200 en la bolsa");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Pones todo tu dinero en la bolsa");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Ganas la mitad del dinero de tus compañeros");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Ganas todo el dinero de la bolsa");
                break;
            default:
                break;
        }
    }
}
