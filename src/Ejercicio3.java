public class Ejercicio3 {
    public static void main(String[] args) {
        int i=0;
        int a=5;
        int b=0;
        int resl;
        do {
            resl=b%a;
            if (resl==0)
                System.out.println(b);
            b++;
            i++;
        }while (i<=100);
    }
}
