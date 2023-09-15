import java.util.Scanner;
public class ex010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("N: ");
        int n = teclado.nextInt();
        System.out.println("N1: ");
        int n1 = teclado.nextInt();
        System.out.println("N2: ");
        int n2 = teclado.nextInt();
        if (n > n1 && n < n2)
            System.out.println("O N esta no intervalo");
        if (n > n1 && n > n2)
            System.out.println("O N e maior que os outros");
        if (n < n1 && n < n2)
            System.out.println("O N e o menor de todos");


    }
}
