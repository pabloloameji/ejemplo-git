import javax.swing.*;

public class Edad {
    public static void main(String[] args) {

        int año = 0, nacimiento = 0, calcu = 0, edad = 0;
        byte mes = 0, dia = 0, dian = 0, mesn = 0;

        String dato1 = JOptionPane.showInputDialog("Digite el año actual:");
        String dato2 = JOptionPane.showInputDialog("Digite el mes actual:");
        String dato3 = JOptionPane.showInputDialog("Digite el dia actual:");
        String dato4 = JOptionPane.showInputDialog("Digite el año en el que nació:");
        String dato5 = JOptionPane.showInputDialog("Digite el numero del mes en que nació:");
        String dato6 = JOptionPane.showInputDialog("Digite el numero del dia en que nació:");

        año = Integer.parseInt(dato1);
        mes = Byte.parseByte(dato2);
        dia = Byte.parseByte(dato3);
        nacimiento = Integer.parseInt(dato4);
        dian = Byte.parseByte(dato5);
        mesn = Byte.parseByte(dato6);
        calcu = año - nacimiento;

        if (año < nacimiento) {
            JOptionPane.showMessageDialog(null, "El año actual no puede ser menor al año de nacimiento");
        } else if (mes >= mesn) {
            if (dia >= dian) {
                JOptionPane.showMessageDialog(null, "su edad es " + calcu);
            } else {
                edad = calcu - 1;
                JOptionPane.showMessageDialog(null, "su edad es " + edad);
            }
        } else if (mesn >= mes) {
            edad = calcu - 1;
            JOptionPane.showMessageDialog(null, "su edad es " + edad);
        } 

    }
}
