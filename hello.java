import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, soma;
        System.out.print("Informe um valor: ");
        n1 = teclado.nextInt();
        System.out.print("Informe o outro valor: ");
        n2 = teclado.nextInt();
        soma = n1 + n2;
        System.out.printf("soma: %.1f", soma);
    }
}
