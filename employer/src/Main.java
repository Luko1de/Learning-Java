import Entities.Employer;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        Employer employer = new Employer();

        System.out.println("Name");
        employer.name = sc.nextLine();

        System.out.println("Salary");
        employer.grossSalary = sc.nextDouble();

        System.out.println("Tax");
        employer.tax =  sc.nextDouble();

        System.out.println(employer);

        System.out.println("Which percent u want to increse in salary");

        int percent = sc.nextInt();
        employer.IncreseSalary(percent);

        System.out.println(employer);

    }
}