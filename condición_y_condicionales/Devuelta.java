import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import javax.swing.*;
public class Devuelta {
    public static void main(String[] args) {
        DecimalFormat formatea = new DecimalFormat("###,###.##");

        int devuelta = 0, falta = 0;

        int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor a pagar:"));
        int recibido = Integer.parseInt(JOptionPane.showInputDialog("Valor recibido:"));

        falta = valor - recibido;
        devuelta = recibido - valor;
        
        if (valor > recibido) {
            JOptionPane.showMessageDialog(null, "El valor pagado es menor al valor a pagar, hacen falta $" + formatea.format(falta));
        } else if (valor == recibido) {
            JOptionPane.showMessageDialog(null, "No hay devuelta");
        } else {
            JOptionPane.showMessageDialog(null, "La devuelta es de $" + formatea.format(devuelta));
        }
        
        
    }
}
