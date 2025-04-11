import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros:");
        System.out.println("numero1:");
        int numero= scanner.nextInt();
        int maior= numero;
        int menor= numero;

        for (int i = 2; i <= 5; i++) {
            System.out.print("Número" + i + ": ");

            numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            } else if (numero<menor) {
                    menor=numero;
            }

        }

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        scanner.close();


    }
}