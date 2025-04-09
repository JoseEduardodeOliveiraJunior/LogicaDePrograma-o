import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;
        System.out.println("Coloque um numero inteiro:");

        Scanner in= new Scanner(System.in);
        number= in.nextInt();

        int resul= number*2;
        System.out.println("o dobro é"+resul);
    }
}