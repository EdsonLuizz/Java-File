import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        double x = teclado.nextDouble();
        double decimal = x - Math.floor(x);
        if (decimal < 0.49)
            System.out.println("Arredondado para baixo: " + Math.floor(x));
        else
            System.out.println("Arredondado para cima " + Math.ceil(x));
    }
}
