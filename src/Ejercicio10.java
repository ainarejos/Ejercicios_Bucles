import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int valor=0;
        int sum=0;
        int cont=0;
        int media;
        while (valor>=0){
            System.out.println("Introduce un valor: ");
            Scanner teclado=new Scanner(System.in);
            valor=teclado.nextInt();
            if (valor>=0){
                sum=sum+valor;
                cont++;
            }
        }
        media=sum/cont;
        System.out.println("La media de todos los valores es: " + media);
    }
}
