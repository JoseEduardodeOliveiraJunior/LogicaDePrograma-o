import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número: ");
                int n = scanner.nextInt();

                int fatorial = 1;
                for (int i = 1; i <= n; i++) {
                    fatorial *= i;
                }

                System.out.println("Fatorial de " + n + " é: " + fatorial);
                scanner.close();
            }
        }


