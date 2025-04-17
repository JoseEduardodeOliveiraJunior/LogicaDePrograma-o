import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome teacher Cainã");

        System.out.println("Digite seu numero:");
        int N= scanner.nextInt();


        int fatorial = 1;
        String expr = N+ "! = ";

        for (int i = N; i >= 1; i--) {
            fatorial *= i;
            expr += i;

            if (i > 1) {
                expr += " x ";
            }
        }

        expr+= " = " + fatorial;

        System.out.println(expr);




         }
    }
