import java.util.Scanner;
public class ex014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float notas = 0,soma = 0, maior = 0, menor = 0;
        int qnt = 0;
        while(notas != -1) {
            System.out.println("Notas: ");
            notas = teclado.nextFloat();
            if (notas != -1) {
                soma += notas;
                qnt++;
                if (qnt == 1) {
                    maior = notas;
                    menor = notas;
                } else {
                    if (notas > maior) {
                        maior = notas;
                    }
                    if (notas < menor) {
                        menor = notas;
                    }
                }
            }
        }
        float media = soma / qnt;
        System.out.println("Quantidade de alunos: " + qnt);
        System.out.println("Media da turma: " + media);
        System.out.println("Maior nota da turma: " + maior);
        System.out.println("Menor nota da turma: " + menor);
    }
}
