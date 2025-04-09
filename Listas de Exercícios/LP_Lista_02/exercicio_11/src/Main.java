import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double temp_celsius;

        System.out.print("coloque o valor em Graus celsius:");

        Scanner in= new Scanner(System.in);
        temp_celsius=in.nextDouble();

        double fa_ren= (temp_celsius*1.8)+32;

        System.out.print("O valor em Fahrenheit é"+fa_ren);

    }
}