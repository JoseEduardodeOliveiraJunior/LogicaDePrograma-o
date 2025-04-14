import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();


        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Números naturais entre " + a + " e " + b + ":");

        for (int i = a + 1; i < b; i++) {
            if (i >= 0) {
                System.out.print(i + " ");
            }
        }


        }
}