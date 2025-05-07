import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[10];


                System.out.println("Insira 10 números inteiros:");
                for (int i = 0; i < 10; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }


                int maior = numeros[0];
                int menor = numeros[0];
                int posicaoMaior = 0;
                int posicaoMenor = 0;

                for (int i = 1; i < 10; i++) {
                    if (numeros[i] > maior) {
                        maior = numeros[i];
                        posicaoMaior = i;
                    }
                    if (numeros[i] < menor) {
                        menor = numeros[i];
                        posicaoMenor = i;
                    }
                }


                System.out.println("O maior número é: " + maior + ", na posição: " + posicaoMaior);
                System.out.println("O menor número é: " + menor + ", na posição: " + posicaoMenor);

                scanner.close();
            }
        }




