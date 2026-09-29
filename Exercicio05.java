import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char repetir;

        do {
            double a, b, taxaA, taxaB;
            int anos = 0;

            System.out.print("População A: ");
            a = sc.nextDouble();

            System.out.print("População B: ");
            b = sc.nextDouble();

            System.out.print("Taxa de crescimento A (%): ");
            taxaA = sc.nextDouble();

            System.out.print("Taxa de crescimento B (%): ");
            taxaB = sc.nextDouble();

            while (a < b) {
                a = a + (a * taxaA / 100);
                b = b + (b * taxaB / 100);
                anos++;
            }

            System.out.println("Anos necessários: " + anos);

            System.out.print("Deseja repetir? (s/n): ");
            repetir = sc.next().charAt(0);

        } while (repetir == 's');

        sc.close();
    }
}