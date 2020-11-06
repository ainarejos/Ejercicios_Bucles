import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int codigo;
        int i=1;
        int cont=4;
        int respuesta=4534;
        System.out.println("Introduce el codigo");
        Scanner teclado = new Scanner(System.in);
        codigo = teclado.nextInt();
        while (!(codigo==respuesta)&&cont>1){
            do {
                cont-=i;
                System.out.println("ERROR Introuce de nuevo la contraseña: " + " Tienes " + cont +" iNtentos");
                codigo = teclado.nextInt();
            }while (cont<4&&codigo>10000&&cont>1);
            }
        if (codigo==respuesta){
            System.out.println("Contraseña correcta");
        }
    }
}
