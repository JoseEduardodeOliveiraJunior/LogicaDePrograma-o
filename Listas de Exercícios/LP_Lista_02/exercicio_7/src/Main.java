import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mile;

        System.out.print("coloque seu milímetros:");

        Scanner in= new Scanner(System.in);
        mile=in.nextDouble();

        double transform= mile/25.4;

        System.out.print(transform+"polegadas, aproximado");
    }
}