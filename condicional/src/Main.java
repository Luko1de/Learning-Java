import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("Que horas são?");
        hora = sc.nextInt();
        if (hora<12) {
            System.out.println("Bom dia");
        } else {
            if (hora > 12 && hora < 18){
                System.out.println("Boa tarde");
            } else
                if(hora>18){
                   System.out.println("Boa noite"
                );
            }
        }
        }
    }
