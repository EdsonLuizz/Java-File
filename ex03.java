import java.util.Arrays;
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, percentual, resultado;
        System.out.print("Digite o seu salario: ");
        salario = teclado.nextFloat();
        System.out.print("Digite o percentual de aumento: ");
        percentual = teclado.nextFloat();
        resultado = (salario * (percentual / 100.0)) + salario;
        System.out.println("resultado = " + resultado);
    }
}
