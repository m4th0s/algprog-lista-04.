import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuario;
        String senha;

        do {
            System.out.println("Digite o nome de usuário: ");
            usuario = sc.nextLine();

            System.out.println("Digite a senha: ");
            senha = sc.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("Erro! A senha não pode ser igual ao nome de usuário.");
                System.out.println("Digite novamente.\n");
            }

        } while (usuario.equals(senha));

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Usuário: " + usuario);

        sc.close();
    }
}