
//import java.util.Scanner;
import java.util.function.Function;

import javax.swing.*;

public class SignoZodiacal {
    public static void main(String[] args) {

        // Scanner dato = new Scanner(System.in);

        String signo = "", texto1 = "", texto2 = "", mensaje = "Su signo Zodiacal es ";

        texto1 = JOptionPane.showInputDialog("Digite el dia de su cumpleaños:");
        texto2 = JOptionPane.showInputDialog("Digite el numero del mes de su cumpleaños:");

        byte dia = Byte.parseByte(texto1);
        byte mes = Byte.parseByte(texto2);

        // System.out.println("Digite el dia de su nacimiento.");
        // byte dia = dato.nextByte();

        // System.out.println("Digite el numero del mes en el que nació");
        // byte mes = dato.nextByte();

        switch (mes) {

            case 1:
                signo = (dia >= 21) ? "Acuario" : "Capricornio";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 2:
                signo = (dia >= 20) ? "Piscis" : "Acuario";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 3:
                signo = (dia >= 21) ? "Aries" : "Piscis";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 4:
                signo = (dia >= 21) ? "Tauro" : "Aries";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 5:
                signo = (dia >= 21) ? "Géminis" : "Tauro";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 6:
                signo = (dia >= 22) ? "Cáncer" : "Géminis";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 7:
                signo = (dia >= 23) ? "Leo" : "Cáncer";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 8:
                signo = (dia >= 24) ? "Virgo" : "Leo";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 9:
                signo = (dia >= 23) ? "Libra" : "Virgo";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 10:
                signo = (dia >= 23) ? "Escorpio" : "Libra";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 11:
                signo = (dia >= 23) ? "Sagitario" : "Escorpio";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            case 12:
                signo = (dia >= 22) ? "Capricornio" : "Sagitario";
                JOptionPane.showMessageDialog(null, "" + mensaje + signo);
                break;
            default:
                System.out.println("Valores ingresados no validos.");
                break;
        }

    }
}
