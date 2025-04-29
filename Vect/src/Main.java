import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            System.out.print("Quantos numeros voce vai digitar? ");
            N = sc.nextInt();
        } while (N <= 0 || N > 10);

        int[] numeros = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < N; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
