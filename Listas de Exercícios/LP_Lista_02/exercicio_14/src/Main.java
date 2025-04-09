import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double base;
        double alt;


        System.out.print("Qual é a base do triangulo?");
        System.out.print("Qual é a altura do triangulo?");

        Scanner in= new Scanner(System.in);
        base=in.nextDouble();
        alt=in.nextDouble();
        double area=(base*alt)/2;

        System.out.print("A area do seu triangulo é"+area);

    }
}