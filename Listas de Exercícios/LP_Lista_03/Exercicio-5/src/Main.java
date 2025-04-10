import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double N1;
        double N2;
        char a = 'A';
        char b = 'B';
        char c = 'C';
        char d = 'D';

        System.out.println("Coloque a primeira nota:");
        N1 = in.nextDouble();
        System.out.println("Coloque a segunda nota:");
        N2 = in.nextDouble();

        double media = (N1 + N2) / 2;
        System.out.println("A sua Media é" + media);

        if (media >= 8) {
            System.out.println("letra" + a);
        } else if (media >= 7) {
            System.out.println("letra" + b);
        } else if (media >= 5) {
            System.out.println("letra" + c);
        } else if (media < 5) {
            System.out.println("letra" + d);
        }
    }
}