import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    Triangle x,y;

    x = new Triangle();
    y = new Triangle();

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe os valores do Triângulo X");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();
    System.out.println("Informe os valores do Triângulo Y");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double areaX = x.area();
    double areaY = y.area();

    System.out.println("Área do Triângulo Y "  + areaX);
    System.out.println("Area do Triângulo Y " + areaY);
    if (areaY>areaX) {
        System.out.println("Área maior é Y : " + areaY);
    } else {
            System.out.println("Área maior é X : " + areaX);
        }
        sc.close();
    }
}