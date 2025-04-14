import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do produto");
       int codigo = sc.nextInt();
       System.out.println("Digite a quantidade do produto");
        int quantidade = sc.nextInt();
        double total;

        if (codigo == 1){
            total = quantidade*4;
        } else if (codigo == 2){
            total = quantidade*4.5;
        } else if (codigo == 3){
            total = quantidade*5;
        } else if(codigo == 4){
            total = quantidade*2;
        } else {
            total = quantidade*1.5;
        }
        System.out.println("Valor a ser pago: " + total);
    }
}