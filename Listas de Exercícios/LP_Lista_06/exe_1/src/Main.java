import java.util.Scanner;

public class Main {

    public static int somarAteN(int N) {
        if (N <= 0) {
            System.out.println("Erro: N deve ser maior que 0.");
            return 0;
        }

        int soma = 0;

        for (int i = 1; i <= N; i++) {
            soma = soma + i;
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int resultado = somarAteN(numero);
        System.out.println("A soma de 1 até " + numero + " é: " + resultado);

    }
}
