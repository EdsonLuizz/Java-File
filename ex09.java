import java.util.Scanner;
import java.lang.Math;
public class ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float x;
        System.out.println("Digite um numero qualquer: ");
        x = teclado.nextFloat();
        if (x % 10.0 > 0.5)
            x = (x / 10) + 1;
        else
            x = (x / 10) - 1;
        System.out.println(x);
    }
}
