import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = in.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = in.nextDouble();


        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Digite a opção (1 a 4): ");
        int opcao = in.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("Resultado: %.2f + %.2f = %.2f\n", numero1, numero2, numero1 + numero2);
                break;
            case 2:
                System.out.printf("Resultado: %.2f - %.2f = %.2f\n", numero1, numero2, numero1 - numero2);
                break;
            case 3:
                System.out.printf("Resultado: %.2f * %.2f = %.2f\n", numero1, numero2, numero1 * numero2);
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.printf("Resultado: %.2f / %.2f = %.2f\n", numero1, numero2, numero1 / numero2);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }
}