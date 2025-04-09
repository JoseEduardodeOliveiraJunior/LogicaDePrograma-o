import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        double a;
        double b;

        System.out.println("Coloque o coeficiente a:");
        a= in.nextDouble();
        System.out.println("Coloque o coeficiente b:");
        b= in.nextDouble();

        double x=-(b)/a;

        System.out.println("O valor da solução é:"+x);

    }
}