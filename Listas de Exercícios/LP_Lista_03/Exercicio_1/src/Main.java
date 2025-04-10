import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double N;

        System.out.print("Coloque seu numero aqui:");
        N = in.nextDouble();

        if (N >= 0) {
            System.out.print("A raiz quadrada é:"+  Math.sqrt(N));

        } else {

            System.out.println("Valor Inválido!");
        }

    }
}


