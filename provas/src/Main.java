import Entitites.Account;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number");
        int numAccount = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Holder Name");
        String name = sc.nextLine();

        System.out.println("Is There a initial  deposit (y/n)");
        double balance = 0.0;

        String answer = sc.nextLine();
        Account account;
        if (answer.equals("y")){
            balance = sc.nextDouble();
            account = new Account(name, numAccount, balance);
        } else if (answer.equals("n")){
            account = new Account(name, numAccount);
        }
        else{
            account = new Account();
        }

        System.out.println("Account Data");
        System.out.println(account.toString());

        System.out.println("Enter Deposite Amount");

        Double deposite = sc.nextDouble();
        account.Deposite(deposite);

        System.out.println("Account Data");
        System.out.println(account.toString());

        System.out.println("");
        System.out.println("Enter WithDraw Amount ");

        Double withDraw = sc.nextDouble();
        account.WithDraw(withDraw);

        System.out.println("Account Data");
        System.out.println(account.toString());

        sc.close();
    }
}