import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float distancia, gasolina, tempo, vm, cc;
        System.out.println("Distancia percorrida: ");
        distancia = teclado.nextFloat();
        System.out.println("Quantidade de gasolina consumida(Litros): ");
        gasolina = teclado.nextFloat();
        System.out.println("Tempo gasto(hHoras): ");
        tempo = teclado.nextFloat();
        vm = distancia / tempo;
        cc = distancia / gasolina;
        System.out.printf("Velocidade media: %.2f\nConsumo de combustivel: %.2f", vm, cc);
    }
}
