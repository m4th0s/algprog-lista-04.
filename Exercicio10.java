import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int fim = sc.nextInt();

        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}