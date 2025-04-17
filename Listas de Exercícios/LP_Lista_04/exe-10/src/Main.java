import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n número de termos: ");
        int n = scanner.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");

        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        }
    }
