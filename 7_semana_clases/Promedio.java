import javax.swing.*;

public class Promedio{
    public static void main(String[] args) {

        /*float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero:"));
        long n3 = Long.parseLong(JOptionPane.showInputDialog("Digite el tercer numero:"));
        short n4 = Short.parseShort(JOptionPane.showInputDialog("Digite el cuarto numero:"));
        byte n5 = Byte.parseByte(JOptionPane.showInputDialog("Digite el quinto numero:"));
        */

        float n1 = 5f; 
        int n2 = 6; 
        long n3 = 7; 
        short n4 = 0; 
        byte n5 = 0;
 
        double promedio = (n1 + n2 + n3 + n4 + n5) / 5;

        //JOptionPane.showMessageDialog(null, "El promedio de los 5 números es: " + promedio);

        System.out.println("float -> " + n1);
        System.out.println("int -> " + n2);
        System.out.println("long -> " + n3);
        System.out.println("short -> " + n4);
        System.out.println("byte -> " + n5);
        System.out.println("El resultado es " + promedio);

    }
}