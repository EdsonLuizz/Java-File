import java.io.PrintStream;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        int t, segundos, minutos, horas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos: ");
        t = teclado.nextInt();
        horas = t / 3600;
        minutos = (t % 3600) / 60;
        segundos = (t % 3600) % 60;
        System.out.printf("Horas: %d\nMinutos: %d\nSegundos: %d", horas, minutos, segundos);
    }
}
