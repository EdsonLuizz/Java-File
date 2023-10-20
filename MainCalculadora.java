import java.util.Scanner;
public class MainCalculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite o primeiro valor: ");
        int v1 = teclado.nextInt();
        System.out.println("Digite o segundo valor: ");
        int v2 = teclado.nextInt();

        System.out.println("subtracao dos numeros: " + calc.subtracaoDosNumeros(v1, v2));
        System.out.println("soma dos numeros: " + calc.somaDosNumeros(v1, v2));

    }
}
