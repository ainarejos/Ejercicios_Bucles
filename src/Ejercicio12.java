import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int n;
        int a=0;
        int b=1;
        Scanner teclado=new Scanner(System.in);
        n=teclado.nextInt();
        for (int i = 0; i < n; i++) {
            int sum=b+a;
            a=b;
            b=sum;
            System.out.println(b);
        }
    }
}
