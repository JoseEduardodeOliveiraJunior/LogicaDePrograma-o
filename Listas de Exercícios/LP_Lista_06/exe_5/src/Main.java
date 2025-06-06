import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.print("Digite o número que deseja buscar: ");
        int valor = scanner.nextInt();

        int inicio = 0;
        int fim = numeros.length - 1;
        int posicao = -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (numeros[meio] == valor) {
                posicao = meio;
                break;
            } else if (numeros[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (posicao != -1) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não encontrado.");
        }

    }
}
