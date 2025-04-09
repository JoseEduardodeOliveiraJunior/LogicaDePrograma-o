import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Qual é o raio do cone: ");
        double raio = in.nextDouble();
        System.out.print("Qual é a altura do cone: ");
        double alt = in.nextDouble();
        double area = (Math.PI *  Math.pow(raio, 2));

        double volume=(area * alt)/3 ;
        System.out.printf("O volume calculado é: %.2f unidades cúbicas.\n", volume);

    }
    }


