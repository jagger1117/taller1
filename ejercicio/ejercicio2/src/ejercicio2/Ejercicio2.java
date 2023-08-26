
package ejercicio2;
public class Ejercicio2 {
    public static void main(String[] args) {
        int suma= 0;
        short x = 20;
        suma= suma + x;
        short y=40;
        x = (short) (x + Math.pow(y, 2));
        suma= suma + (x/y);
        System.out.println("EL VALOR DE LA SUMA ES " + suma);
    
    }
    
}
