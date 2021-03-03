
public class Evalua {
    public Evalua(int a) {  
        if (a < 0) {
            System.out.println("el numero " + a + " es negativo");
        } else if (a < 100) {
            System.out.println("el numero " + a + " es menor a 100");
        } else if (a > 5000) {
            System.out.println("el numero " + a + " es mayor a 5000");
        }
    }
}
