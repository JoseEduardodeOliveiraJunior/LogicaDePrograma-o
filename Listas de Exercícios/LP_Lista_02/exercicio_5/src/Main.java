import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double km_h;

        System.out.println("coloque seu Km:");

        Scanner in= new Scanner(System.in);
        km_h= in.nextDouble();

        double metros_s= km_h/3.6;

        System.out.println(metros_s+"Metros");

    }
}