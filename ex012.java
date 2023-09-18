import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A: ");
        int a = teclado.nextInt();
        System.out.println("B: ");
        int b = teclado.nextInt();

        int media = 0, soma = 0;
        int cont = 0;

        if (a < b) {
            for (int i = a; i <= b; i ++) {
                if (i % 2 == 0) {
                    if(cont == 0){
                        System.out.println("\nPares: ");
                    }
                    System.out.println(i);
                    cont++;
                    media += i;
                    soma += i;
                }
            }
        }
        else if (b < a){
            for(int i = b; i < a; i++)
                System.out.println(i);
        }
        media = media / cont;
        System.out.println("\nMedia: " + media);
        System.out.println("Soma: " + soma);
    }
}
