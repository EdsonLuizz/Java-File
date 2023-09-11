import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, perimetro, area;
        System.out.print("Digite o raio: ");
        if (teclado.hasNextDouble()) {
            raio = teclado.nextDouble();
            perimetro = 2 * 3.14 * raio;
            area = 3.14 * raio * raio; // Corrigi o cálculo da área
            System.out.printf("Área = %.2f\nPerímetro = %.2f", area, perimetro);
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número válido.");
        }
    }
}
