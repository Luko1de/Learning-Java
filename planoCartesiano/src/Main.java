import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto Quadrante");
            }
             x = sc.nextInt();
             y = sc.nextInt();
        }
        sc.close();
    }
}


