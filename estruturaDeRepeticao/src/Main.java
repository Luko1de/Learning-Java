import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha de 4 digitos");

        int senha = sc.nextInt();

        while (senha != 2004) {
            System.out.println("Senha Incorreta tente novamente");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}