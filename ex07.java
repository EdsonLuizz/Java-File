import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("N: ");
        n = teclado.nextInt();
        if (n % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");

    }
}
