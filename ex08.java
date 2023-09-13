import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double kilowatt, total;
        int kw;
        System.out.println("Qual a quantidade de kilowatts consumidos na sua casa? ");
        kw = teclado.nextInt();
        System.out.println("Digite o valor do kilowatt: ");
        kilowatt = teclado.nextDouble();
        total = kw * kilowatt;
        if (kw < 150)
            total *= 0.10;

    }
}
