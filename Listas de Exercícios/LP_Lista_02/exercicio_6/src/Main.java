import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        double km_s;
        double metros_s;

        System.out.println("coloque seus Metros:");

        Scanner in= new Scanner(System.in);
        metros_s= in.nextDouble();

        double km_h= metros_s*3.6;

        System.out.println(km_h+"Km/s");

    }
}