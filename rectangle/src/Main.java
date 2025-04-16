import entities.Rectancle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Retangle Width and Height:");
        Rectancle  rectancle = new Rectancle();
        rectancle.width = sc.nextDouble();
        rectancle.height = sc.nextDouble();
        System.out.println("AREA: "+ rectancle.Area());
        System.out.println("PERIMETER: " + rectancle.Perimeter());
        System.out.println("DIAGONAL: " + rectancle.Diagonal());
    sc.close();

    }
}