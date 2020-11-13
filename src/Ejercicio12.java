import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int n=0;
        int a=0;
        int b=1;
        int valor;
        Scanner teclado=new Scanner(System.in);
        valor=teclado.nextInt();
        for (int i = 0; i < valor; i++) {
            System.out.println(a);
            n=a+b;
            a=b;
            b=n;
        }
    }
}
