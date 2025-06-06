import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String texto = scanner.nextLine();

        String textoLimpo = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c != ' ') {
                textoLimpo += Character.toLowerCase(c);
            }
        }

        boolean ehPalindromo = true;
        int n = textoLimpo.length();
        for (int i = 0; i < n / 2; i++) {
            if (textoLimpo.charAt(i) != textoLimpo.charAt(n - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}


