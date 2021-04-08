class Arreglos{
    public static void main(String[] args) {
        int[] n = {31, 2, 27, 14, 85, 61, 78};

        float promedio = 0;

        for (int i = 0; i<n.length; i++) {
            promedio += n[i];
        }
 
        for (int i = 0; i<n.length; i++) {
            System.out.println("n = " + n[i]);
        }
 
        System.out.println("El promedio es = " + promedio/n.length);
 
    }
}