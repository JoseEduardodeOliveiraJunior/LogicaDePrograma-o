import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        boolean Primo = true;

        if (num <= 1) {
            Primo = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    Primo = false;
                    break;
                }
            }
        }

        if (Primo) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }





    }
    }
