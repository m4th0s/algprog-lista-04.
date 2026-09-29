import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estado;

        do {
            System.out.println("Nome: ");
            nome = sc.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.println("Idade: ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Salário: ");
            salario = sc.nextDouble();
        } while (salario <= 0);

        do {
            System.out.println("Sexo (f/m): ");
            sexo = sc.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.println("Estado civil (s/c/v/d): ");
            estado = sc.next().charAt(0);
        } while (estado != 's' && estado != 'c' &&
                 estado != 'v' && estado != 'd');

        System.out.println("Cadastro realizado!");

        sc.close();
    }
}