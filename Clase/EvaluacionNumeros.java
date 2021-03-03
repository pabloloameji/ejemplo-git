import javax.swing.*;
public class EvaluacionNumeros {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9= 0, n10 = 0;
  
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero:"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite el cuarto numero:"));
        n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite el quinto numero:"));
        n6 = Integer.parseInt(JOptionPane.showInputDialog("Digite el sexto numero:"));
        n7 = Integer.parseInt(JOptionPane.showInputDialog("Digite el septimo numero:"));
        n8 = Integer.parseInt(JOptionPane.showInputDialog("Digite el octavo numero:"));
        n9 = Integer.parseInt(JOptionPane.showInputDialog("Digite el noveno numero:"));
        n10 = Integer.parseInt(JOptionPane.showInputDialog("Digite el decimo numero:"));


        Evalua objeto1 = new Evalua(n1);
        Evalua objeto2 = new Evalua(n2);
        Evalua objeto3 = new Evalua(n3);
        Evalua objeto4 = new Evalua(n4);
        Evalua objeto5 = new Evalua(n5);
        Evalua objeto6 = new Evalua(n6);
        Evalua objeto7 = new Evalua(n7);
        Evalua objeto8 = new Evalua(n8);
        Evalua objeto9 = new Evalua(n9);
        Evalua objeto10 = new Evalua(n10);

  
    }
}









/*
        if (n1 < 0) {
            JOptionPane.showMessageDialog(null, "el primer numero es negativo");
        } else if (n1 < 100) {
            JOptionPane.showMessageDialog(null, "el primer numero es menor a 100");
        } else if (n1 > 5000) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor a 5000");
        }

        if (n2 < 0) {
            JOptionPane.showMessageDialog(null, "el segundo numero es negativo");
        } else if (n2 < 100) {
            JOptionPane.showMessageDialog(null, "el primer numero es menor a 100");
        } else if (n2 > 5000) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor a 5000");
        }

        if (n3 < 0) {
            JOptionPane.showMessageDialog(null, "el primer numero es negativo");
        } else if (n3 < 100) {
            JOptionPane.showMessageDialog(null, "el primer numero es menor a 100");
        } else if (n3 > 5000) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor a 5000");
        }

        if (n4 < 0) {
            JOptionPane.showMessageDialog(null, "el primer numero es negativo");
        } else if (n4 < 100) {
            JOptionPane.showMessageDialog(null, "el primer numero es menor a 100");
        } else if (n4 > 5000) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor a 5000");
        }

        if (n5 < 0) {
            JOptionPane.showMessageDialog(null, "el primer numero es negativo");
        } else if (n5 < 100) {
            JOptionPane.showMessageDialog(null, "el primer numero es menor a 100");
        } else if (n5 > 5000) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor a 5000");
        }

        if (n6 < 0) {
            JOptionPane.showMessageDialog(null, "el primer numero es negativo");
        } else if (n6 < 100) {
            JOptionPane.showMessageDialog(null, "el primer numero es menor a 100");
        } else if (n6 > 5000) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor a 5000");
        }

        if (n7 < 0) {
            JOptionPane.showMessageDialog(null, "el primer numero es negativo");
        } else if (n7 < 100) {
            JOptionPane.showMessageDialog(null, "el primer numero es menor a 100");
        } else if (n7 > 5000) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor a 5000");
        }

        if (n8 < 0) {
            JOptionPane.showMessageDialog(null, "el primer numero es negativo");
        } else if (n8 < 100) {
            JOptionPane.showMessageDialog(null, "el primer numero es menor a 100");
        } else if (n8 > 5000) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor a 5000");
        }

        if (n9 < 0) {
            JOptionPane.showMessageDialog(null, "el primer numero es negativo");
        } else if (n9 < 100) {
            JOptionPane.showMessageDialog(null, "el primer numero es menor a 100");
        } else if (n9 > 5000) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor a 5000");
        }

        if (n10 < 0) {
            JOptionPane.showMessageDialog(null, "el primer numero es negativo");
        } else if (n10 < 100) {
            JOptionPane.showMessageDialog(null, "el primer numero es menor a 100");
        } else if (n10 > 5000) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor a 5000");
        }*/ 