import java.util.Scanner;;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (x): ");
        int x = scanner.nextInt();

        System.out.print("Digite o expoente (y >= 0): ");
        int y = scanner.nextInt();

        if (y < 0) {
            System.out.println("O expoente deve ser maior ou igual a zero.");
        } else {
            long resultado = 1;
            for (int i = 0; i < y; i++) {
                resultado *= x;
            }
            System.out.println(x + " elevado a " + y + " é: " + resultado);
        }

        scanner.close();
    }
}

