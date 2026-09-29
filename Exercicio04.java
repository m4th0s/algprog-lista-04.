public class Exercicio04 {

    public static void main(String[] args) {

        double a = 80000;
        double b = 200000;
        int anos = 0;

        while (a < b) {
            a = a + (a * 0.03);
            b = b + (b * 0.015);
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos.");
        System.out.println("População A: " + a);
        System.out.println("População B: " + b);
    }
}