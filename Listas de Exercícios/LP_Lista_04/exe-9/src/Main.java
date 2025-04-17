import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String jogarNovamente = "s";

        for (; jogarNovamente.equalsIgnoreCase("s"); ) {
            boolean errou = false;

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.printf("Quanto é %d x %d? ", i, j);

                    int resposta = scanner.nextInt();

                    if (resposta != i * j) {
                        System.out.println(" Você errou! Fim de jogo.");
                        errou = true;
                        break;
                    }
                }
                if (errou) break;
            }

            if (!errou) {
                System.out.println("Parabéns! Você acertou toda a tabuada!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            jogarNovamente = scanner.next();
        }

        System.out.println("👋 Obrigado por jogar!");
        scanner.close();
    }
}





