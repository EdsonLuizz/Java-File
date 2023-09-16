import java.util.Objects;
import java.util.Scanner;
public class ex011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um caracter de operacao[+, -, *, /]: ");
        String c = teclado.nextLine();
        System.out.println("N1: ");
        double n1 = teclado.nextDouble();
        System.out.println("N2: ");
        double n2 = teclado.nextDouble();
        double sub = n1 - n2;
        double soma = n1 + n2;
        double mul = n1 * n2;
        double div = n1 / n2;
        if (Objects.equals(c, "+"))
            System.out.println("a soma de n1 e n2 = " + soma);
        if(Objects.equals(c, "*"))
            System.out.println("a multiplicacao entre n1 e n2 e = " + mul);
        if (Objects.equals(c, "/"))
            System.out.println("a divisao entre n1 e n2 e = " + div);
        if (Objects.equals(c, "-"))
            System.out.println("a subtracao de n1 e n2 e = " + sub);
    }
}
