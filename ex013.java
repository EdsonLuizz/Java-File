import java.util.Scanner;
public class ex013 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero de alunos: ");
        int n = teclado.nextInt();
        int media = 0;
        int notas = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Nota: ");
            notas = teclado.nextInt();
            media += notas;
        }
        media /= n;
        System.out.println("Media: " + media);
    }



}
