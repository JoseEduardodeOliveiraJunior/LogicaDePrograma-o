import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double pole;

        System.out.print("coloque seu numero em polegadas:");

        Scanner in= new Scanner(System.in);
        pole=in.nextDouble();

        double transform= pole*25.4;

        System.out.print(transform+"milimetros");

    }
}