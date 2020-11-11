import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            int a;
            System.out.println("Introduce un valor");
            Scanner teclado=new Scanner(System.in);
            a=teclado.nextInt();
            int Cuadrado=a*a;
            int Cubo=a*a*a;
            System.out.println("Los valores son los siguientes \n" + a + "\t" + Cuadrado + "\t" + Cubo );
        }
    }
}
