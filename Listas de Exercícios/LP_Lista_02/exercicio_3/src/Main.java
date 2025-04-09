import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number;

        System.out.println("coloque o seu numero:");

        Scanner in= new Scanner(System.in);
        number= in.nextDouble();


        double result= number/5;

        System.out.println("A quinta parte é "+result);
    }
}